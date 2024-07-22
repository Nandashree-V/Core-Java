class AmazonRunner{
	
	public static void main(String[] args){
		
		boolean accountCreation = Amazon.createUserAccount("Nandashree" , "nandashreev@gmail.com", 0, "+91", "Nandashree@123", "Nandashree@123");
		
		if(accountCreation==true){
			Amazon.readUserAccountDetails();
		}
		
		
	}

}