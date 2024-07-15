class RechargePlans{

static double  getPrice = 0.0;

public static double  getPriceByPlanName(String rechargeName){

System.out.println("return getPriceForPlans method started");
if (rechargeName == "2GB/day")	 return getPrice= 223;
	
if (rechargeName== "1GB/day") return getPrice = 249;

if (rechargeName== "100MB/day + 200MB")	 return getPrice= 91;
	
if (rechargeName== "6GB Data 84 Days") return getPrice = 479;
	
if (rechargeName== "2GB Data 28 Days") return getPrice = 189;
	
if (rechargeName== "1GB/day Data 28 Days") 	return getPrice = 122;

if (rechargeName== "1.5GB/Day Data 70 Days") return getPrice = 666;

if (rechargeName== "0.5GB/day") 	return getPrice = 152;

if (rechargeName== "Annual IR Pack 2GB") return getPrice = 2799 ;

if (rechargeName== "1.5GB/Day Data for 28 Days Pack")	return getPrice = 299;

if (rechargeName== "1.5GB/day Data for 84 Days Pack")	return getPrice = 799;

if (rechargeName== "1GB/Day Data for 22 Days Pack") return getPrice = 209;
	
if (rechargeName== "2GB/Day + 20GB Data for 90 Days Pack") return getPrice = 899;

if (rechargeName== "Unlimited Calling with 2GB/28 days Data for 336 Days")	return getPrice = 895;

if (rechargeName== "1.5GB/Day Data for 22 Days Pack")	return getPrice =  239;

else{
	System.out.println("Plan not found");
}
	


System.out.println("return getPriceForPlans method ended");
 return getPrice;

}


}