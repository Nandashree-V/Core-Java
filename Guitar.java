class Guitar{

public static void main(String[] music){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Guitar are");
  System.out.println("-------------");
  
  String brandName = "Kadence";
  int price = 5399;
  String color = "Black";
  String weight = "3 kg 960 g";
  String material = "Rosewood";
  String productDimension = "101.6 x 40.64 x 101.6 cm; 3.96 kg";
  
  
  System.out.println("The Brand Name of the Guitar is: " +brandName);
  System.out.println("The color of the Guitar is: " +color);
  System.out.println("The price of the Guitar  is: " +price);
  System.out.println("The Weight of Guitar is: " +weight);
  System.out.println("The material of the Guitar  is: " +material);
  System.out.println("The Dimension of the Guitar  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}