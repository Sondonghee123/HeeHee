package com.shinhan.heehee.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.shinhan.heehee.service.CustomUserDetailsService;
import com.shinhan.heehee.util.JwtUtil;

import io.jsonwebtoken.ExpiredJwtException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class JwtFilter extends OncePerRequestFilter {
	
	JwtUtil jwtUtil;
	CustomUserDetailsService customUserDetailsService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain)
			throws ServletException, IOException {
		String authorizationHeader = null;
		final Cookie[] cookies = httpServletRequest.getCookies();
		
		if (cookies != null && authorizationHeader == null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("Authorization")) {
                	authorizationHeader = cookie.getValue().replaceAll("%20", " ");
                }
            }
        }
		String token = null;
		String userName = null;
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			token = authorizationHeader.substring(7);
			// 토큰 만료 시 로직
			try {
				userName = jwtUtil.extractUsername(token);
			} catch (ExpiredJwtException ex) {
				Cookie tokenCookie = new Cookie("Authorization", null);

				tokenCookie.setMaxAge(0);
				tokenCookie.setPath("/");
				httpServletResponse.addCookie(tokenCookie);
				
				ex.printStackTrace();
			}
		}
		if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = customUserDetailsService.loadUserByUsername(userName);
			
			if (jwtUtil.validateToken(token, userDetails)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(httpServletRequest));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
				httpServletRequest.setAttribute("userNickName", customUserDetailsService.findNickName(userName).get("NICKNAME"));
			} else {
				Cookie tokenCookie = new Cookie("Authorization", null);

				tokenCookie.setMaxAge(0);
				tokenCookie.setPath("/");
				httpServletResponse.addCookie(tokenCookie);
			}
		}
		filterChain.doFilter(httpServletRequest, httpServletResponse);
	}

}
