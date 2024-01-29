package com.dguinter.Marcenaria.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dguinter.Marcenaria.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = new ArrayList<>();
		list.add(new Category(1L, "Cadeira"));
		list.add(new Category(2L, "Mesa"));
		list.add(new Category(3L, "Floreira"));
		list.add(new Category(4L, "Caixa de areia"));
		list.add(new Category(5L, "Mesa infantil"));
		return ResponseEntity.ok().body(list);
	}
}
