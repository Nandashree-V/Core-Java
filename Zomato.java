class Zomato{

 static int foodPrice;
public static int priceOfFood(String foodName){
System.out.println("priceOfFood method started");
if(foodName == "Ramoli Roti"){
	foodPrice = 33;
	return foodPrice = 0;
}
if(foodName == "Kulcha" ){
	foodPrice = 36;
	return foodPrice;	
}
if(foodName == "Ceylon Parotta" ){
	foodPrice = 38;
	return foodPrice;
}
if(foodName == "Coin Parotta"){
	foodPrice = 31;
	return foodPrice;
}
if(foodName == "Dry Chapati"){
	foodPrice = 31;
	return foodPrice;
}
if(foodName == "Empire Mix Parotta" ){
	foodPrice = 196;
	return foodPrice;
}
if(foodName == "Egg Parotta"){
	foodPrice = 84;
	return foodPrice;
	
}
if(foodName == "Ghee Chapati"){
	foodPrice =34;
	return foodPrice;
	
}
if(foodName == "Malbar Parotta" ){
	foodPrice = 32;
	return foodPrice;
}
if(foodName == "Boiled egg"){
	foodPrice = 42;
	return foodPrice;
	
}
if(foodName == "Egg Burji" ){
	foodPrice = 84;
	return foodPrice;
}
if(foodName == "Egg Masala"){
	foodPrice = 121;
	return foodPrice;
}
if(foodName == "Dosa Chicken" ){
	foodPrice =153;
	return foodPrice;
}
if(foodName == "Mutton Keema Dosa" ){
	foodPrice = 173;
	return foodPrice;
}
if(foodName == "Onion Dosa"){
	foodPrice = 46;
	return foodPrice;
}
if(foodName == "Chicken Shawarma" ){
	foodPrice = 93;
	return foodPrice;
}
if(foodName == "Pappad" ){
	foodPrice = 21;
	return foodPrice;
}
if(foodName == "Raitha"){
	foodPrice = 67;
	return foodPrice;
}
if(foodName ==  "Lady Lychee"){
	foodPrice = 121;
	return foodPrice;
}
if(foodName == "Tender Cocinut Pudding"){
foodPrice = 73;
	return foodPrice;	
}
if(foodName == "Lychee Malba"){
	foodPrice = 176;
	return foodPrice;
}
else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}



}