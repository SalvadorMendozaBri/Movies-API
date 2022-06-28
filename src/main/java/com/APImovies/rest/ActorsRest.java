package com.APImovies.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APImovies.DAO.ActorsDAO;
import com.APImovies.model.Actors;
import com.APImovies.model.Movies;

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

	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Actors actor) {
		actorsdao.save(actor);
	}

	@PutMapping("/actualizar")
	public String actualizar(@RequestBody Actors actor) {
		if (actorsdao.existsById(actor.getId())) {
			actorsdao.save(actor);
			return "OK";
		}

		return "Error, este elemento no existe en la base de datos";
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		if (actorsdao.existsById(id)) {
			actorsdao.deleteById(id);
			return "OK";
		}

		return "Error, este elemento no existe en la base de datos";
	}
}
