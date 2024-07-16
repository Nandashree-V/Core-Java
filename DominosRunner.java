class DominosRunner{

public static void main(String[] pizza){
System.out.println("main started");
String name = "Cheese n Corn";
int noOfQuantity = 5;
int pizzaCost = Dominos.priceOfPizza(name,noOfQuantity);
System.out.println("The price of " +name +" is:" +pizzaCost);
System.out.println("main ended");
}

}