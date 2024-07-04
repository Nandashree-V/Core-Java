class Refrigerator{

public static void main(String[] electric){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Refrigerator are");
  System.out.println("-------------");
  
  String brandName = "Whiepool";
  int price = 11990;
  String color = "Sapphire blue";
  String capacity = "184 liters";
  String modelName = "SAPPHIRE BLUE-Z, Blue,2023 Model";
  String productDimension = "60.5D x 53.5W x 118.8H Centimeters";
  
  
  System.out.println("The Brand Name of the Refrigerator is: " +brandName);
  System.out.println("The color of the Refrigerator is: " +color);
  System.out.println("The price of the Refrigerator  is: " +price);
  System.out.println("The Capacity for Refrigerator is: " +capacity);
  System.out.println("The model name of the Refrigerator  is: " +modelName);
  System.out.println("The Dimension of the Refrigerator  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}