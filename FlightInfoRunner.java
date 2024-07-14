class FilghtInfoRunner{

public static void main(String[] flights){

System.out.println("main method started");
String name = "Jaipur";
double price = FlightInfo.getFlightPriceByDestinationName(name);
System.out.println("The price of the " +name +" is:" +price);

System.out.println("main method started");

}


}