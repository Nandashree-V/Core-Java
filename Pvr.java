class Pvr{
static  double  getPrice = 0.0;

public static double getMoviePriceByName(String movieName){
System.out.println("getMoviePriceByName method started");
if(movieName == "India 2") return getPrice = 350.00;
   
if(movieName == "Kalki") return getPrice = 375.00;  
 
if(movieName == "Sarfira") return getPrice =  300.00;  

if(movieName == "Kill") return getPrice = 250.00;   

if(movieName == "Love li") return getPrice = 300.00; 
  
if(movieName == "Munjya") return getPrice = 280.00;  

if(movieName == "Chandu Champion") return getPrice = 345.00;  
 
if(movieName == "maharaja") return getPrice =   300; 

if(movieName == "Rockstar") return getPrice =   250; 

if(movieName == "Tneez") return getPrice =   400; 

if(movieName == "Handa") return getPrice =   450; 

if(movieName == "GODZILLA X KONG : THE NEW EMPIRE") return getPrice =   390; 

if(movieName == "DESPICABLE ME 4") return getPrice = 300;   

if(movieName == "Longlegs") return getPrice =   380; 

if(movieName == "FLY ME TO THE MOON") return getPrice =   350; 

if(movieName == "INSIDE OUT 2") return getPrice = 280;   

if(movieName == "JATT AND JULIET 3") return getPrice =  200;  

if(movieName == "KAAGAZ KE PHOOL (re-lease)") return getPrice = 250;   

if(movieName == "A QUIET PLACE: DAY ONE") return getPrice = 350;   

if(movieName == "MANIKBABUR MEGH") return getPrice = 270;   

else{ 
System.out.println("Movie not found");
}
System.out.println("getMoviePriceByName method ended");
return getPrice;
}




}