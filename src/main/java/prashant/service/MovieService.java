package prashant.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prashant.Dao.MRepo;
import prashant.model.Movie;

@Service
public class MovieService {
	@Autowired
	private MRepo  movieRepository;
	
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	public Optional<Movie> singleMovie(String imdbId) {
		return movieRepository.findMovieByImdbId(imdbId);
	}
}
