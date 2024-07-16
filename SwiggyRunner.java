class SwiggyRunner{

public static void main(String[] food){
System.out.println("main started");
String name = "Chilli Chicken";
int noOfQuantity = 2;

double price = Swiggy.searchPriceByFoodNames(name , noOfQuantity);
System.out.println("The price of" +name +" is:" +price);
System.out.println("main ended");

}

}