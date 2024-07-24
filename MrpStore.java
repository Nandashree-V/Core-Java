class  MrpStore{
	
	static String alcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createAlcoholName(String alcoholName){
	boolean isAlcoholNameCreated = false;
	
	if(start < alcoholNames.length){
		System.out.println("Array is out of bound");
	}
	if(alcoholName != null){
		alcoholNames[start++] = alcoholName;
		isAlcoholNameCreated = true;
	}
	else{
		System.out.println("Invalid alcohol name");
	}
	return isAlcoholNameCreated;
}

public static void getAlcoholNames(){
	for(String alcoholName:alcoholNames){
		System.out.println("The product Name is " +alcoholName);
	}
		
}




}