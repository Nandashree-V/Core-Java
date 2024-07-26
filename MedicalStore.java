import java.util.Arrays;

class MedicalStore{

static String medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createMedicineName(String medicineName){
	boolean isMedicineNameCreated = false;
	
	if(start >= medicineNames.length){
		System.out.println("Array is out of bound");
	}
	else if(medicineName != null){
		medicineNames[start++] = medicineName;
		isMedicineNameCreated = true;
	}
	else{
		System.out.println("Invalid medicine name");
	}
	return isMedicineNameCreated;
}

public static void getMedicineNames(){
	for(String medicineName:medicineNames){
		System.out.println("The medicine Name is " +medicineName);
	}
		
}
public static boolean updateMedicineName(String oldMedicineName , String newMedicineName){
	 System.out.println("update method started");
	         boolean isMedicineNameUpdated = false;
	 for(int position = 0 ; position <medicineNames.length;position++){
		 if(medicineNames[position] == oldMedicineName){
			 medicineNames[position] = newMedicineName;
			 isMedicineNameUpdated = true;
			 
		 }
	 }
	 
		 if( isMedicineNameUpdated == false){
			 System.out.println(oldMedicineName +" Medicine Name Not Found");
		 
	 }
	  System.out.println("update method ended");
	 return isMedicineNameUpdated;
	 
 }
 
 public static boolean deleteMedicineName(String medicineNameToDeleted){
	 boolean isMedicineNameDeleted = false;
	 int position , newPosition;
	 for(position=0 , newPosition=0 ; position<medicineNames.length;position++){
		 if(medicineNames[position] != medicineNameToDeleted){
			 medicineNames[newPosition] = medicineNames[position];
			 newPosition++;
		 }
		 else{
			 isMedicineNameDeleted = true;
		 }
	 }
		 int newlength = newPosition;
		 medicineNames = Arrays.copyOf(medicineNames, newlength);
		if(isMedicineNameDeleted==false){
			System.out.println(medicineNameToDeleted + "Not found");
		}
	 return isMedicineNameDeleted;
 }

}