package prashant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import prashant.Dao.ReviewRepository;
import prashant.model.Movie;
import prashant.model.Review;

@Service
public class ReviewService {
	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public Review createReview(String reviewBody, String imdbId) {
		Review review = reviewRepository.insert(new Review(reviewBody));
		
		
		mongoTemplate.update(Movie.class).
				matching(Criteria.where("imdbId")
						.is(imdbId)).apply(new Update().push("reviewIds", review))
				.first();
		return review;
	}
}
