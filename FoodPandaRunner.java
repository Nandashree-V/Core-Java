class FoodPandaRunner{

public static void main(String[] food){
System.out.println("main started");
String name = "Thai Spring ";
String foodCost = FoodPanda.getPrice(name);
System.out.println("The price of " +name +" is:" +foodCost);
System.out.println("main ended");
}

}