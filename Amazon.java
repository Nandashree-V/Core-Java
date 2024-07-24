class Amazon{

static String userName;
static String userEmailAddress;
static long userPhoneNumber;
static String userCountryCode;
static String userPassword;
static String  passwordConfirmation;

  public static boolean createUserAccount(String name ,String emailAddress, long phoneNumber, String countryCode, String password, String confirmPassword){
                      
					  System.out.println("User Detials is as follow:--------");                    
						boolean isAccountCreated = false;
						isAccountCreated=validationCheck(name,emailAddress,phoneNumber,countryCode,password,confirmPassword);
						
						return isAccountCreated;
	
}

public static boolean validationCheck(String name ,String emailAddress, long phoneNumber, String countryCode, String password, String confirmPassword){
	                   boolean isValidationChecked= false;
	                   boolean isUserNameValid = false;
						boolean isEmailAddressValid = false;
						boolean isPhoneNumberValid = false;
						boolean isCountryCodeValid = false;
						boolean isPasswordValid = false;
						boolean isConfirmPasswordValid = false;
						
						if(name != null){
							userName = name;
							isUserNameValid =true;
						}
						else{
							System.out.println("User Name is not Valid");
						}
						if(emailAddress != null){
							userEmailAddress = emailAddress;
							isEmailAddressValid = true;
						}
						else{
							System.out.println("Email Address is invalid");
						}
						if(phoneNumber>0){
							userPhoneNumber =phoneNumber;
							isPhoneNumberValid = true;
						}
						else{
							System.out.println("Phone number is not valid");
						}
						if(countryCode != null){
							userCountryCode = countryCode;
							isCountryCodeValid = true;
						}
						else{
							System.out.println("Country code is invalid");
						}
						if(password != null){
							userPassword = password;
							isPasswordValid =true;
							
						}
						else{
							System.out.println("Password is invalid");
						}
						if(confirmPassword != null){
							passwordConfirmation = confirmPassword;
							isConfirmPasswordValid = true;
						}
						else{
							System.out.println("Confirm password is not same is given Password");
						}
						
						if(isUserNameValid==true && isEmailAddressValid==true && isPhoneNumberValid==true && isCountryCodeValid==true && isPasswordValid==true 
						    && isConfirmPasswordValid==true){
							isValidationChecked = true;
						}
		return isValidationChecked;				
}

  public static void readUserAccountDetails(){
	 
		 System.out.println("Fetch the User Details....");
		 System.out.println("The User Name is: " +userName);
		 System.out.println("The User Email Address is: " +userEmailAddress);
		 System.out.println("The User Phone Number is: " +userPhoneNumber);
		 System.out.println("The User Country code is: " +userCountryCode);
	     System.out.println("The User Password is: " +userPassword);
         System.out.println("The User password Confirmation" +passwordConfirmation);
		 return;
}


}