import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class Review

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String reviewId;


	private String productId;


	private String userId;



	private double ratingValue;


	private String reviewMessage;


	//constructors
	public Review(){

	}

	public Review(

		String reviewId,
		String productId,
		String userId,
		 userName,
		double ratingValue,
		String reviewMessage

	){
	 this.reviewId = reviewId; 
	 this.productId = productId; 
	 this.userId = userId; 
	 this.userName = userName; 
	 this.ratingValue = ratingValue; 
	 this.reviewMessage = reviewMessage; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(double ratingValue) {
		this.ratingValue = ratingValue;
	}
	public String getReviewMessage() {
		return reviewMessage;
	}

	public void setReviewMessage(String reviewMessage) {
		this.reviewMessage = reviewMessage;
	}

}
