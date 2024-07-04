class TowerFan{

public static void main(String[] electric){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of TowerFan are");
  System.out.println("-------------");
  
  String brandName = "Philips Domestic Appliances";
  int price = 9199;
  String color = "Black";
  String careInstruction = "Wipe clean";
  String material = "plastic";
  String productDimension = "16D x 15.4W x 104.8H Centimeters";
  
  
  System.out.println("The Brand Name of the TowerFan is: " +brandName);
  System.out.println("The color of the TowerFan is: " +color);
  System.out.println("The price of the TowerFan  is: " +price);
  System.out.println("The Care instruction for TowerFan is: " +careInstruction);
  System.out.println("The material of the TowerFan  is: " +material);
  System.out.println("The Dimension of the TowerFan  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}