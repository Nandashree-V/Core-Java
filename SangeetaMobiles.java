class SangeetaMobiles{

static double  price = 0.0 ;

public static double getPrice(String brandName){

System.out.println("getPrice method started");

 if(brandName==	"Apple iPhone 13 Pro Blue" )   return price = 129900.00;

 if(brandName=="realme 12pro")	 return price = 31999.00;

if(brandName=="Samsung Galaxy A15")	  return price = 22599.00;

if(brandName=="Vivo V30e") return price = 27999.00;
	
if (brandName=="OPPO F27 Pro") return price = 27999.000;
	
if(brandName=="Nothing Phone 2 256") return price = 36614.00;
	
if(brandName=="Xiaomi 14 Civi") return	price= 47999.00;

if(brandName=="Redmi Note 12 5G")	return price = 14999.00;

if(brandName=="Tecno Phantom V Flod 5G")	return price = 69999.00;

if(brandName == "Itel S23 128GB")	return price = 7299.00;

if(brandName=="Kechaoda The King Of Music") return price = 1223.00;
	
if(brandName == "vertu ASTER P OSTRICH") 	return price = 125000.00;
	
if(brandName=="Infinix Note 40 5G") 	return price = 19999.00;

if(brandName=="Lava Z2 Max") return price = 2999.00;

if(brandName=="Gfive Rose 114") return	price=975.00;

if(brandName=="IVertu 5G Calf Leather Dawning Orange Android Mobile Phone") return price = 249999.00;
	
if(brandName=="KENXINDA V8 Mobile Phone") return price = 6999.00;
	
else{
	System.out.println("The Brabd Name is Not found");
}

System.out.println("getPrice method ended");
return price ;

}


}