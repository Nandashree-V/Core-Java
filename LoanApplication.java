class LoanApplication{
	
	static String loanApplicantName;
	static String nameOfBank;
	static int loanCreditScore;
	static String typeOfLoan;
	static String yol;
	static String roi;
	public static boolean createLoanApplication(String applicantName, String bankName, int creditScore, String loanType, String yearsOfLoan, String rateOfInterset){
		                                   
										  boolean  isLoanApplicationCreated = false;
								isLoanApplicationCreated=loanApplicationValidation(applicantName,bankName,creditScore,loanType,yearsOfLoan,rateOfInterset);		  
										 
				   return isLoanApplicationCreated;
}
public static boolean loanApplicationValidation(String applicantName, String bankName, int creditScore, String loanType, String yearsOfLoan, String rateOfInterset){
	                                       boolean isValidated = false;
	                                       boolean isLoanApplicantNameValid = false;
										  boolean  isNameOfBankValid = false;
										  boolean  isTypeOfLoanValid = false;
										  boolean  isYearsOfloanValid = false;
										  boolean   isLoanCreditScoreValid = false;
										  boolean   isRateOfIntersetValid = false;
										   
										   if(applicantName != null){
											   loanApplicantName = applicantName;
											   isLoanApplicantNameValid =true;
										   }
										   else{
											   System.out.println("Invalid Name");
										   }
										    if(bankName != null){
											   nameOfBank=bankName;
											   isNameOfBankValid =true;
										   }
										   else{
											   System.out.println("Invalid Bank Name");
										   }
										    if(creditScore > 0){
											   loanCreditScore = creditScore;
											  isLoanCreditScoreValid=true;
										   }
										   else{
											   System.out.println("Invalid creditScore");
										   }
										    if(loanType != null){
											   typeOfLoan = loanType;
											   isTypeOfLoanValid =true;
										   }
										   else{
											   System.out.println("Invalid loanType");
										   }
										    if(rateOfInterset != null){
											  roi = rateOfInterset;
											   isRateOfIntersetValid =true;
										   }
										   else{
											   System.out.println("Invalid rateOfInterset");
										   }
										    if(yearsOfLoan != null){
											   yol = yearsOfLoan;
											   isYearsOfloanValid =true;
										   }
										   else{
											   System.out.println("Invalid yearsOfLoan");
										   }
										   
   if(isLoanApplicantNameValid ==true && isNameOfBankValid==true && isLoanCreditScoreValid==true && isTypeOfLoanValid==true && isRateOfIntersetValid==true 
                   && isYearsOfloanValid==true){
					   isValidated = true;
				   }
				   return isValidated;
}
   public static void readLoanApplicationDetails(){
	   		System.out.println(" Fetch details...");
	   System.out.println("The applicantName is: " +loanApplicantName);
	   System.out.println("The bankName is: " +nameOfBank);
	   System.out.println("The creditScore is: " +loanCreditScore);
	   System.out.println("The  yearsOfLoan is: " +yol);
	   System.out.println("The rateOfInterset is: " +roi);
	   System.out.println("The typeOfLoan is: " +typeOfLoan);
	   return;
   }
}