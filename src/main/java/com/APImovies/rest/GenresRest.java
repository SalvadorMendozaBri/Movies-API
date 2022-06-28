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

import com.APImovies.DAO.GenresDAO;
import com.APImovies.model.Genres;

@RestController
@RequestMapping("genres")
public class GenresRest {
	
	@Autowired
	private GenresDAO genresdao;
	
	@GetMapping("/listar")
	public List<Genres> listar() {
		return genresdao.findAll();
	}
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Genres genre) {
		genresdao.save(genre);
	}

	@PutMapping("/actualizar")
	public String actualizar(@RequestBody Genres genre) {
		if (genresdao.existsById(genre.getId())) {
			genresdao.save(genre);
			return "OK";
		}

		return "Error, este elemento no existe en la base de datos";
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminar(@PathVariable Integer id) {
		if (genresdao.existsById(id)) {
			genresdao.deleteById(id);
			return "OK";
		}

		return "Error, este elemento no existe en la base de datos";
	}

}
