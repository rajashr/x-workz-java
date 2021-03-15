package com.xworkz.movies.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@NoArgsConstructor
@ToString
@Entity
@Table(name="movie_table")


public class MovieDTO {
	public MovieDTO(String name, double duration, int ratings, String genre) {
		super();
		this.name = name;
		this.duration = duration;
		this.ratings = ratings;
		this.genre = genre;
	}
	@Column(name="MOVIE_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int movieId;
	@Column(name="MOVIE_NAME")
private String name;
	@Column(name="MOVIE_DURATION")
private double duration;
	@Column(name="MOVIE_RATINGS")
private int ratings;
	@Column(name="MOVIE_GENRE")
private String genre;
	

}
