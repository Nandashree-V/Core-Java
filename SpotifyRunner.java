class SpotifyRunner{


public static void main(String[] args){
	boolean createAccount = Spotify.createUserAccount("nandashreev@gmail.com", "Nandashree@123", "Nandashree", "27/10/2002", "Female");
	
	if(createAccount == true){
		Spotify.readUserAccountDetails();
	}
}
}