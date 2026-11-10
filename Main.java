package smallgateshopinventorymanagementsystem;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		
		product1.setProductId(001);
		product1.setProductName("Exercise books");
		product1.setProductCategory("Stationery");
		product1.setUnitPrice(3500);
		product1.setQuantityInStock(15000);
		
		System.out.println("  Product 001  ");
		System.out.println("Product Id : " + product1.getProductId());
		System.out.println("Product Name : " + product1.getProductName());
		System.out.println("Product Category : " + product1.getProductCategory());
		System.out.println("Unit Price : Ugx " + product1.getUnitPrice());
		System.out.println("Quantity in Stock : " + product1.getProductId());
		
		//Product 2
		Product product2 = new Product();
		product2.setProductId(002);
		product2.setProductName("Pens");
		product2.setProductCategory("Stationery");
		product2.setUnitPrice(500);
		product2.setQuantityInStock(7000);
		
		System.out.println("  Product 002  ");
		System.out.println("Product Id : " + product2.getProductId());
		System.out.println("Product Name : " + product2.getProductName());
		System.out.println("Product Category : " + product2.getProductCategory());
		System.out.println("Unit Price : Ugx " + product2.getUnitPrice());
		System.out.println("Quantity in Stock : " + product2.getQuantityInStock());
		
		//Product 3
		Product product3 = new Product();
		product3.setProductId(003);
		product3.setProductName("Printing papers");
		product3.setProductCategory("Stationery");
		product3.setUnitPrice(25000);
		product3.setQuantityInStock(3000);
		
		System.out.println("  Product 003  ");
		System.out.println("Product Id : " + product3.getProductId());
		System.out.println("Product Name : " + product3.getProductName());
		System.out.println("Product Category : " + product3.getProductCategory());
		System.out.println("Unit Price : Ugx " + product3.getUnitPrice());
		System.out.println("Quantity in Stock : " + product3.getQuantityInStock());
		
		//Product 004
		Product product4 = new Product();
		product4.setProductId(004);
		product4.setProductName("Flash disks");
		product4.setProductCategory("Stationery");
		product4.setUnitPrice(35000);
		product4.setQuantityInStock(500);
		
		System.out.println("  Product 004  ");
		System.out.println("Product Id : " + product4.getProductId());
		System.out.println("Product Name : " + product4.getProductName());
		System.out.println("Product Category : " + product4.getProductCategory());
		System.out.println("Unit Price : Ugx " + product4.getUnitPrice());
		System.out.println("Quantity in Stock : " + product4.getQuantityInStock());
		
		//Product 005
		Product product5 = new Product();
		product5.setProductId(005);
		product5.setProductName("Calculators");
		product5.setProductCategory("Stationery");
		product5.setUnitPrice(20000);
		product5.setQuantityInStock(100);
		
		System.out.println("  Product 005  ");
		System.out.println("Product Id : " + product5.getProductId());
		System.out.println("Product Name : " + product5.getProductName());
		System.out.println("Product Category : " + product5.getProductCategory());
		System.out.println("Unit Price : Ugx " + product5.getUnitPrice());
		System.out.println("Quantity in Stock : " + product5.getQuantityInStock()); 
		
		
		
		
		System.out.println("  Update of the price and Stock quantity   ");
		//Update the price of at least one product using its setter method.
		product1.setUnitPrice(10000);
		
		//Update the stock quantity of at least one product using its setter method
		product2.setQuantityInStock(30000);
		
		//Display of updated information
		System.out.println("Product Name : " + product1.getProductName());
		System.out.println("Product 1 Unit price : Ugx " + product1.getUnitPrice());
		
		System.out.println("Product Name : " + product2.getProductName());
		System.out.println("Product 2 Quantity In Stock : " + product2.getQuantityInStock());
		
		
		//Part 4 e
		System.out.println(     "    Invalid price     ");
		product4.setUnitPrice(35000);
		System.out.println(-500);
		System.out.println("Invalid price");
		
		
		
	
		
		
		
		
		
		
		
		
		
		

	}

}
