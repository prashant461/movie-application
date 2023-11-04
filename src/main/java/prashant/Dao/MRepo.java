package prashant.Dao;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import prashant.model.Movie;

@Repository
public interface MRepo extends MongoRepository<Movie, ObjectId>{

	Optional<Movie> findMovieByImdbId(String imdbId);
}
