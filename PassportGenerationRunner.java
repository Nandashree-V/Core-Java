class PassportGenerationRunner{

public static void main(String[] passport){

boolean passportGeneration = PassportGeneration.createUserPassport("PO","Bengaluru", "Nandashree" ,"Nayaka", "27/05/2002", "nandashreev2002@gmail.com", true ,
                                                                  "nandashreev2002@gmail", "Nandashree@123","Nandashree@123" , "what is ur favorite color", 
																         "pink", "FS6J5");

if(passportGeneration ==true){
PassportGeneration.readUserPassportDetails();
}
}


}