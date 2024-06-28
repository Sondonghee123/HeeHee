package com.shinhan.heehee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shinhan.heehee.dao.ProductModifyDAO;
import com.shinhan.heehee.dto.response.ProdDetailDTO;
import com.shinhan.heehee.dto.response.ProdDetailImgDTO;
import com.shinhan.heehee.dto.response.ProductCategoryDTO;

@Service
public class ProductModifyService {

	@Autowired
	ProductModifyDAO productModifyDao;
	
	public ProdDetailDTO prodInfo(Integer prodSeq) {
		return productModifyDao.productInfo(prodSeq);
	}
	
	public List<ProdDetailImgDTO> prodImg(Integer prodSeq) {
		return productModifyDao.productImg(prodSeq);
	}
	
	public List<ProductCategoryDTO> category(Integer prodSeq) {
		return productModifyDao.category(prodSeq);
	}
	
	public List<ProductCategoryDTO> detailCategory(String category) {
		return productModifyDao.detailCategory(category);
	}
}