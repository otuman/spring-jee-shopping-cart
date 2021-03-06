package com.jerotoma.dao.implemention;

import java.util.List;

import com.jerotoma.dao.ProductDao;
import com.jerotoma.model.Product;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDaoImplementation implements ProductDao {

	@Autowired
	SessionFactory session;
	@SuppressWarnings("unchecked")
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
	    Product product = null;
		List<Product> productList = session.getCurrentSession().createQuery("from Product where id='"+id+"'").list();
		if(!productList.isEmpty() && productList.size() == 1) {
			for(Product p : productList) {
				product = p;
			}
		}
		return product;
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("from Product").list();
	}

	public Product update(Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(product);
		return getProduct(product.getId());
	}

	public int save(Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(product);
		return product.getId();
	}

	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(product);
		return true;
	}

}
