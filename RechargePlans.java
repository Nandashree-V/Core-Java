class RechargePlans{

static double getPrice = 0.0;

public static double getPriceByPlanName(String rechargeName){

System.out.println("getPriceForPlans method started");
if (rechargeName== "2GB/day"){
	getPrice = 223;
	return getPrice;
	
}
if (rechargeName== "1GB/day"){
	getPrice = 249;
	return getPrice;
	
}
if (rechargeName== "100MB/day + 200MB"){
	getPrice = 91;
	return getPrice;
	
}
if (rechargeName== "6GB Data 84 Days"){
	getPrice = 479;
	return getPrice;
	
}
if (rechargeName== "2GB Data 28 Days"){
	getPrice = 189;
	return getPrice;
	
}
if (rechargeName== "1GB/day Data 28 Days"){
	getPrice = 122;
	return getPrice;
	
}
if (rechargeName== "1.5GB/Day Data 70 Days"){
	getPrice = 666;
	return getPrice;
	
}
if (rechargeName== "0.5GB/day"){
	getPrice = 152;
	return getPrice;
	
}
if (rechargeName== "Annual IR Pack 2GB"){
	getPrice = 2799 ;
	return getPrice;
	
}
if (rechargeName== "1.5GB/Day Data for 28 Days Pack"){
	getPrice = 299;
	return getPrice;
	
}
if (rechargeName== "1.5GB/day Data for 84 Days Pack"){
	getPrice = 799;
	return getPrice;
	
}
if (rechargeName== "1GB/Day Data for 22 Days Pack"){
	getPrice = 209;
	return getPrice;
	
}
if (rechargeName== "2GB/Day + 20GB Data for 90 Days Pack"){
	getPrice = 899;
	return getPrice;
	
}
if (rechargeName== "Unlimited Calling with 2GB/28 days Data for 336 Days"){
	getPrice = 895;
	return getPrice;
	
}
if (rechargeName== "1.5GB/Day Data for 22 Days Pack"){
	getPrice =  239;
	return getPrice;
	
}
else{
	System.out.println("Plan not found");
}
	


System.out.println("getPriceForPlans method ended");
return getPrice;

}


}