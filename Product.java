package smallgateshopinventorymanagementsystem;

public class Product {
	//Part a
	private int productId;
	private String productName;
	private String productCategory;
	private double unitPrice;
	private int quantityInStock;
	
	
	
	
	
	//Getters
    public int getProductId() {
    	return productId;
    }
    public String getProductName() {
    	return productName;
    }
    public String getProductCategory() {
    	return productCategory;
    }
    public double getUnitPrice() {
    	return unitPrice;
    }
    public int getQuantityInStock( ) {
    	return quantityInStock;
    }
    
    //Setters
    public void setProductId(int productId ) {
    	this.productId = productId;
    }
    public void setProductName(String productName) {
    	this.productName = productName;
    }
    public void setProductCategory(String productCategory) {
    	this.productCategory = productCategory;
    }
    public void setUnitPrice(double unitPrice) {
    	if (unitPrice >= 0) {
    		this.unitPrice = unitPrice;
    	}else {
    		System.out.println("Negative price");
    	}
    }  
    public void setQuantityInStock(int quantityInStock) {
    	if (quantityInStock >= 0) {
    		this.quantityInStock = quantityInStock;
    	}else {
    		System.out.println("Negative quantity");
    	}
    }
    
    
    	
  
    
}
