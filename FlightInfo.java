class FlightInfo{

public static double getFlightPriceByDestinationName(String destinationName){
	System.out.println("getFlightPriceByDestinationName method started");
	double getPrice = 0.0;
	//From Delhi
	if(destinationName == "Gwalior"){
		getPrice = 1195.00;
		return getPrice;
	}
	if(destinationName == "Bathinda"){
		getPrice = 1260.00;
		return getPrice;
	}
	if(destinationName == "Jaipur"){
		getPrice = 1334.00;
		return getPrice;
	}
if(destinationName == "Dehradun"){
		getPrice = 1543.00;
		return getPrice;
	}
if(destinationName == "Udaipur"){
		getPrice = 2174.00;
		return getPrice;
	}
if(destinationName == "Kanpur"){
		getPrice = 2249;
		return getPrice;
	}
if(destinationName == "Lucknow"){
		getPrice = 2300;
		return getPrice;
	}
if(destinationName == "Chandigarh"){
		getPrice = 2384.00;
		return getPrice;
	}
if(destinationName == "Pantnagar"){
		getPrice = 2647.00;
		return getPrice;
	}
if(destinationName == "Amritsar"){
		getPrice = 2799.00;
		return getPrice;
	}
if(destinationName == "Ayodhya"){
		getPrice = 28109.00;
		return getPrice;
	}
if(destinationName == "Shimla"){
		getPrice = 2849.00;
		return getPrice;
	}
if(destinationName == "Ahmedabad"){
		getPrice = 2941.00;
		return getPrice;
	}
if(destinationName == "Bhopal"){
		getPrice =3229.00;
		return getPrice;
	}
if(destinationName == "Prayagraj"){
		getPrice =3013.00;
		return getPrice;
	}
if(destinationName == "Nagpur"){
		getPrice = 3643.00;
		return getPrice;
	}
if(destinationName == "Indore"){
		getPrice = 3644.00;
		return getPrice;
	}
if(destinationName == "Baroda"){
		getPrice = 3853.00;
		return getPrice;
	}
if(destinationName == "Jabalpur"){
		getPrice =3749.00;
		return getPrice ;
	}
if(destinationName == "Gaya"){
		getPrice = 3899.00;
		return getPrice;
	}
if(destinationName == "Durgapur"){
		getPrice = 3999.00;
		return getPrice;
	}	
	else{
		System.out.println("Destination not found");
	}
	
	System.out.println("getFlightPriceByDestinationName method ended");
	return getPrice;
}


}