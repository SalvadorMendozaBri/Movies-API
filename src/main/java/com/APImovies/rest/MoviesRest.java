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

import com.APImovies.DAO.MoviesDAO;
import com.APImovies.model.Movies;

@RestController
@RequestMapping("movies")
public class MoviesRest {

	@Autowired
	private MoviesDAO moviesdao;

	@GetMapping("/listar")
	public List<Movies> listar() {
		return moviesdao.findAll();
	}

	@PostMapping("/guardar")
	public void guardar(@RequestBody Movies movie) {
		moviesdao.save(movie);
	}

	@PutMapping("/actualizar")
	public String actualizar(@RequestBody Movies movie) {
		if (moviesdao.existsById(movie.getId())) {
			moviesdao.save(movie);
			return "OK";
		}

		return "Error, este elemento no existe en la base de datos";
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		if (moviesdao.existsById(id)) {
			moviesdao.deleteById(id);
			return "OK";
		}

		return "Error, este elemento no existe en la base de datos";
	}

}
