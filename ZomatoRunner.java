class ZomatoRunner{

public static void main(String[] food){
	System.out.println("main method started");
 String itemNames = "Ceylon Parotta";
 
 
 int foodPrice = Zomato.priceOfFood(itemNames);
 System.out.println("The price of" +itemNames +" is:" +foodPrice);
	
	System.out.println("main method ended");
	
	
}

}