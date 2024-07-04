class Chimney{

public static void main(String[] electric){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Chimney are");
  System.out.println("-------------");
  
  String brandName = "Elica";
  int price = 11990;
  String color = "Black";
  String careInstruction = "Wipe clean";
  String material = "Polished";
  String productDimension = "43.8D x 60W x 45.5H Centimeters";
  
  
  System.out.println("The Brand Name of the Chimney is: " +brandName);
  System.out.println("The color of the Chimney is: " +color);
  System.out.println("The price of the Chimney  is: " +price);
  System.out.println("The Care instruction for Chimney is: " +careInstruction);
  System.out.println("The Material of the Chimney  is: " +material);
  System.out.println("The Dimension of the Chimney  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}