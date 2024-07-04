class Shoes{

public static void main(String[] bed){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Shoes are");
  System.out.println("-------------");
  
  String brandName = "ASIAN";
  int price = 574;
  String color = "Green";
  String heelType = "Flat";
  String material = "Ethylene vinyl Acetate";
  String style = "Sneaker";
  
  
  System.out.println("The Brand Name of the Shoes is: " +brandName);
  System.out.println("The color of the Shoes is: " +color);
  System.out.println("The price of the Shoes is: " +price);
  System.out.println("The Heel Type for Shoes is: " +heelType);
  System.out.println("The Material of the Shoes is: " +material);
  System.out.println("The Style of the Shoes is: " +style);
  

System.out.println("getProperties method ended");


return;


}


}