class NandiniParlour{

public static double getProductPriceByName(String milkProductName){

System.out.println("getProductPriceByName method started");
double getPrice = 0.0 ;

if(milkProductName == "Paneer 1kg"){
	getPrice = 400.00;
	return getPrice;
}
if(milkProductName == "Cheddae Cheese 1kg"){
	getPrice = 450.00;
	return getPrice;
}
if(milkProductName == "Nandini Capsicum Processed cheese Spread 200g"){
	getPrice = 90.00;
	return getPrice;
}
if(milkProductName == "Cheese Slices 200gm"){
	getPrice = 130.00;
	return getPrice;
}
if(milkProductName == "ghee 100ml" ){
	getPrice = 78.00;
	return getPrice;
}
if(milkProductName == "Butter Salted 500gm"){
	getPrice = 265.00;
	return getPrice;
}
if(milkProductName == "Flavoured Milk-Badam 200ml"){
	getPrice = 25.00;
	return getPrice;
}
if(milkProductName == "Plain Lassi 200ml"){
	getPrice = 20.00;
	return getPrice;
}
if(milkProductName == "Nandini GoodLife Milk 1liter"){
	getPrice = 48.00;
	return getPrice;
}
if(milkProductName == "Slim Milk 500ml"){
	getPrice = 24.00;
	return getPrice;
}
else{
	System.out.println("Milk Product Name doesn't found");
}


System.out.println("getProductPriceByName method ended");
return getPrice;

}


}