class SwiggyRunner{

public static void main(String[] food){
System.out.println("main started");
String name = "Chilli Chicken";

double price = Swiggy.searchPriceByFoodNames(name);
System.out.println("The price of" +name +" is:" +price);
System.out.println("main ended");

}

}