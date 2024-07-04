class HeadPhones{

public static void main(String[] wireless){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of HeadPhones are");
  System.out.println("-------------");
  
  String brandName = "Sony";
  int price = 23030;
  String color = "Black";
  int warrantyInYears = 1;
  String earPlacement = "Over ear";
  String noiseControl = "Sound isolation";
  
  System.out.println("The Brand Name of the HeadPhones is: " +brandName);
  System.out.println("The color of the HeadPhones is: " +color);
  System.out.println("The price of the HeadPhones is: " +price);
  System.out.println("The Warranty of HeadPhones is: " +warrantyInYears);
  System.out.println("The Ear Placement of HeadPhones is: " +earPlacement);
  System.out.println("The Noise Control of HeadPhones is: " +noiseControl);
  

System.out.println("getProperties method ended");


return;


}


}