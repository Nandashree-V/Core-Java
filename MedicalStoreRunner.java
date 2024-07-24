class MedicalStoreRunner{

public static void main(String[] args){
	System.out.println("main started");
	
	boolean medicineName = MedicalStore.createMedicineName("Atorvastatin");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Omeprazole");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Chikkamagaluru");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Levothyroxine");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Metformin");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Albuterol");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Losartan");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Amlodipine");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Gabapentin");
	System.out.println("The medicine name is added " +medicineName);
	
	medicineName = MedicalStore.createMedicineName("Lisinopril");
	System.out.println("The medicine name is added " +medicineName);
	
	
	MedicalStore.getMedicineNames();
	System.out.println("main ended");
}
}