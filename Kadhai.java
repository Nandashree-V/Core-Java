class Kadhai{

public static void main(String[] kitchentool){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Kadhai are");
  System.out.println("-------------");
  
  String brandName = "Sumeet";
  int price = 659;
  String color = "Steel";
  double capacityInliters = 1.5;
  String material = "Stainless steel";
  String itemWeight = "0,92Kg";
  
  System.out.println("The Brand Name of the Kadhai is: " +brandName);
  System.out.println("The color of the Kadhai is: " +color);
  System.out.println("The price of the Kadhai is: " +price);
  System.out.println("The Capacity of Kadhai is: " +capacityInliters);
  System.out.println("The Weight of Kadhai is: " +itemWeight);
  System.out.println("The material type of Kadhai is: " +material);
  

System.out.println("getProperties method ended");


return;


}


}