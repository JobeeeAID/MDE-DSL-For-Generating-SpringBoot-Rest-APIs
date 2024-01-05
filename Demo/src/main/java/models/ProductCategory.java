import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class ProductCategory

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String productCategoryId;


	private String productCategoryName;


	private String description;

	@OneToMany(
            mappedBy = "productCategory",
			cascade = CascadeType.ALL)

	private List<Product> products;


	//constructors
	public ProductCategory(){

	}

	public ProductCategory(

		String productCategoryId,
		String productCategoryName,
		String description,
		List<Product> products

	){
	 this.productCategoryId = productCategoryId; 
	 this.productCategoryName = productCategoryName; 
	 this.description = description; 
	 this.products = products; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
