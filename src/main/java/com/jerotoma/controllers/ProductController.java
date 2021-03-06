package com.jerotoma.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    
	@RequestMapping("/shop/products")
	public ModelAndView getProductView() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("shop/products/products");
		view.addObject("title", "Products");
		return view;
		
	}
	
	@RequestMapping("/shop/products/{name}")
	public ModelAndView getSingleProductView() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("shop/products/product-single");
		view.addObject("title", "Product");
		return view;
		
	}
	
	
}
