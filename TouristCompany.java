import java.util.Arrays;

class TouristCompany{

static String placeNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createPlaceName(String placeName){
	boolean isPlaceNameCreated = false;
	
	if(start>= placeNames.length){
		System.out.println("Array is out of bound");
	}
	else if(placeName != null){
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
public static boolean updatePlaceName(String oldPlaceName , String newPlaceName){
	 System.out.println("update method started");
	         boolean isPlaceNameUpdated = false;
	 for(int position = 0 ; position <placeNames.length;position++){
		 if(placeNames[position] == oldPlaceName){
			 placeNames[position] = newPlaceName;
			 isPlaceNameUpdated = true;
			 
		 }
	 }
	 
		 if( isPlaceNameUpdated == false){
			 System.out.println(oldPlaceName +" Place Name Not Found");
		 
	 }
	  System.out.println("update method ended");
	 return isPlaceNameUpdated;
	 
 }
 
 public static boolean deletePlaceName(String placeNameToDeleted){
	 boolean isPlaceNameDeleted = false;
	 int position , newPosition;
	 for(position=0 , newPosition=0 ; position<placeNames.length;position++){
		 if(placeNames[position] != placeNameToDeleted){
			 placeNames[newPosition] = placeNames[position];
			 newPosition++;
		 }
		 else{
			 isPlaceNameDeleted = true;
		 }
	 }
		 int newlength = newPosition;
		 placeNames = Arrays.copyOf(placeNames, newlength);
		if(isPlaceNameDeleted==false){
			System.out.println(placeNameToDeleted + "Not found");
		}
	 return isPlaceNameDeleted;
 }
}