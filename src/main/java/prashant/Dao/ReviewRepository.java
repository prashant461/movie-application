package prashant.Dao;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import prashant.model.Review;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{

	
}
