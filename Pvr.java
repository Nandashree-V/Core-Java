class Pvr{
static  double getPrice = 0.0;

public static double getMoviePriceByName(String movieName){
System.out.println("getMoviePriceByName method started");
if(movieName == "India 2"){
	getPrice = 350.00;  
	return getPrice;
}
if(movieName == "Kalki"){
	getPrice = 375.00;  
	return getPrice;
}
if(movieName == "Sarfira"){
	getPrice =  300.00; 
	return getPrice;
}
if(movieName == "Kill"){
	getPrice = 250.00;  
	return getPrice;
}
if(movieName == "Love li"){
	getPrice = 300.00;  
	return getPrice;
}
if(movieName == "Munjya"){
	getPrice = 280.00; 
	return getPrice;
}
if(movieName == "Chandu Champion"){
	getPrice = 345.00;  
	return getPrice;
}
if(movieName == "maharaja"){
	getPrice =   300;
	return getPrice;
}
if(movieName == "Rockstar"){
	getPrice =   250;
	return getPrice;
}
if(movieName == "Tneez"){
	getPrice =   400;
	return getPrice;
}
if(movieName == "Handa"){
	getPrice =   450;
	return getPrice;
}
if(movieName == "GODZILLA X KONG : THE NEW EMPIRE"){
	getPrice =   390;
	return getPrice;
}
if(movieName == "DESPICABLE ME 4"){
	getPrice = 300;  
	return getPrice;
}
if(movieName == "Longlegs"){
	getPrice =   380;
	return getPrice;
}
if(movieName == "FLY ME TO THE MOON"){
	getPrice =   350;
	return getPrice;
}
if(movieName == "INSIDE OUT 2"){
	getPrice = 280;  
	return getPrice;
}
if(movieName == "JATT AND JULIET 3"){
	getPrice =  200; 
	return getPrice;
}
if(movieName == "KAAGAZ KE PHOOL (re-lease)"){
	getPrice = 250;  
	return getPrice;
}
if(movieName == "A QUIET PLACE: DAY ONE"){
	getPrice = 350;  
	return getPrice;
}
if(movieName == "MANIKBABUR MEGH"){
	getPrice = 270;  
	return getPrice;
}
else{
	System.out.println("Movie not found");
}
System.out.println("getMoviePriceByName method ended");

return getPrice;
}


}