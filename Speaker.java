class Speaker{

public static void main(String[] pc){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of Speaker are");
  System.out.println("-------------");
  
  String brandName = "Logitech";
  int price = 1480;
  String frequency = "0.18 GHZ";
  String outputPower = "25 Watts";
  String mountingType = "Table Top";
  String connectivity = "bluetooth";
  
  System.out.println("The Brand Name of the Speaker is: " +brandName);
  System.out.println("The Frequency of the Speaker is: " +frequency);
  System.out.println("The price of the Speaker  is: " +price);
  System.out.println("The Output Power of Speaker is: " +outputPower);
  System.out.println("The Mounting type  of the Speaker  is: " +mountingType);
  System.out.println("The Connectivity of the Speaker  is: " +connectivity);
  

System.out.println("getProperties method ended");


return;


}


}