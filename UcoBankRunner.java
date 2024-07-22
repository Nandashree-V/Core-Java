class UcoBankRunner{

public static void main(String[] args){
	boolean accountCreation = UcoBank.createBankAccount("Nandashree", 8660802234l, "Karanataka" , "Bengaluru Rural","Bengaluru Rural", "Vishwanath",61410809284l);
	if(accountCreation==true){
		UcoBank.readAccountDetails();
	}
}
}