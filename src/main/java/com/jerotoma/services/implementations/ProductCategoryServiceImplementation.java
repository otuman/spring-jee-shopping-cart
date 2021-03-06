package com.jerotoma.services.implementations;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerotoma.dao.ProductCategoryDao;
import com.jerotoma.model.ProductCategory;
import com.jerotoma.services.ProductCategoryService;

@Service
@Transactional
public class ProductCategoryServiceImplementation implements ProductCategoryService {

	@Autowired
	ProductCategoryDao productCategoryDao;
	
	@Override
	public ProductCategory getProductCategory(int id) {
		// TODO Auto-generated method stub
		return productCategoryDao.getProductCategory(id);
	}

	@Override
	public List<ProductCategory> getProductCategories() {
		// TODO Auto-generated method stub
		return productCategoryDao.getProductCategories();
	}

	@Override
	public List<ProductCategory> getProductCategories(int product_id) {
		// TODO Auto-generated method stub
		return productCategoryDao.getProductCategories(product_id);
	}

	@Override
	public ProductCategory update(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.update(productCategory);
	}

	@Override
	public int save(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.save(productCategory);
	}

	@Override
	public boolean delete(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return productCategoryDao.delete(productCategory);
	}

}
