class WaterBottle{

public static void main(String[] electric){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of WaterBottle are");
  System.out.println("-------------");
  
  String brandName = "Sumeet";
  int price = 579;
  String color = "multicolor";
  String careInstruction = "Dish washer safe";
  String capacity  = "800 ml";
  String type = "leak proof";
  
  
  System.out.println("The Brand Name of the WaterBottle is: " +brandName);
  System.out.println("The color of the WaterBottle is: " +color);
  System.out.println("The price of the WaterBottle  is: " +price);
  System.out.println("The Care instruction for WaterBottle is: " +careInstruction);
  System.out.println("The capacity  of the WaterBottle  is: " +capacity );
  System.out.println("The type of the WaterBottle  is: " +type);
  

System.out.println("getProperties method ended");


return;


}


}