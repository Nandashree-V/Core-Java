class SangeetaMobiles{

static double price = 0.0 ;

public static double getPrice(String brandName){

System.out.println("getPrice method started");
 if(brandName==	"Apple iPhone 13 Pro Blue" ){
    price = 129900.00;
	return price;
 }
 if(brandName=="realme 12pro"){
	 price = 31999.00;
	 return price;
 }
if(brandName=="Samsung Galaxy A15"){
	price = 22599.00;
	return price;
}
if(brandName=="Vivo V30e"){
	price= 27999.00;
	return price;
}
if (brandName=="OPPO F27 Pro"){
	price = 27999.000;
	return price;
}
if(brandName=="Nothing Phone 2 256"){
	price = 36614.00;
	return price;
}
if(brandName=="Xiaomi 14 Civi"){
	price= 47999.00;
	return  price;
}
if(brandName=="Redmi Note 12 5G"){
	price = 14999.00;
	return price;
}
if(brandName=="Tecno Phantom V Flod 5G"){
	price = 69999.00;
	return price;
}
if(brandName == "Itel S23 128GB"){
	price = 7299.00;
	return price;
}
if(brandName=="Kechaoda The King Of Music"){
	price = 1223.00;
	return price;
}
if(brandName == "vertu ASTER P OSTRICH"){
	price = 125000.00;
	return price;
}
if(brandName=="Infinix Note 40 5G"){
	price = 19999.00;
	return price;
}
if(brandName=="Lava Z2 Max"){
	price = 2999.00;
	return price;
}
if(brandName=="Gfive Rose 114"){
	price=975.00;
	return price;
}
if(brandName=="IVertu 5G Calf Leather Dawning Orange Android Mobile Phone"){
	price = 249999.00;
	return price;
}
if(brandName=="KENXINDA V8 Mobile Phone"){
	price = 6999.00;
	return price;
}
else{
	System.out.println("The Brabd Name is Not found");
}

System.out.println("getPrice method ended");
return price;

}


}