class Furniture{

public static void main(String[] bed){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Furniture are");
  System.out.println("-------------");
  
  String brandName = "NATRAJ ART & CRAFT";
  int price = 18906;
  String color = "Natural";
  String careInstruction = "Wipe with dry cloth";
  String material = "Rose Wood";
  String productDimension = "182.9L x 167.6W x 106.7H Centimeters";
  
  
  System.out.println("The Brand Name of the Furniture is: " +brandName);
  System.out.println("The color of the Furniture is: " +color);
  System.out.println("The price of the Furniture  is: " +price);
  System.out.println("The Care instruction for Furniture is: " +careInstruction);
  System.out.println("The Material of the Furniture  is: " +material);
  System.out.println("The Dimension of the Furniture  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}