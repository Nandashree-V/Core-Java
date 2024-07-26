class AmazonProductsRunner{

public static void main(String[] args){
	System.out.println("main started");
	
	boolean productName = AmazonProducts.createProductsName("Pillow");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Airpods");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Ginder");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Juice Maker");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Iron Box");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Television");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Laptop");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Mobile Phone");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("yoga mat");
	System.out.println("The Product  Name is added " +productName);
	
	productName = AmazonProducts.createProductsName("Lights");
	System.out.println("The Product  Name is added " +productName);
	AmazonProducts.getProductNames();
	
	 boolean updateName = AmazonProducts.updateProductName("Mobile Phone" , "Tab");
  System.out.println("The updated product name is "  +updateName);
  AmazonProducts. getProductNames();
  
  boolean deleteName = AmazonProducts.deleteProductName("Lights");
    System.out.println("The deleted product name is: " +deleteName);
	AmazonProducts.getProductNames();
	
	System.out.println("main ended");
}



}