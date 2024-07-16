class FoodPandaRunner{

public static void main(String[] food){
System.out.println("main started");
String name = "Thai Spring ";
int noOfQuantity = 4;
double foodCost = FoodPanda.getPrice(name, noOfQuantity);
System.out.println("The price of " +name +" is:" +foodCost);
System.out.println("main ended");
}

}