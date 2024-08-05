class DebitCardRunner{

public static void main(String args[]){
	
	  DebitCard card1 = new DebitCard(101,"Shivam", 1234567898765432l,"20/03/2030",285);
	  System.out.println("====card1 Details====");
	    card1.displayDetails();
	 
	 
	   DebitCard card2 = new DebitCard(102,"Gangothri",1234567890022001l,"31/07/2028",267);
	   System.out.println("====card2 Details====");
	   card2.displayDetails();
	   
	    
	   DebitCard card3 = new DebitCard(103,"Jamuna Gowda",1001200210036987l,"12/01/2035",100);
	    System.out.println("====card3 Details====");
	    card3.displayDetails();
	  
	   
	    
	   DebitCard card4 = new DebitCard(104,"Raj Guru",9807123465870008l,"23/05/2027",185);
	   System.out.println("====card4 Details====");
	  card4.displayDetails();
 
	   DebitCard card5 = new DebitCard(105,"Samarth Raj",3456876912560976l,"22/09/2024",112);
	    System.out.println("====card5 Details====");
	   card5.displayDetails();
	    
	   DebitCard card6 = new DebitCard(106,"Sunil Kumar",45671276897534l,"20/06/2032", 208);
	    System.out.println("====card6 Details====");
	     card6.displayDetails();
	   
	    
	   DebitCard card7 = new DebitCard(107,"Yamuna Sudhakar",1234567890022001l,"17/11/2026",309);
	    System.out.println("====card7 Details====");
	   card7.displayDetails();
	   
	    
	   DebitCard card8 = new DebitCard(108,"Sri Krishna",3987345618973003l, "29/10/2025",987);
	    System.out.println("====card8 Details====");
	    card8.displayDetails();
}


}