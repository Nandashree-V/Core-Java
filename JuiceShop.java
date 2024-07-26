 import java.util.Arrays;
class JuiceShop{

static String juiceNames[] = {null,null,null,null,null,null};
static int start = 0;
public static boolean createJuiceNames(String juiceName){
	boolean isJuiceNameCreated = false;
	if(start<juiceNames.length)
	if(juiceName != null){
		juiceNames[start++] = juiceName;
		isJuiceNameCreated = true;
	}
	else{
		System.out.println("Invalid juice name");
	}
	else{
		System.out.println("Array is out of bound");
	}
	return isJuiceNameCreated;
}

public static void getJuiceNames(){
	for(String juiceName:juiceNames){
		System.out.println("The Juice Name is " +juiceName);
	}
		
}

public static boolean updateJuiceName(String oldJuiceName , String newJuiceName){
	System.out.println("update method started");
	
	boolean isJuiceNameUpdated= false;
	for(int position = 0 ; position<juiceNames.length;position++){
		if(juiceNames[position] == oldJuiceName){
			juiceNames[position] = newJuiceName;
			isJuiceNameUpdated = true;
		}
	}
		 if( isJuiceNameUpdated == false){
			 System.out.println(oldJuiceName +" Juice Name Not Found");
		 
	 }
	  System.out.println("update method ended");
	 return isJuiceNameUpdated;

	}
	
	public static boolean deleteJuiceName(String  juiceNameToDelete){
		boolean isJuiceNameDeleted = false;
		
		int position , newPosition;
	 for(position=0 , newPosition=0 ; position<juiceNames.length;position++){
		 if(juiceNames[position] != juiceNameToDelete){
			 juiceNames[position] = juiceNames[newPosition];
			 newPosition++;
		 }
		 else{
			 isJuiceNameDeleted = true;
		 }
	 }
		 int newlength = newPosition;
		 juiceNames = Arrays.copyOf(juiceNames, newlength);
		if(isJuiceNameDeleted==false){
			System.out.println(juiceNameToDelete + "Not found");
		}
	 return isJuiceNameDeleted;
 }
}








	
