package com.shinhan.heehee.dto.request;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminCategoryDTO {
	
	//번호 - PRODUCT_CATEGORY
	private int productCateSeq;
	
	//카테고리 - PRODUCT_CATEGORY
	private String category;
	
	//세부 카테고리 - PRODUCT_CATEGORY
	private String detailCategory;
	
	//작성자ID - PRODUCT_CATEGORY
	private String id;
	
	//작성일 - PRODUCT_CATEGORY
	private Date createDate;
	
	//페이징 처리를 위한 변수
	private int size;
	private int page;
	
	//삭제용 - 파라미터 1개 생성자 추가
	public AdminCategoryDTO(int productCateSeq) {
		this.productCateSeq = productCateSeq;
	}
	
	//신규등록용 - 파라미터 3개 생성자 추가
	public AdminCategoryDTO(String category, String detailCategory, String id) {
		this.category = category;
		this.detailCategory = detailCategory;
		this.id = id;
	}
	
	//수정용 - 파라미터 4개 생성자 추가
	public AdminCategoryDTO(int productCateSeq, String category, String detailCategory, String id) {
		this.productCateSeq = productCateSeq;
		this.category = category;
		this.detailCategory = detailCategory;
		this.id = id;
	}
}
