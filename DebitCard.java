class DebitCard{

     int cardId;
	 String cardHolderName;
	 long cardNo;
	 String expiryDate;
	 int cvv;
	 
	 public DebitCard(int cardId,String cardHolderName,	 long cardNo, String expiryDate,int cvv ){
		 this.cardId=cardId;
	 this.cardHolderName=cardHolderName;
	this.cardNo=cardNo;
	 this.expiryDate=expiryDate;
	 this.cvv=cvv;
	 
	 }
	 
	 public void displayDetails(){
		 
	   System.out.println("The card Id number is: " +cardId);
	   System.out.println("The name of the card holder is: " +cardHolderName); 
	   System.out.println("The card Id number is: " +cardNo);
	   System.out.println("The expiry date for card is: " +expiryDate);
	   System.out.println("The Cvv of card is: " +cvv);
		 
	 }


}