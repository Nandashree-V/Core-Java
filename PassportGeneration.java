class PassportGeneration{
	
	static  String cpv ;
	static String dcdr ;
	static String userName ;
	static String userSurName;
	static String dateOFBirth;
	static String emailId;
	static boolean isLoginIdSame ;
	static String givenLoginId;
	static String userPassword;
	static String userConfirmPassword;
	static String question;
	static  String answer;
	static String givenCaptcha;

 public static boolean createUserPassport(String cpvLocation,String dcdrLocation, String givenName,String surName,String dob, String emailAddress,
                                               boolean isLoginIdSameAsEmail,String loginId,String password, String confirmPassword, String hintQuestion ,
											   String hintAnswer,String captcha){
											   System.out.println("User Details Created");
											   boolean isPassportCreated = false;
											   boolean isCpvLocationValid =false;
											   boolean isDcdrLocationValid =false;
											   boolean isGivenNameValid =false;
											   boolean isUserNameValid =false;
											   boolean isUserSurNameValid=false;
											   boolean isUserDobValid =false;
											   boolean isEmailAddressValid=false;
											   boolean isLoginIdvalid=false;
											   boolean isPasswordValid=false;
											   boolean isConfirmPasswordValid=false;
											   boolean isHintQuestionValid=false;
											   boolean isHintAnswerValid=false;
											   boolean isCaptchaValid=false;
											  
											   //validation/null check
											   if(cpvLocation != null){
											   cpv = cpvLocation;
											    isCpvLocationValid =true;
											   }
											   else{
												   System.out.println("Cpv Location is not valid");
											   }
												 
											   if(dcdrLocation !=null){
											   dcdr = dcdrLocation;
										        isDcdrLocationValid = true;
											   }
											   else {
												   System.out.println("DCDR Location is invalid");
											   }
											   
											   if(givenName != null){
											   userName = givenName;
											   isGivenNameValid = true;
											   }
											   else{
												   System.out.println("Given name is in valid");
											   }
											   
											 if(surName != null){
											   userSurName = surName;
											   isUserSurNameValid= true;
											 }
											   else {
												   System.out.println("Sur Name cannot br null");
												   
											 }
											 if(dob != null){
											   dateOFBirth = dob;
											   isUserDobValid = true;
											 }
											   else{
												   System.out.println("Date of birth is not valid");
											   }
											   if(emailAddress != null){
											   emailId = emailAddress;
											   isEmailAddressValid = true;
											   }
											   else{
												   System.out.println("Email Address is not Valid");
											   }
											   
											 
											   isLoginIdSame = isLoginIdSameAsEmail;
										   
											   
											   if(loginId != null){
											   givenLoginId = loginId;
											     isLoginIdvalid =true;
											   }
											   else{
												   System.out.println("Login Id is invalid");
											   }
											   
											   if(password != null){
											   userPassword = password;
											   isPasswordValid =true;
											   }
											   else{
											   System.out.println("Password is not Valid");
											   }
											   
											   if(confirmPassword!=null){
											   userConfirmPassword = confirmPassword;
											   isConfirmPasswordValid =true;
											   }
											   else {
												   System.out.println("Confirm password is not same as given password");
											   }
											   if(hintQuestion != null){
											   question = hintQuestion;
											   isHintQuestionValid =true;
											   }
											   else
												   System.out.println("Hint Question is invalid");
											   
											   if(hintAnswer != null){
											   answer = hintAnswer;
											   isHintAnswerValid = true;
											   }
											   else{
												   System.out.println("Hint Answer is not Valid");
											   }
											   if(captcha != null){
											   givenCaptcha = captcha;
											   isCaptchaValid = true;
											   }
											   else{
												   System.out.println("Captcha not Valid");
											   }
											 
											   if(isCpvLocationValid == true && isDcdrLocationValid == true && isGivenNameValid == true && isUserDobValid ==true
											   && isUserSurNameValid==true && isEmailAddressValid==true && isLoginIdvalid==true && isPasswordValid==true && isConfirmPasswordValid==true
											   && isHintQuestionValid==true && isHintAnswerValid==true && isCaptchaValid==true){
											   isPassportCreated = true;
											   }
											   

return isPassportCreated;
}
     public static void readUserPassportDetails(){
		 
		 System.out.println("Fetch the User Details....");
		 
		 System.out.println("The User CPV Location is: " +cpv);
		 System.out.println("The User DCDR Location is: " +dcdr);
		 System.out.println("The User Name is: " +userName);
		 System.out.println("The User SurName is: "  +userSurName);
		 System.out.println("The User Date of Birth is: " +dateOFBirth);
		 System.out.println("The User Email Address is : " +emailId);
		 System.out.println("The User Login is same as email address? " +isLoginIdSame);
		 System.out.println("The User Login Id is: " +givenLoginId);
		 System.out.println("The User Password is: " +userPassword);
		 System.out.println("The User Confirm Password: " +userConfirmPassword);
		 System.out.println("The User hint Question is: " +question);
		 System.out.println("The User hint Answer is: " +answer);
	     System.out.println("The User Captcha: " +givenCaptcha);
		  
		  System.out.println("The User Detials is read");
		 
		 return;
	 }

}