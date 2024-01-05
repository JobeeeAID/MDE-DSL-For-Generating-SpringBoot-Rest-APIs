import .app.models.Review;
import .app.repositories.ReviewRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class ReviewService {

	private ReviewRepository reviewRepo;
	@Autowired
	public ReviewService(ReviewRepository reviewRepo) { 
		this.reviewRepo = reviewRepo;
	}

	public Review saveReview(Review review){ 
		return reviewRepo.save(review);
	}
	public List<Review> getAllReview(){ 
		return reviewRepo.findAll();
	}
	public Optional<Review> getReviewById(Long id){ 
		return reviewRepo.findById(id);
	}

	public void deleteReview(Long id){ 
		if(id!=null){
			if(getReviewById(id).isPresent()) 
				reviewRepo.deleteById(id);
		}
	}
	public Review updateReview(Review review){ 
		return reviewRepo.save(review);
	}
	}
