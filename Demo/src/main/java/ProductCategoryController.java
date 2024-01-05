import .app.models.ProductCategory;
import .app.services.ProductCategoryRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@RequestMapping("/api/productCategory") 
@RestController
public class ProductCategoryController{

	private final ProductCategoryService productCategoryService;
	@Autowired
	public ProductCategoryController(ProductCategoryService productCategoryService) { 
		this.productCategoryService = productCategoryService;
	}

	@PostMapping
	public ProductCategory addProductCategory(@RequestBody ProductCategory productCategory){
		 return productCategoryService.saveProductCategory(productCategory);
	}
	
	@GetMapping
	public List<ProductCategory> getAllProductCategory(){
		 return productCategoryService.getAllProductCategory();
	
}
	@GetMapping(path = "{id}")
	public Optional<ProductCategory> getProductCategoryById(@PathVariable("id") Long id){ 
		return productCategoryService.getProductCategoryById(id);
	}

	@PutMapping
	public ProductCategory updateProductCategory(@RequestBody ProductCategory productCategory){ 
		return productCategoryService.updateProductCategory(productCategory);
	}

	@DeleteMapping(path = "{id}")
	public void deleteProductCategoryById(@PathVariable("id") Long id){ 
		productCategoryService.deleteProductCategory(id);
	}
}


