package com.xworkz.movies.dao;

import com.xworkz.movies.dto.MovieDTO;

public interface MoviesDAO {
	public void saveMovie(MovieDTO movieDTO);
	public void updateMovie(int movieId);
	public void readMovie(int movieId);
	public void deleteMovie(int movieId);

}
