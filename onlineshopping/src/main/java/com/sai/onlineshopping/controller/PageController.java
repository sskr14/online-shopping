package com.sai.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sai.shoppingbackend.dao.CategoryDAO;
import com.sai.shoppingbackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO; 
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true );
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true );
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true );
		return mv;
	}
	
	/*Method to load all products based on category*/
	
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllCategories()
	{
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts", true );
		return mv;
	}
	
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showAllCategories(@PathVariable("id") Integer id)
	{
		ModelAndView mv = new ModelAndView("page");
		
		Category category=null;
		category=categoryDAO.get(id);
		mv.addObject("title", category.getName());
		mv.addObject("category", category);
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickCategoryProducts", true );
		return mv;
	}
	
}
