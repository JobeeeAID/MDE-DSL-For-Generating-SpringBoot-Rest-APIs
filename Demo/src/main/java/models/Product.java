import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class Product

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String productId;


	private String productName;


	private String description;


	private double price;


	@ManyToOne
	@JoinColumn(name = "productCategoryId")
	private ProductCategory productCategory;


	private int availableItemCount;


	//constructors
	public Product(){

	}

	public Product(

		String productId,
		String productName,
		String description,
		double price,
		ProductCategory productCategory,
		int availableItemCount

	){
	 this.productId = productId; 
	 this.productName = productName; 
	 this.description = description; 
	 this.price = price; 
	 this.productCategory = productCategory; 
	 this.availableItemCount = availableItemCount; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	public int getAvailableItemCount() {
		return availableItemCount;
	}

	public void setAvailableItemCount(int availableItemCount) {
		this.availableItemCount = availableItemCount;
	}

}
