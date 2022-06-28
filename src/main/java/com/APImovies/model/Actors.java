package com.APImovies.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Actors {

	@Id
	private Integer id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private Integer rating;
	
	@ManyToOne
	@JoinColumn(name="favorite_movie_id", referencedColumnName = "id")
	private Movies favorite_movie;
	
	@ManyToMany(mappedBy = "actors")
	private List<Movies> movies;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Movies getFavorite_movie() {
		return favorite_movie;
	}

	public void setFavorite_movie(Movies favorite_movie) {
		this.favorite_movie = favorite_movie;
	}
	
	
	
}
