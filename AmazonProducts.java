import java.util.Arrays;
class AmazonProducts{

static String productNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createProductsName(String productName){
	boolean isProductNameCreated = false;
	
	if(start<productNames.length){
		
	 if(productName != null){
		productNames[start++] = productName;
		isProductNameCreated = true;
	}
	else{
		System.out.println("Invalid product name");
	}
	else{
		System.out.println("Array is out of bound");
	}
	return isProductNameCreated;
}

public static void getProductNames(){
	for(String productName:productNames){
		System.out.println("The product Name is " +productName);
	}
		
}


 public static boolean updateProductName(String oldProductName , String newProductName){
	 System.out.println("update method started");
	         boolean isProductNameUpdated = false;
	 for(int position = 0 ; position <productNames.length;position++){
		 if(productNames[position] == oldProductName){
			 productNames[position] = newProductName;
			 isProductNameUpdated = true;
			 
		 }
	 }
	 
		 if( isProductNameUpdated == false){
			 System.out.println(oldProductName +" Product Name Not Found");
		 
	 }
	  System.out.println("update method ended");
	 return isProductNameUpdated;
	 
 }
 
 public static boolean deleteProductName(String productNameToDeleted){
	 boolean isProductNameDeleted = false;
	 int position , newPosition;
	 for(position=0 , newPosition=0 ; position<productNames.length;position++){
		 if(productNames[position] != productNameToDeleted){
			 productNames[position] = productNames[newPosition];
			 newPosition++;
		 }
		 else{
			 isProductNameDeleted = true;
		 }
	 }
		 int newlength = newPosition;
		 productNames = Arrays.copyOf(productNames, newlength);
		if(isProductNameDeleted==false){
			System.out.println(productNameToDeleted + "Not found");
		}
	 return isProductNameDeleted;
 }

}
	
	
	

