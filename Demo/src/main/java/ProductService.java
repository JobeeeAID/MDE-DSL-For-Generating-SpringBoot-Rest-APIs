import .app.models.Product;
import .app.repositories.ProductRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class ProductService {

	private ProductRepository productRepo;
	@Autowired
	public ProductService(ProductRepository productRepo) { 
		this.productRepo = productRepo;
	}

	public Product saveProduct(Product product){ 
		return productRepo.save(product);
	}
	public List<Product> getAllProduct(){ 
		return productRepo.findAll();
	}
	public Optional<Product> getProductById(Long id){ 
		return productRepo.findById(id);
	}

	public void deleteProduct(Long id){ 
		if(id!=null){
			if(getProductById(id).isPresent()) 
				productRepo.deleteById(id);
		}
	}
	public Product updateProduct(Product product){ 
		return productRepo.save(product);
	}
	}
