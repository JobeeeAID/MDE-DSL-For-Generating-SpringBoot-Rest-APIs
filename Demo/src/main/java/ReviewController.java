import .app.models.Review;
import .app.services.ReviewRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/review") 
@RestController
public class ReviewController{

	private final ReviewService reviewService;
	@Autowired
	public ReviewController(ReviewService reviewService) { 
		this.reviewService = reviewService;
	}

	@PostMapping
	public Review addReview(@RequestBody Review review){
		 return reviewService.saveReview(review);
	}
	
	@GetMapping
	public List<Review> getAllReview(){
		 return reviewService.getAllReview();
	
}
	@GetMapping(path = "{id}")
	public Optional<Review> getReviewById(@PathVariable("id") Long id){ 
		return reviewService.getReviewById(id);
	}

	@PutMapping
	public Review updateReview(@RequestBody Review review){ 
		return reviewService.updateReview(review);
	}

	@DeleteMapping(path = "{id}")
	public void deleteReviewById(@PathVariable("id") Long id){ 
		reviewService.deleteReview(id);
	}
}


