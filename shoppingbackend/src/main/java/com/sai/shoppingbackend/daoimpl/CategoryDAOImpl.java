package com.sai.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sai.shoppingbackend.dao.CategoryDAO;
import com.sai.shoppingbackend.dto.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<Category>();
	
	static{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is Some Description for Television");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Some Description for Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is Some Description for Laptop");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	public Category get(Integer id) {
		
		for (Category category : categories) {
			
			if(category.getId()==id)
				return category;
		}
		
		return null;
	}

}
