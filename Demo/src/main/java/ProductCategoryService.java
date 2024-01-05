import .app.models.ProductCategory;
import .app.repositories.ProductCategoryRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org. springframework.stereotype.Service;

import java.util.List; 
import java.util.Optional; 
import java.util.UUID;

@Service
public class ProductCategoryService {

	private ProductCategoryRepository productCategoryRepo;
	@Autowired
	public ProductCategoryService(ProductCategoryRepository productCategoryRepo) { 
		this.productCategoryRepo = productCategoryRepo;
	}

	public ProductCategory saveProductCategory(ProductCategory productCategory){ 
		return productCategoryRepo.save(productCategory);
	}
	public List<ProductCategory> getAllProductCategory(){ 
		return productCategoryRepo.findAll();
	}
	public Optional<ProductCategory> getProductCategoryById(Long id){ 
		return productCategoryRepo.findById(id);
	}

	public void deleteProductCategory(Long id){ 
		if(id!=null){
			if(getProductCategoryById(id).isPresent()) 
				productCategoryRepo.deleteById(id);
		}
	}
	public ProductCategory updateProductCategory(ProductCategory productCategory){ 
		return productCategoryRepo.save(productCategory);
	}
	}
