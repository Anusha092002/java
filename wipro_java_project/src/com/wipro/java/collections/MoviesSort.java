/**
 * 
 */
package com.wipro.java.collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class MoviesSort implements Comparable<MoviesSort>{
	private Movies movie;

	/**
	 * @return the movie
	 */
	public Movies getMovie() {
		return movie;
	}
	public MoviesSort(Movies movie) {
		this.movie=movie;
	}

	@Override
    public int compareTo(MoviesSort other) {
        return Double.compare(this.movie.getRating(), other.getMovie().getRating());
    }
	public static void main(String[] args) {
        // Create a list of Movies POJOs
        List<Movies> movieList = new ArrayList<>();
        movieList.add(new Movies("Inception", 8.8, 2010));
        movieList.add(new Movies("The Dark Knight", 9.0, 2008));
        movieList.add(new Movies("Interstellar", 8.6, 2014));
        movieList.add(new Movies("The Matrix", 8.7, 1999));

        // Convert Movies POJOs into MoviesComparable objects
        List<MoviesSort> comparableMovies = new ArrayList<>();
        for (Movies movie : movieList) {
            comparableMovies.add(new MoviesSort(movie));
        }

        // Sort the movies by rating using Comparable
        Collections.sort(comparableMovies);

        // Print sorted list of movies
        for (MoviesSort movieComparable : comparableMovies) {
            System.out.println(movieComparable);
        }
    }
	@Override
	public String toString() {
		return "Name: "+movie.getName()+" Rating: "+movie.getRating()+" Year: "+movie.getYear();
	}
	

}
