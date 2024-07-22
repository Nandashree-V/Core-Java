class LinkedInRunner{

public static void main(String[]job){
	
	
	boolean accuontcreation = LinkedIn.createLinkedlnAccount("Nandashree", "V", "nandashreev@gmail.com", "Nandashree@123" , null, "India", 0, "Xworkz", "SDE", "IT", "BE in ece");
	if(accuontcreation == true){
		LinkedIn.readLinkedlnAccount();
	}
}
}
