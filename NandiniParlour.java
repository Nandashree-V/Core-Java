class NandiniParlour{

public static double getProductPriceByName(String milkProductName){

System.out.println("getProductPriceByName method started");
double  getPrice = 0.0 ;

if(milkProductName == "Paneer 1kg") return getPrice = 400.00;

if(milkProductName == "Cheddae Cheese 1kg") return getPrice = 450.00; 

if(milkProductName == "Nandini Capsicum Processed cheese Spread 200g") return getPrice = 90.00; 

if(milkProductName == "Cheese Slices 200gm") return getPrice = 130.00; 

if(milkProductName == "ghee 100ml" ) return getPrice = 78.00; 

if(milkProductName == "Butter Salted 500gm") return getPrice = 265.00; 

if(milkProductName == "Flavoured Milk-Badam 200ml") return getPrice = 25.00; 

if(milkProductName == "Plain Lassi 200ml") return getPrice = 20.00; 

if(milkProductName == "Nandini GoodLife Milk 1liter") return getPrice = 48.00; 

if(milkProductName == "Slim Milk 500ml") return getPrice = 24.00; 

else {
	System.out.println("Milk Product Name doesn't found");
}


System.out.println("getProductPriceByName method ended");
return getPrice;

}

public static double getProductPriceByName(String milkProductName,int quantity){

System.out.println("getProductPriceByName method started");
double  getPrice = 0.0 ;

if(milkProductName == "Paneer 1kg") return getPrice = 400.00 *quantity;

if(milkProductName == "Cheddae Cheese 1kg") return getPrice = 450.00 *quantity; 

if(milkProductName == "Nandini Capsicum Processed cheese Spread 200g") return getPrice = 90.00 *quantity; 

if(milkProductName == "Cheese Slices 200gm") return getPrice = 130.00 *quantity; 

if(milkProductName == "ghee 100ml" ) return getPrice = 78.00 *quantity; 

if(milkProductName == "Butter Salted 500gm") return getPrice = 265.00 *quantity; 

if(milkProductName == "Flavoured Milk-Badam 200ml") return getPrice = 25.00 *quantity; 

if(milkProductName == "Plain Lassi 200ml") return getPrice = 20.00 *quantity; 

if(milkProductName == "Nandini GoodLife Milk 1liter") return getPrice = 48.00 *quantity; 

if(milkProductName == "Slim Milk 500ml") return getPrice = 24.00 *quantity; 

else {
	System.out.println("Milk Product Name doesn't found");
}


System.out.println("getProductPriceByName method ended");
return getPrice;

}



}