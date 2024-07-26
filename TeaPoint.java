
import java.util.Arrays;

class TeaPoint{

static String teaNames[] = {null,null,null,null,null,null};
static int start = 0;

public static boolean addTeaName(String teaName){
	boolean isTeaNameAdded = false ;
	if(start < teaNames.length)
		
	 if(teaName != null){
		teaNames[start++] =teaName ; 
		isTeaNameAdded = true;
		
	}
	else{
		System.out.println("Invalid Tea Name");
	}	
	else{
		System.out.println("array index is out of bound");
	}
	return isTeaNameAdded;
}
 
 public static void getTeaNames(){
	 for( String teaName : teaNames)
		 System.out.println("The tea name is" +teaName);
 }
 
 
 public static boolean updateTeaName(String oldTeaName , String newTeaName){
	 System.out.println("update method started");
	         boolean isTeaNameUpdated = false;
	 for(int position = 0 ; position <teaNames.length;position++){
		 if(teaNames[position] == oldTeaName){
			 teaNames[position] = newTeaName;
			 isTeaNameUpdated = true;
			 
		 }
	 }
	 
		 if( isTeaNameUpdated == false){
			 System.out.println(oldTeaName +" Tea Name Not Found");
		 
	 }
	  System.out.println("update method ended");
	 return isTeaNameUpdated;
	 
 }
 
 public static boolean deleteTeaName(String teaNameToDeleted){
	 boolean isTeaNameDeleted = false;
	 int position , newPosition;
	 for(position=0 , newPosition=0 ; position<teaNames.length;position++){
		 if(teaNames[position] != teaNameToDeleted){
			 teaNames[position] = teaNames[newPosition];
			 newPosition++;
		 }
		 else{
			 isTeaNameDeleted = true;
		 }
	 }
		 int newlength = newPosition;
		 teaNames = Arrays.copyOf(teaNames, newlength);
		if(isTeaNameDeleted==false){
			System.out.println(teaNameToDeleted + "Not fount");
		}
	 return isTeaNameDeleted;
 }


}