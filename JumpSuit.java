class JumpSuit{

public static void main(String[] womenwear){

System.out.println("main started");

getProperties();

System.out.println("main ended");

}

public static void getProperties(){

System.out.println("getProperties method started");
  
  System.out.println("The Properties of JumpSuits are");
  System.out.println("-------------");
  
  String brandName = "Darshak";
  int price = 699;
  String color = "Green";
  String materialType = "Crepe";
  String length = "knee-Length";
  String careInstruction = "Machine wash"
  
  System.out.println("The Brand Name of the JumpSuits is: " +brandName);
  System.out.println("The color of the JumpSuits is: " +color);
  System.out.println("The price of the JumpSuits is: " +price);
  System.out.println("The Material type of JumpSuits is: " +materialType);
  System.out.println("The Length of JumpSuits is: "  +length);
  System.out.println("The Care Instruction for JumpSuits is: "  +careInstruction);

System.out.println("getProperties method ended");


return;


}


}