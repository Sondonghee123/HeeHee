<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.servletContext.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매 내역</title>
<link rel="stylesheet" href="${path}/resources/css/myPage.css">
</head>
<body>
	<header>
		<%@include file="../common/header.jsp"%>
		<%@include file="../mypage/myPage_header.jsp"%>
	</header>
	<section>
		<div class="mypage_container">
			<ul class="menu">
				<li><a href="${path}/salelist">판매내역</a></li>
				<li><a href="${path}/purchaseList">구매내역</a></li>
				<li class="selected">찜</li>
			</ul>
			<form>
				<div class="checkbox">
					<input type="checkbox" name="checkBno" value="">
					<input type="submit" value="삭제" class="btn">
				</div>
				<div class="list">
					<div class="product" onclick="location.href='${path}/productdetail'">
						<img src="${path}/resources/images/보노보노1.jpg">
						<p>보노보노 숲 라잉 쿠션</p>
						<p>10,000원</p>
					</div>
					<div class="product">
						<img src="${path}/resources/images/보노보노2.jpg">
						<p>보노보노 얼굴 쿠션</p>
						<p>10,000원</p>
					</div>
					<div class="product">
						<img src="${path}/resources/images/보노보노3.jpg">
						<p>보노보노 듀얼 고속 무선 충전 거치대</p>
						<p>10,000원</p>
					</div>
					<div class="product">
						<img src="${path}/resources/images/보노보노4.jpg">
						<p>보노보노 인스탁스 미니9</p>
						<p>10,000원</p>
					</div>
					<div class="product">
						<img src="${path}/resources/images/보노보노5.jpg">
						<p>보노보노 더블 범퍼 케이스</p>
						<p>10,000원</p>
					</div>
				</div>
			</form>
		</div>
	</section>

</body>
</html>