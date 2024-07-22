class LoanApplicationRunner{
	
	
	public static void main(String[] args){
		boolean loanApplication = LoanApplication.createLoanApplication("Nandashree", "UCO bank", 730, "Home loan", "3yrs", "3%");
if(loanApplication == true){
	LoanApplication.readLoanApplicationDetails();
}		
	}

}