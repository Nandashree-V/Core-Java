class MedicalStore{

static String medicineNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start = 0;

public static boolean createMedicineName(String medicineName){
	boolean isMedicineNameCreated = false;
	
	if(start < medicineNames.length){
		System.out.println("Array is out of bound");
	}
	if(medicineName != null){
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

}