package com.APImovies.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Movies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String title;
	
	@Column
	private float rating;
	
	@Column
	private Integer awards;
	
	@Column
	private Date release_date;
	
	@Column
	private Integer length;
	
	@ManyToOne
	@JoinColumn(name="genre_id", referencedColumnName = "id")
	private Genres genre_id;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "actor_movie",
			joinColumns = { @JoinColumn(name="movie_id")},
			inverseJoinColumns = {@JoinColumn(name="actor_id")}	
			)
	List<Actors> actors;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Integer getAwards() {
		return awards;
	}

	public void setAwards(Integer awards) {
		this.awards = awards;
	}

	public Date getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Genres getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(Genres genre_id) {
		this.genre_id = genre_id;
	}

	
	
	
	
	
}
