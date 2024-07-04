 class TrolleyBag{

public static void main(String[] bags){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Chopper are");
  System.out.println("-------------");
  
  String brandName = "Safari Pentagon";
  int price = 1599;
  String color = "Cyan Blue";
  String warranty = "3 years";
  String size = "55 cm";
  String dimension = "55cms * 38cms";
  
  System.out.println("The Brand Name of the TrolleyBag is: " +brandName);
  System.out.println("The color of the TrolleyBag is: " +color);
  System.out.println("The price of the TrolleyBag is: " +price);
  System.out.println("The Warranty of TrolleyBag is: " +warranty);
  System.out.println("The Size of TrolleyBag is: " +size);
  System.out.println("The Dimension of TrolleyBag is: " +dimension);
  

System.out.println("getProperties method ended");


return;


}


}