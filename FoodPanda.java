class FoodPanda{

static  String foodPrice ;
public static String getPrice(String foodName){

System.out.println("getPrice method started");
if(foodName == "Chicken Chop Set") return foodPrice ="$8.40";

if(foodName == "Fish & Chips Set") return foodPrice ="$8.40";

if(foodName== "Chicken Cutlet") return foodPrice ="$11.65";
	
if(foodName == "Ribeye Steak Set") return foodPrice ="$14.30";
	
if(foodName == "Chicken Chop Spaghetti") return foodPrice ="$8.81";
	
if(foodName== "Grilled Salmon Spaghetti")	return foodPrice ="$15.90";
	
if(foodName== "Lamb Chop Set")	return foodPrice ="$14.30";
	
if(foodName== "Beef Steak")	return foodPrice ="$13.65";
	
if(foodName== "Spring Chicken Spaghetti")	return foodPrice ="$11.10";
	
if(foodName == "Thai Green Curry With Rice")	return foodPrice ="$9";
	
if(foodName == "Tomyum Red Soup")	return foodPrice ="$9";
	
if(foodName == "Grilled Pork neck")	return foodPrice ="$10";
	
if(foodName == "Stir-fried Kailan")	return foodPrice ="$10";
	
if(foodName == "Thai Papaya Salad")	return foodPrice ="$8";
	
if(foodName == "Thai Mango Salad")	return foodPrice ="$11";
	
if(foodName == "Thai seafood Salad")return foodPrice ="$12";
	 
if(foodName == "Thai Spring Roll")	return foodPrice ="$7";

if(foodName == "Tahi Styke Fish Cake")	return foodPrice ="$7";
	
if(foodName == "Thai Pandan Chicken") return foodPrice ="$18";
	
if(foodName == "Thai Style prawn cake")	return foodPrice ="$19";
	
if(foodName == "Steamed Squid")	return foodPrice ="$20";
	
if(foodName == "Thai Esarn Sausage")	return foodPrice ="$7";
	
if(foodName == "Grill Squid")	return foodPrice ="$16";
	
else{
	System.out.println("The food not found!");
}

System.out.println("getPrice method ended");
return foodPrice;
}


}