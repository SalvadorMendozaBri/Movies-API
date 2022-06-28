package com.APImovies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Actor_movie {
	
	@Id
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="movie_id", referencedColumnName = "id")
	private Movies movie;
	
	@ManyToOne
	@JoinColumn(name="actor_id", referencedColumnName = "id")
	private Actors actor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Movies getMovie() {
		return movie;
	}

	public void setMovie(Movies movie) {
		this.movie = movie;
	}

	public Actors getActor() {
		return actor;
	}

	public void setActor(Actors actor) {
		this.actor = actor;
	}
	
	
}
