class Swiggy{

static double cost = 0.0;
public static double searchPriceByFoodNames(String foodName){

System.out.println("searchPriceByFoodNames method started");


if(foodName == "Tandoori Paneer Tikka"){
      cost = 295;
	  return cost;
}
if(foodName == "Mutton Haleem"){
	cost = 415;
	return cost;
}
if(foodName=="Tandoori Chicken Tikka"){
	cost = 315;
	return cost;
}
if(foodName == "Tandoori Chicken(full)"){
	cost = 485;
	return cost;
}
if(foodName== "Chicken Sholey Kebab"){
	cost = 330;
	return cost;
}
if(foodName == "Chicken mallai kebab"){
	cost = 330;
	return cost;
}
if(foodName == "Palak paneer"){
	cost = 225;
	return cost;
}
if(foodName == "Chicken Makhanwala"){
	cost = 270;
	return cost;
}

if(foodName == "kadadi Chicken"){
	cost = 290;
	return cost;
}
if(foodName == "Mutton rogan Josh"){
	cost = 305;
	return cost;
}
if(foodName == "Keema Masala"){
	cost = 315;
	return cost;
}
if(foodName== "Brain pepper Fry"){
	cost = 385;
	return cost;
}
if(foodName == "Dal Fry"){
	cost = 200;
	return cost;
}
if(foodName == "Mutton Biryani"){
	cost= 390;
	return cost;
}
if(foodName == "Sholey gobi"){
	cost = 245;
	return cost;
}
if(foodName == "Panner roll"){
	cost = 160;
	return cost;
}
if(foodName == "Egg Masala" ){
	cost = 250;
	return cost;
}
if(foodName == "Chicken 65"){
	cost = 330;
	return cost;
}
if(foodName == "Chicken Peeper Fry"){
	cost= 330;
	return cost;
}
if(foodName== "Chilli Chicken"){
	cost = 305;
	return cost;
}
if(foodName == "Chicken Manchurian"){
	cost = 305;
	return cost;
}
else{
	 System.out.println("Food Name doesnot match");
}


System.out.println("searchPriceByFoodNames method ended");
return cost;
}




}