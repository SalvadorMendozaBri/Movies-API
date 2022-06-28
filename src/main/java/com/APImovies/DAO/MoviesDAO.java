package com.APImovies.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APImovies.model.Movies;

public interface MoviesDAO extends JpaRepository<Movies, Integer> {
	List<Movies> getByTitle(String title);
}
