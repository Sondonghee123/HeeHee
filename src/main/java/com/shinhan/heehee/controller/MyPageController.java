package com.shinhan.heehee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.shinhan.heehee.service.DealService;

@Controller
public class MyPageController {
	
    @Autowired
    DealService dealService;

    @GetMapping("/profile")
    public String editProfile() {
        return "/mypage/editProfile";
    }
    @GetMapping("/faqBoard")
    public String faqBoard() {
        return "/mypage/faqBoard";
    }
    @GetMapping("/jjimList")
    public String jjimList() {
        return "/mypage/jjimList";
    }
    @GetMapping("/pointlist")
    public String pointlist() {
        return "/mypage/pointList";
    }
    @GetMapping("/purchasedetail")
    public String purchasedetail() {
        return "/mypage/purchaseDetail";
    }
    @GetMapping("/purchaseList")
    public String purchaseList() {
        return "/mypage/purchaseList";
    }
    @GetMapping("/qnaBoard")
    public String qnaBoard() {
        return "/mypage/qnaBoard";
    }
    @GetMapping("/saledetail")
    public String saledetail() {
        return "/mypage/saleDetail";
    }
    @GetMapping("/saleList")
    public String saleList() {
        return "/mypage/saleList";
    }
}










