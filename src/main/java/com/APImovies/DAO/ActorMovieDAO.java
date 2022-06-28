package com.APImovies.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.APImovies.model.Actor_movie;

public interface ActorMovieDAO extends JpaRepository<Actor_movie, Integer> {

}
