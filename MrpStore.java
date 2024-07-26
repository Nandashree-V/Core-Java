
import java.util.Arrays;

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
		public static boolean updateAlcoholName(String oldAlcoholName , String newAlcoholName){
	 System.out.println("update method started");
	         boolean isAlcoholNameUpdated = false;
	 for(int position = 0 ; position <alcoholNames.length;position++){
		 if(alcoholNames[position] == oldAlcoholName){
			 alcoholNames[position] = newAlcoholName;
			 isAlcoholNameUpdated = true;
			 
		 }
	 }
	 
		 if( isAlcoholNameUpdated == false){
			 System.out.println(oldAlcoholName +" Alcohol Name Not Found");
		 
	 }
	  System.out.println("update method ended");
	 return isAlcoholNameUpdated;
	 
 }
 
 public static boolean deleteAlcoholName(String alcoholNameToDeleted){
	 boolean isAlcoholNameDeleted = false;
	 int position , newPosition;
	 for(position=0 , newPosition=0 ; position<alcoholNames.length;position++){
		 if(alcoholNames[position] != alcoholNameToDeleted){
			 alcoholNames[position] = alcoholNames[newPosition];
			 newPosition++;
		 }
		 else{
			 isAlcoholNameDeleted = true;
		 }
	 }
		 int newlength = newPosition;
		 alcoholNames = Arrays.copyOf(alcoholNames, newlength);
		if(isAlcoholNameDeleted==false){
			System.out.println(alcoholNameToDeleted + "Not found");
		}
	 return isAlcoholNameDeleted;
 }

}




