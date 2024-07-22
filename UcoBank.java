class UcoBank{
	
	static String userName;
	static long phoneNumber;
	static String currentState;
	static String userPermanentAddress;
	static String userCorrespondenceAddress;
	static long userAadharNumber;
	static String userFatherName;

 public static boolean createBankAccount(String name, long mobileNumber, String state, String permanentAddress, String correspondenceAddress, 
                                         String fatherName, long aadharNumber){
											 boolean isAccountCreated = false;
											 boolean isUserNameValid = false;
											 boolean isPhoneNumberValid = false;
											 boolean isCurrentStateValid = false;
											 boolean isPermanentAddressValid = false;
											 boolean isCorrespondenceAddressValid = false;
											 boolean isAadharNumberValid = false;
											 boolean isFatherNameValid = false;
											 
											 
											 if(name != null){
												 userName = name;
												 isUserNameValid=true;
											 }
											 else{
												 System.out.println("The User name is invalid ");
											 }
											 if(mobileNumber>0){
												 phoneNumber = mobileNumber;
												 isPhoneNumberValid = true;
											 }
											  else{
												 System.out.println("The User phone number is invalid ");
											 }
											 if(state != null){
												 currentState = state;
												 isCurrentStateValid= true;
											 }
											  else{
												 System.out.println("The User current State is invalid ");
											 }
											 if(permanentAddress != null){
												 userPermanentAddress = permanentAddress;
												 isPermanentAddressValid =true;
											 }
											  else{
												 System.out.println("The User permanent Address is invalid ");
											 }
											 if(correspondenceAddress != null){
												 userCorrespondenceAddress = correspondenceAddress;
												 isCorrespondenceAddressValid = true;
											 }
											  else{
												 System.out.println("The User correspondence Address is invalid ");
											 }
											 if(fatherName != null){
												 userFatherName = fatherName;
												 isFatherNameValid = true;
											 }
											  else{
												 System.out.println("The User  Father name is invalid ");
											 }
											 if(aadharNumber>0){
												 userAadharNumber = aadharNumber;
												 isAadharNumberValid =true;
											 }
											  else{
												 System.out.println("The User aadhar number is invalid ");
											 }
											 
											 if(isUserNameValid==true && isPhoneNumberValid==true && isCurrentStateValid==true && isCorrespondenceAddressValid==true 
											         && isFatherNameValid==true && isAadharNumberValid==true && isPermanentAddressValid==true){
														 isAccountCreated = true;
													 }
													 return isAccountCreated;
	 
	 
	 
 }
 
 public static void readAccountDetails(){
	 
	 System.out.println("The User Name is:" +userName);
	  System.out.println("The User mobileNumber is: " +phoneNumber);
	 System.out.println("The User state is: " +currentState);
	 System.out.println("The User permanentAddress is: " +userPermanentAddress);
	 System.out.println("The User correspondenceAddress is: " +userCorrespondenceAddress);
	 System.out.println("The User fatherName is: " +userFatherName);
	 System.out.println("The User aadharNumber is: " +userAadharNumber);
	 return;

 }
}