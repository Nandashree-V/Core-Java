class AppamPatra{

public static void main(String[] nonstick){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of AppamPatra are");
  System.out.println("-------------");
  
  String brandName = "Tossa";
  int price = 299;
  String color = " Black";
  String Capacity = " 1Kg";
  String material = "Diecast";
  String itemWeight = "0.59 kg";
  
  
  System.out.println("The Brand Name of the AppamPatra is: " +brandName);
  System.out.println("The color of the AppamPatra is: " +color);
  System.out.println("The price of the AppamPatra is: " +price);
  System.out.println("The Capacity of AppamPatra is: " +Capacity);
  System.out.println("The Material Type of AppamPatra is: " +material);
  System.out.println("The Weight of AppamPatra is: " +itemWeight);
  

System.out.println("getProperties method ended");


return;


}


}