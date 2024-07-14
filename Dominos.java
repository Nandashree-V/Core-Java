class Dominos{
	
static int pizzaPrice;

public static int priceOfPizza(String pizzaName){
	
System.out.println("priceOfFood method started");

if(pizzaName == "Margherita"){
	pizzaPrice = 199;
	return pizzaPrice;
}
if(pizzaName == "Mexican Green Wave" ){
	pizzaPrice = 349;
	return pizzaPrice;	
}
if(pizzaName == "Veggie Paradise" ){
	pizzaPrice = 348;
	return pizzaPrice;
}
if(pizzaName == "Peppy Paneer"){
	pizzaPrice = 349;
	return pizzaPrice;
}
if(pizzaName == "Farmhouse"){
	pizzaPrice = 359;
	return pizzaPrice;
}
if(pizzaName == "Cheese Overload" ){
	pizzaPrice = 459;
	return pizzaPrice;
}
if(pizzaName == "Fiery Jalapeno & Paprika"){
	pizzaPrice = 259;
	return pizzaPrice;
	
}
if(pizzaName == "Achari Do Pyaza"){
	pizzaPrice =258;
	return pizzaPrice;
	
}
if(pizzaName == "blazing Onion" ){
	pizzaPrice = 250;
	return pizzaPrice;
}
if(pizzaName == "Veg Extravaganza"){
	pizzaPrice = 439;
	return pizzaPrice;
	
}
if(pizzaName == "Chickenc Sausage" ){
	pizzaPrice = 279;
	return pizzaPrice;
}
if(pizzaName == "The 5 Chicken Feast Pizza"){
	pizzaPrice = 579;
	return pizzaPrice;
}
if(pizzaName == "Cheese n Corn" ){
	pizzaPrice =289;
	return pizzaPrice;
}
if(pizzaName == "Indi Tandoori Paneer" ){
	pizzaPrice = 439;
	return pizzaPrice;
}
if(pizzaName == "Fresh Veggie"){
	pizzaPrice = 289;
	return pizzaPrice;
}
if(pizzaName == "Chicken Fiesta" ){
	pizzaPrice = 445;
	return pizzaPrice;
}
if(pizzaName == "Chicken Golden Delight" ){
	pizzaPrice = 546;
	return pizzaPrice;
}
if(pizzaName == "Chicken Pepperoni"){
	pizzaPrice = 479;
	return pizzaPrice;
}
if(pizzaName ==  "Chicken Dominator"){
	pizzaPrice = 521;
	return pizzaPrice;
}
if(pizzaName == "Non Veg Supreme"){
pizzaPrice = 473;
	return pizzaPrice;	
}
if(pizzaName == "Double Cheese Margherita"){
	pizzaPrice = 289;
	return pizzaPrice;
}
else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return pizzaPrice;


}



}




