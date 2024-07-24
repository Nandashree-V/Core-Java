class Xworkz{

static String userFullName;
static String emailAddress;
static long phoneNumber;
static long userWhatsappnumber;
static String usn;
static String yop; 
static String stream;
static String qualification;
public static boolean createregistration(String fullName, String emailId, long mobileNumber, long whatsappNumber, String universitySeatNumber, String yearOfPassout,
                                                            String streamStudied, String qualificationDegree){
														boolean   isRegistrationCompleted = false;
			isRegistrationCompleted = validateUserDetails(fullName,emailId,mobileNumber,whatsappNumber,universitySeatNumber,yearOfPassout,streamStudied,qualificationDegree);
														return isRegistrationCompleted;
														
		  
}

public static boolean validateUserDetails(String fullName, String emailId, long mobileNumber, long whatsappNumber, String universitySeatNumber, String yearOfPassout,
                                                            String streamStudied, String qualificationDegree){
                                                    boolean isValidationCompleted=false;
 													   boolean   isUserNameValid=false;
														boolean isEmailAddressValid = false;
														boolean isPhoneNumberValid = false;
														boolean isWhatsappNumberValid = false;
														boolean isUsnValid = false;
														boolean isYopValid = false;
														boolean isStreamValid = false;
														boolean isQualificationValid = false;
														
														if(fullName!= null ){
															userFullName = fullName;
															isUserNameValid = true;
														}
														else{
														System.out.println("Invalid UserName");
														}
														if(mobileNumber > 0 ){
															phoneNumber = mobileNumber;
															isPhoneNumberValid = true;
														}
														else{
														System.out.println("Invalid Phone Number");
														}
														if(whatsappNumber > 0 ){
															userWhatsappnumber = whatsappNumber;
															isWhatsappNumberValid= true;
														}
														else{
														System.out.println("Invalid whatsappNumber");
														}
														if(emailId != null ){
															emailAddress =emailId;
															isEmailAddressValid = true;
														}
														else{
														System.out.println("Invalid emailAddress");
														}
														if(universitySeatNumber!= null ){
															usn= universitySeatNumber;
															isUsnValid = true;
														}
														else{
														System.out.println("Invalid universitySeatNumber");
														}
														if(yearOfPassout != null ){
															yop = yearOfPassout;
															isYopValid = true;
														}
														else{
														System.out.println("Invalid yearOfPassout");
														}
														if(streamStudied != null ){
															stream =streamStudied;
															isStreamValid = true;
														}
														else{
														System.out.println("Invalid stream");
														}
														if(qualificationDegree != null ){
															qualification = qualificationDegree;
															isQualificationValid = true;
														}
														else{
														System.out.println("Invalid Qualification");
														}
														
 if(isUserNameValid==true && isPhoneNumberValid==true && isWhatsappNumberValid==true && isUsnValid==true && isEmailAddressValid==true && isStreamValid==true
          && isQualificationValid==true && isYopValid==true){
			  isValidationCompleted=true;
		  }
		  return isValidationCompleted;
}
public static void readRegistrationDetails(){
			System.out.println(" Fetch details...");
	System.out.println("The User name is: " +userFullName);
	System.out.println("The User emailAddress is: " +emailAddress);
	System.out.println("The User phoneNumber is: " +phoneNumber);
	System.out.println("The User whatsappNumber is: " +userWhatsappnumber);
	System.out.println("The User universitySeatNumber is: " +usn);
	System.out.println("The User yearOfPassout is: " + yop);
	System.out.println("The User streamStudied is: " +stream);
	System.out.println("The User qualificationDegree is: " +qualification);
	return;
}
}