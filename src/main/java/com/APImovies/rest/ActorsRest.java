package com.APImovies.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APImovies.DAO.ActorsDAO;
import com.APImovies.model.Actors;

@RestController
@RequestMapping("actors")
public class ActorsRest {
	
	@Autowired
	private ActorsDAO actorsdao;
	
	@GetMapping("/listar")
	private List<Actors> listar()
	{
		return actorsdao.findAll();
	}

}
