class NightLights{

public static void main(String[] lamp){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of NightLights are");
  System.out.println("-------------");
  
  String brandName = "rabbit Lamp";
  int price = 810;
  String color = "Multicolor";
  String style = "Bunny Lamp";
  String material = "Silicone";
  String productDimension = "12D x 5W x 12H Centimeters";
  
  
  System.out.println("The Brand Name of the NightLights is: " +brandName);
  System.out.println("The color of the NightLights is: " +color);
  System.out.println("The price of the NightLights  is: " +price);
  System.out.println("The style for NightLights is: " +style);
  System.out.println("The Material of the NightLights  is: " +material);
  System.out.println("The Dimension of the NightLights  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}