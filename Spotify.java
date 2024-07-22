class Spotify{

static String userEmailAddress;
static String userPassword;
static String userName;
static String userDob;
static String userGender;

  public static boolean createUserAccount(String emailAddress, String password, String name, String dob, String gender){
	   System.out.println("User Detials is as follow:--------");                    
						boolean isAccountCreated = false;
						boolean isUserNameValid = false;
						boolean isEmailAddressValid = false;
						boolean isPasswordValid = false;
						boolean isUserDobValid = false;
						boolean isUserGenderValid = false;
						
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
						if(password != null){
							userPassword = password;
							isPasswordValid =true;
							
						}
						else{
							System.out.println("Password is invalid");
						}
						if(dob != null){
							userDob = dob;
							isUserDobValid = true;
						}
						else{
							System.out.println("User Date of Birth is not valid");
						}
						
						if(gender != null){
							userGender = gender;
							isUserGenderValid = true;
						}
						else{
							System.out.println("Gender is not valid");
						}
						if(isUserNameValid==true && isEmailAddressValid==true && isUserDobValid==true && isUserGenderValid==true && isPasswordValid==true ){
							isAccountCreated = true;
						}
						return isAccountCreated;
	
}

  public static void readUserAccountDetails(){
	 
		 System.out.println("Fetch the User Details....");
		 System.out.println("The User Name is: " +userName);
		 System.out.println("The User Email Address is: " +userEmailAddress);
		 System.out.println("The User date of birth is: " +userDob);
	     System.out.println("The User Password is: " +userPassword);
         System.out.println("The User Gender is: " +userGender);
		 return;
}

  
}