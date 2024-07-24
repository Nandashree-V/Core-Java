class AmazonProducts{

static String productNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createProductsName(String productName){
	boolean isProductNameCreated = false;
	
	if(start<productNames.length){
		System.out.println("Array is out of bound");
	}
	if(productName != null){
		productNames[start++] = productName;
		isProductNameCreated = true;
	}
	else{
		System.out.println("Invalid product name");
	}
	return isProductNameCreated;
}

public static void getProductNames(){
	for(String productName:productNames){
		System.out.println("The product Name is " +productName);
	}
		
}
}
	
	
	

