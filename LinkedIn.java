class LinkedIn{
	
	
	static String first;
	static String last;
    static String email;
	static String pword;
	static String confirm;
	static String nation;
	static int pin;
	static String comp;
	static String roleTitle;
	static String ind;
	static String edu;

public static boolean createLinkedlnAccount(String firstName, String lastName,String emailId, String pwd,String confirmPwd,String country,int pinCode, String company, String role, String industry,String education){
	boolean isLinkedlnCreated = false;
	boolean isfirstNameInvalid = false;
	if(firstName != null){
		first = firstName;
		isfirstNameInvalid = true;
	}else {
		System.out.println("the firstName is invalid");
	}
	boolean islastNameInvalid = false;
	if(lastName != null){
		last = lastName;
		islastNameInvalid = true;
	}else {
		System.out.println(" the lastname is Invalid");
	}
	boolean isemailIdInvalid = false;
	if(emailId != null){
		email = emailId;
		isemailIdInvalid = true;
	}else {
		System.out.println("the emailId is invalid");
	}
	boolean ispwdInvalid = false;
	if(pwd != null){
		pword = pwd;
		ispwdInvalid = true; 
	}else {
		System.out.println(" the pwd is invalid");
	}
	boolean isconfirPwdInvalid = false;
	if(confirmPwd != null){
	confirm = confirmPwd;
	isconfirPwdInvalid = true;
	}else{
		System.out.println("the confirmPwd is Invalid ");
	}
	boolean iscountryInvalid = false;
	if(country != null){
		nation = country;
		iscountryInvalid= true;
		
	}else{
		System.out.println("the country is invalid");
	}
	boolean ispinCodeInvalid = false;
	if(pinCode > 0){
		pin = pinCode;
		ispinCodeInvalid = true;
	}else {
		System.out.println("the pind code is invalid ");
		
	}
	boolean iscompanyInvalid = false;
	if(company != null){
		comp = company;
		iscompanyInvalid = true;
		
	}else {
		System.out.println(" the company is Invalid"); 
	}
	boolean isroleInvalid = false;
	if(role != null){
		roleTitle = role;
		isroleInvalid = true;
		
	}else {
		System.out.println("the role is invalid");
	}
	boolean isindustryInvalid = false;
	if(industry != null){
		ind = industry;
		isindustryInvalid = true;
		
	}else {
		System.out.println("the industry is invalid" );
	}
		boolean iseducationInvalid = false;
		if(education != null){
			edu = education;
			iseducationInvalid = true;
		}else{
			System.out.println("the education is invalid");
		}
	
	
	if(isfirstNameInvalid==true && islastNameInvalid==true && isemailIdInvalid== true && ispwdInvalid== true &&isconfirPwdInvalid== true && iscountryInvalid== true &&ispinCodeInvalid== true &&iscompanyInvalid== true&& isroleInvalid==true && isindustryInvalid== true && iseducationInvalid==true){
				
				isLinkedlnCreated = true;
	}
	return isLinkedlnCreated;
}
    
	public static void readLinkedlnAccount(){
		
		System.out.println("details...");
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("email Id:"+email);
		System.out.println("Password:"+pword);
		System.out.println("Confirm Password:"+confirm);
		System.out.println("Country:"+nation);
		System.out.println("Pin Code:"+pin);
		System.out.println("Company:"+comp);
		System.out.println("role:"+roleTitle);
		System.out.println("Industry:"+ind);
		System.out.println("Education:"+edu);
		
	}
}