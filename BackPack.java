class BackPack{

public static void main(String[] luggage){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of BackPack are");
  System.out.println("-------------");
  
  String brandName = "Safari";
  int price = 223;
  String color = "Red";
  String careInstruction = "Hand Wash Only";
  int capacityInLiters = 15;
  String weight = "200 Grams"  ;
  
  System.out.println("The Brand Name of the BackPack is: " +brandName);
  System.out.println("The color of the BackPack is: " +color);
  System.out.println("The price of the BackPack  is: " +price);
  System.out.println("The Care instruction of BackPack is: " +careInstruction);
  System.out.println("The price of the BackPack  is: " +weight);
  System.out.println("The price of the BackPack  is: " +capacityInLiters);
  

System.out.println("getProperties method ended");


return;


}


}