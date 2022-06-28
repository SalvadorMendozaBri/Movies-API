package com.APImovies.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APImovies.DAO.GenresDAO;
import com.APImovies.model.Genres;

@RestController
@RequestMapping("genres")
public class GenresRest {
	
	@Autowired
	private GenresDAO genresdao;
	
	@GetMapping("/listar")
	public List<Genres> listar() {
		return genresdao.findAll() ;
	}

}
