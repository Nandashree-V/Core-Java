class NandiniParlourRunner{
	
	public static void main(String[] milk){
	System.out.println("main method started");
	 String productName = "Cheddae Cheese 1kg";
	 int noOfQuantity = 3 ;
	 double productPrice = NandiniParlour.getProductPriceByName(productName,noOfQuantity);
	 System.out.println("The price of the " +productName +" is:" +productPrice);

System.out.println("main method ended");	
		
	}

}