class Chopper{

public static void main(String[] kitchentool){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Chopper are");
  System.out.println("-------------");
  
  String brandName = "Butterfly";
  int price = 278;
  String color = "Blue";
  int weightInGrams = 272;
  String bladeweight = "0.6 Pounds";
  String bladeLength = "3.5 cm";
  
  System.out.println("The Brand Name of the Chopper is: " +brandName);
  System.out.println("The color of the Chopper is: " +color);
  System.out.println("The price of the Chopper is: " +price);
  System.out.println("The  Weight of Chooper is: " +weightInGrams);
  System.out.println("The   Blade Weight of Chooper is: " +bladeweight);
  System.out.println("The  blade Length of Chooper is: " +bladeLength);
  
  

System.out.println("getProperties method ended");


return;


}


}