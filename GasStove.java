class GasStove{

public static void main(String[] stove){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of GasStove are");
  System.out.println("-------------");
  
  String brandName = "BLOWHOT";
  int price = 4990;
  String color = "Black";
  String careInstruction = "Wipe clean";
  String material = "Mild steel";
  String size = "Emerald 3 Auto Ignition";
  
  
  System.out.println("The Brand Name of the GasStove is: " +brandName);
  System.out.println("The color of the GasStove is: " +color);
  System.out.println("The price of the GasStove  is: " +price);
  System.out.println("The Care instruction for GasStove is: " +careInstruction);
  System.out.println("The Material of the GasStove  is: " +material);
  System.out.println("The Size of the GasStove  is: " +size);
  

System.out.println("getProperties method ended");


return;


}


}