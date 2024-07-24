class TouristCompany{

static String placeNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createPlaceName(String placeName){
	boolean isPlaceNameCreated = false;
	
	if(start< placeNames.length){
		System.out.println("Array is out of bound");
	}
	if(placeName != null){
		placeNames[start++] = placeName;
		isPlaceNameCreated = true;
	}
	else{
		System.out.println("Invalid place name");
	}
	return isPlaceNameCreated;
}

public static void getPlaceNames(){
	for(String placeName:placeNames){
		System.out.println("The place Name is " +placeName);
	}
		
}

}