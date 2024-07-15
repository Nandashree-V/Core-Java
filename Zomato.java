class Zomato{

 static int foodPrice;
public static int priceOfFood(String foodName){
System.out.println("priceOfFood method started");
if(foodName == "Ramoli Roti")	return foodPrice =33;
	
if(foodName == "Kulcha" ) return foodPrice =36;
	
if(foodName == "Ceylon Parotta" )	return foodPrice =38;
	
if(foodName == "Coin Parotta")	return foodPrice =31;
	
if(foodName == "Dry Chapati") return foodPrice =31;
	
if(foodName == "Empire Mix Parotta" )	return foodPrice =196;
	
if(foodName == "Egg Parotta")	return foodPrice =84;

if(foodName == "Ghee Chapati")	return foodPrice =34;

if(foodName == "Malbar Parotta" )return foodPrice =32;
	
if(foodName == "Boiled egg") return foodPrice =42;
	
if(foodName == "Egg Burji" )	return foodPrice =84;
	
if(foodName == "Egg Masala")	return foodPrice =121;
	
if(foodName == "Dosa Chicken" )	return foodPrice =153;
	
if(foodName == "Mutton Keema Dosa" )	return foodPrice =173;
	
if(foodName == "Onion Dosa") return foodPrice =46;
	
if(foodName == "Chicken Shawarma" )	return foodPrice =93;

if(foodName == "Pappad" )	return foodPrice =21;
	
if(foodName == "Raitha")	return foodPrice =67;
	
if(foodName ==  "Lady Lychee")	return foodPrice =121;
	
if(foodName == "Tender Cocinut Pudding") return foodPrice =73;
	
if(foodName == "Lychee Malba")	return foodPrice =176;	

else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}



}