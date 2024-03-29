package com.dguinter.Marcenaria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dguinter.Marcenaria.entities.Category;
import com.dguinter.Marcenaria.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){
		return repository.findAll();
		}
}
