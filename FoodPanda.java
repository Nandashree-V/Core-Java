class FoodPanda{

static  String foodPrice ;
public static String getPrice(String foodName){

System.out.println("getPrice method started");
if(foodName == "Chicken Chop Set"){
     foodPrice = "$8.40";
	 return foodPrice;
}
if(foodName == "Fish & Chips Set"){
	foodPrice = "$8.40";
	return foodPrice;
}
if(foodName== "Chicken Cutlet"){
	foodPrice = "$11.65";
	return foodPrice;
}
if(foodName == "Ribeye Steak Set"){
	foodPrice = "$14.30";
	return foodPrice;
}
if(foodName == "Chicken Chop Spaghetti"){
	foodPrice = "$8.81";
	return foodPrice;
}
if(foodName== "Grilled Salmon Spaghetti"){
	foodPrice = "$15.90";
	return foodPrice;
}
if(foodName== "Lamb Chop Set"){
	foodPrice = "$14.30";
	return foodPrice;
}
if(foodName== "Beef Steak"){
	foodPrice = "$13.65";
	return foodPrice;
}
if(foodName== "Spring Chicken Spaghetti"){
	foodPrice = "$11.10";
	return foodPrice;
}
if(foodName == "Thai Green Curry With Rice"){
	foodPrice = "$9";
	return foodPrice;
}
if(foodName == "Tomyum Red Soup"){
	foodPrice = "$9";
	return foodPrice;
}
if(foodName == "Grilled Pork neck"){
	foodPrice = "$10";
	return foodPrice;
}
if(foodName == "Stir-fried Kailan"){
	foodPrice = "$10";
	return foodPrice;
}
if(foodName == "Thai Papaya Salad"){
	foodPrice = "$8";
	return foodPrice;
}
if(foodName == "Thai Mango Salad"){
	foodPrice = "$11";
	return foodPrice;
}
if(foodName == "Thai seafood Salad"){
	foodPrice = "$12";
	return foodPrice;
}
if(foodName == "Thai Spring Roll"){
	foodPrice = "$7";
	return foodPrice;
}
if(foodName == "Tahi Styke Fish Cake"){
	foodPrice = "$7";
	return foodPrice;
}
if(foodName == "Thai Pandan Chicken"){
	foodPrice = "$18";
	return foodPrice;
}
if(foodName == "Thai Style prawn cake"){
	foodPrice = "$19";
	return foodPrice;
}
if(foodName == "Steamed Squid"){
	foodPrice = "$20";
	return foodPrice;
}
if(foodName == "Thai Esarn Sausage"){
	foodPrice = "$7";
	return foodPrice;
}
if(foodName == "Grill Squid"){
	foodPrice = "$16";
	return foodPrice;
}
else{
	System.out.println("The food not found!");
}

System.out.println("getPrice method ended");
return foodPrice;
}


}