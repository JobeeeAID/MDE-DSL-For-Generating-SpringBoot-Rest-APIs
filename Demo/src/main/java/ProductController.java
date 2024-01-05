import .app.models.Product;
import .app.services.ProductRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/product") 
@RestController
public class ProductController{

	private final ProductService productService;
	@Autowired
	public ProductController(ProductService productService) { 
		this.productService = productService;
	}

	@PostMapping
	public Product addProduct(@RequestBody Product product){
		 return productService.saveProduct(product);
	}
	
	@GetMapping
	public List<Product> getAllProduct(){
		 return productService.getAllProduct();
	
}
	@GetMapping(path = "{id}")
	public Optional<Product> getProductById(@PathVariable("id") Long id){ 
		return productService.getProductById(id);
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product product){ 
		return productService.updateProduct(product);
	}

	@DeleteMapping(path = "{id}")
	public void deleteProductById(@PathVariable("id") Long id){ 
		productService.deleteProduct(id);
	}
}


