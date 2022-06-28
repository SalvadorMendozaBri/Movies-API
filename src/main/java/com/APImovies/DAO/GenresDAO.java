package com.APImovies.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APImovies.model.Genres;

public interface GenresDAO extends JpaRepository<Genres, Integer>{

}
