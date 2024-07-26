class MedicalStoreRunner{

public static void main(String[] args){
	System.out.println("main started");
	
	boolean MedicineName = MedicalStore.createMedicineName("Atorvastatin");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Omeprazole");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Chikkamagaluru");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Levothyroxine");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Metformin");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Albuterol");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Losartan");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Amlodipine");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Gabapentin");
	System.out.println("The Medical name is added " +MedicineName);
	
	MedicineName = MedicalStore.createMedicineName("Lisinopril");
	System.out.println("The Medical name is added " +MedicineName);
	
	
	MedicalStore.getMedicineNames();
	
	 boolean updateName = MedicalStore.updateMedicineName("Losartan" , "Dolo");
  System.out.println("The updated Medical name is "  +updateName);
  MedicalStore. getMedicineNames();
  
  boolean deletMedicineName = MedicalStore.deleteMedicineName("Albuterol");
    System.out.println("The deleted Medical name is: " +deletMedicineName);
	MedicalStore.getMedicineNames();
	System.out.println("main ended");
}
}