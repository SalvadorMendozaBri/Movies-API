package com.APImovies.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APImovies.model.Actors;

public interface ActorsDAO extends JpaRepository<Actors, Integer>{

}
