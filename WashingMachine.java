class WashingMachine{

public static void main(String[] electric){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of WashingMachine are");
  System.out.println("-------------");
  
  String brandName = "Godrej";
  int price = 9990;
  String color = "Black";
  String capacity = "7 Kg";
  String accessLocation = "Top load";
  String productDimension = "348.5D x 82W x 100H Centimeters";
  
  
  System.out.println("The Brand Name of the WashingMachine is: " +brandName);
  System.out.println("The color of the WashingMachine is: " +color);
  System.out.println("The price of the WashingMachine  is: " +price);
  System.out.println("The Capacity for WashingMachine is: " +capacity);
  System.out.println("The access Location of the WashingMachine  is: " +accessLocation);
  System.out.println("The Dimension of the WashingMachine  is: " +productDimension);
  

System.out.println("getProperties method ended");


return;


}


}