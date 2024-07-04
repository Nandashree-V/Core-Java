class WaterPurifier{

public static void main(String[] aquaguard){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of WaterPurifier are");
  System.out.println("-------------");
  
  String brandName = "Aquaguard";
  int price = 7999;
  String color = "Black";
  String  capacity = "6 liters";
  String material  = "plastic";
  String productDimension = "32L x 27W x 48H Centimeters";
  
  
  System.out.println("The Brand Name of the WaterPurifier is: " +brandName);
  System.out.println("The color of the WaterPurifier is: " +color);
  System.out.println("The price of the WaterPurifier  is: " +price);
  System.out.println("The Capacity of WaterPurifier is: " +capacity);
  System.out.println("The material  of the WaterPurifier  is: " +material );
  System.out.println("The Dimension of the WaterPurifier  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}