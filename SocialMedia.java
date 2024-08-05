class SocialMedia{
  
   int id;
   String name;
   String profileName;
   String email;
   
   public SocialMedia(int id, String name, String profileName, String email){
	   this.id= id;
	   this.name=name;
	   this.profileName=profileName;
	   this.email=email;
	   
   }
   public void getDetails(){
	   
	    System.out.println("The platform id is:  " +id);
 System.out.println("The name is:  " +name);
   System.out.println("The profileName is:  " +profileName);
	System.out.println("The emailId is:  " +email);
   }

}