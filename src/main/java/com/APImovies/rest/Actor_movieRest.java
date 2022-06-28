package com.APImovies.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APImovies.DAO.ActorMovieDAO;
import com.APImovies.model.Actor_movie;

@RestController
@RequestMapping("actor_movie")
public class Actor_movieRest {

	@Autowired
	private ActorMovieDAO actor_moviedao;
	
	@GetMapping("/listar")
	private List<Actor_movie> listar(){
		return actor_moviedao.findAll();
	}
}
