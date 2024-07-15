class Dominos{
static int pizzaPrice;

public static int priceOfPizza(String pizzaName){
System.out.println("priceOfFood method started");

if(pizzaName == "Margherita") return pizzaPrice = 199;

if(pizzaName == "Mexican Green Wave" ) return pizzaPrice = 349;

if(pizzaName == "Veggie Paradise" ) return pizzaPrice = 348;

if(pizzaName == "Peppy Paneer") return pizzaPrice = 349;

if(pizzaName == "Farmhouse") return pizzaPrice = 359;
if(pizzaName == "Cheese Overload" ) return pizzaPrice = 459;

if(pizzaName == "Fiery Jalapeno & Paprika") return pizzaPrice = 259;

if(pizzaName == "Achari Do Pyaza") return pizzaPrice =258;

if(pizzaName == "blazing Onion" ) return pizzaPrice = 250;

if(pizzaName == "Veg Extravaganza") return pizzaPrice = 439;

if(pizzaName == "Chickenc Sausage" ) return pizzaPrice = 279;

if(pizzaName == "The 5 Chicken Feast Pizza") return pizzaPrice = 579;

if(pizzaName == "Cheese n Corn" ) return pizzaPrice =289;

if(pizzaName == "Indi Tandoori Paneer" ) return pizzaPrice = 439;

if(pizzaName == "Fresh Veggie") return pizzaPrice = 289;

if(pizzaName == "Chicken Fiesta" ) return pizzaPrice = 445;

if(pizzaName == "Chicken Golden Delight" ) return pizzaPrice = 546;

if(pizzaName == "Chicken Pepperoni") return pizzaPrice = 479;

if(pizzaName ==  "Chicken Dominator") return pizzaPrice = 521;

if(pizzaName == "Non Veg Supreme") return pizzaPrice = 473;

if(pizzaName == "Double Cheese Margherita") return pizzaPrice = 289;

else {
System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return pizzaPrice;


}



}




