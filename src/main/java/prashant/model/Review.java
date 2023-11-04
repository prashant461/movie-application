package prashant.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "reviews")
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	@Id
	private ObjectId id;
	private String body;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Review(String body) {
		super();
		this.body = body;
	}
	
	
	
}
