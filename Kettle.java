class Kettle{

public static void main(String[] electric){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Kettle are");
  System.out.println("-------------");
  
  String brandName = "DOLPHY";
  int price = 6599;
  String color = "Black";
  String careInstruction = "Wipe clean";
  String modelName = "DKTL0038/12/13/14";
  String productDimension = "32L x 2.4W x 38H Centimeters";
  
  
  System.out.println("The Brand Name of the Kettle is: " +brandName);
  System.out.println("The color of the Kettle is: " +color);
  System.out.println("The price of the Kettle  is: " +price);
  System.out.println("The Care instruction for Kettle is: " +careInstruction);
  System.out.println("The model name of the Kettle  is: " +modelName);
  System.out.println("The Dimension of the Kettle  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}