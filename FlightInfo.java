class FlightInfo{

public static double getFlightPriceByDestinationName(String destinationName){
	System.out.println("getFlightPriceByDestinationName method started");
	double  getPrice = 0.0;
	//From Delhi
if(destinationName == "Gwalior")  return getPrice = 1195.00;  

if(destinationName == "Bathinda")  return getPrice = 1260.00;  

if(destinationName == "Jaipur")  return getPrice = 1334.00;  

if(destinationName == "Dehradun")  return getPrice = 1543.00; 
 
if(destinationName == "Udaipur")  return getPrice = 2174.00;  

if(destinationName == "Kanpur")  return getPrice = 2249;  

if(destinationName == "Lucknow")  return getPrice = 2300;  

if(destinationName == "Chandigarh")  return getPrice = 2384.00; 
 
if(destinationName == "Pantnagar")  return getPrice = 2647.00;  

if(destinationName == "Amritsar")  return getPrice = 2799.00;  

if(destinationName == "Ayodhya")  return getPrice = 28109.00; 
 
if(destinationName == "Shimla")  return getPrice = 2849.00;  

if(destinationName == "Ahmedabad")  return getPrice = 2941.00; 
 
if(destinationName == "Bhopal")  return getPrice =3229.00;  

if(destinationName == "Prayagraj")  return getPrice =3013.00;  

if(destinationName == "Nagpur")  return getPrice = 3643.00;  

if(destinationName == "Indore")  return getPrice = 3644.00;  

if(destinationName == "Baroda")  return getPrice = 3853.00;  

if(destinationName == "Jabalpur")  return getPrice =3749.00;  
	
if(destinationName == "Gaya")  return getPrice = 3899.00;  

if(destinationName == "Durgapur")  return getPrice = 3999.00;  
	
	else{
	System.out.println("Destination not found");
	}
	System.out.println("getFlightPriceByDestinationName method ended");
	return getPrice;
}


}