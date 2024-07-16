class Swiggy{

static double cost = 0.0;

public static double searchPriceByFoodNames(String foodName){

System.out.println("searchPriceByFoodNames method started");


if(foodName == "Tandoori Paneer Tikka") return cost= 295;

if(foodName == "Mutton Haleem")	return cost= 415;

if(foodName=="Tandoori Chicken Tikka") return cost= 315;

if(foodName == "Tandoori Chicken(full)") return cost= 485;

if(foodName== "Chicken Sholey Kebab") return cost = 330;

if(foodName == "Chicken mallai kebab")	return cost = 330;

if(foodName == "Palak paneer") return cost = 225;

if(foodName == "Chicken Makhanwala") return cost = 270;

if(foodName == "kadadi Chicken") return cost= 290;;

if(foodName == "Mutton rogan Josh") return cost= 305;

if(foodName == "Keema Masala") return cost= 315;

if(foodName== "Brain pepper Fry") return cost= 385;

if(foodName == "Dal Fry") return cost = 200;

if(foodName == "Mutton Biryani")  return cost= 390;

if(foodName == "Sholey gobi") return cost = 245;

if(foodName == "Panner roll") return cost= 160;

if(foodName == "Egg Masala" )	return cost = 250;

if(foodName == "Chicken 65")	return cost= 330;

if(foodName == "Chicken Peeper Fry")	return cost= 330;

if(foodName== "Chilli Chicken")	return cost= 330;

if(foodName == "Chicken Manchurian")	return cost = 305;

else{
	 System.out.println("Food Name doesnot match");
}


System.out.println("searchPriceByFoodNames method ended");
return cost;
}


public static double searchPriceByFoodNames(String foodName ,int quantity){

System.out.println("searchPriceByFoodNames method started");


if(foodName == "Tandoori Paneer Tikka") return cost= 295 *quantity;

if(foodName == "Mutton Haleem")	return cost= 415 *quantity;

if(foodName=="Tandoori Chicken Tikka") return cost= 315 *quantity;

if(foodName == "Tandoori Chicken(full)") return cost= 485 *quantity;

if(foodName== "Chicken Sholey Kebab") return cost = 330 *quantity;

if(foodName == "Chicken mallai kebab")	return cost = 330 *quantity;

if(foodName == "Palak paneer") return cost = 225 *quantity;

if(foodName == "Chicken Makhanwala") return cost = 270 *quantity;

if(foodName == "kadadi Chicken") return cost= 290 *quantity;

if(foodName == "Mutton rogan Josh") return cost= 305 *quantity;

if(foodName == "Keema Masala") return cost= 315 *quantity;

if(foodName== "Brain pepper Fry") return cost= 38 *quantity;

if(foodName == "Dal Fry") return cost = 200 *quantity;

if(foodName == "Mutton Biryani")  return cost= 390 *quantity;

if(foodName == "Sholey gobi") return cost = 245 *quantity;

if(foodName == "Panner roll") return cost= 160 *quantity;

if(foodName == "Egg Masala" )	return cost = 250 *quantity;

if(foodName == "Chicken 65")	return cost= 330 *quantity;

if(foodName == "Chicken Peeper Fry")	return cost= 330 *quantity;

if(foodName== "Chilli Chicken")	return cost= 330 *quantity;

if(foodName == "Chicken Manchurian")	return cost = 305 *quantity;

else{
	 System.out.println("Food Name doesnot match");
}


System.out.println("searchPriceByFoodNames method ended");
return cost;
}



}