class Dumbbells{

public static void main(String[] weights){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Dumbbells are");
  System.out.println("-------------");
  
  String brandName = "Lifelong";
  int price = 259;
  String color = "Black";
  String weight = "4000 Grams";
  String material = "PVC";
  String warranty = "6 months";
  
  
  System.out.println("The Brand Name of the Dumbbells is: " +brandName);
  System.out.println("The color of the Dumbbells is: " +color);
  System.out.println("The price of the Dumbbells  is: " +price);
  System.out.println("The Warranty for Dumbbells is: " +warranty);
  System.out.println("The Material of the Dumbbells  is: " +material);
  System.out.println("The Weight of the Dumbbells  is: " +weight);
  

System.out.println("getProperties method ended");


return;


}


}