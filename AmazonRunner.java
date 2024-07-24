class AmazonRunner{
	
	public static void main(String[] args){
		
		boolean accountCreation = Amazon.createUserAccount("Nandashree" , "nandashreev@gmail.com", 8660802284l, "+91", "Nandashree@123", null);
		
		if(accountCreation==true){
			Amazon.readUserAccountDetails();
		}
		
		
	}

}