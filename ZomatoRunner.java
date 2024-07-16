class ZomatoRunner{

public static void main(String[] food){
	System.out.println("main method started");
 String itemNames = "Ceylon Parotta";
 int noOfQuantity = 2;
 
 int foodPrice = Zomato.priceOfFood(itemNames,noOfQuantity);
 System.out.println("The price of " +itemNames +" is:" +foodPrice);
	
	System.out.println("main method ended");
	
	
}

}