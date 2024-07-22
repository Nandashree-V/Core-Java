class XworkzRunner{
	public static void main(String[] args){
		
		boolean registrationComplete = Xworkz.createregistration("Nandashree", "nandashreev2002@gmail.com", 8660802287l, 9456873124l, "1SG20EC071", "2024", "ECE", "BE");
			
		if(registrationComplete==true){
			Xworkz.readRegistrationDetails();
		}
	}


}