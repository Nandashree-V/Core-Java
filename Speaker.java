class Speaker{

static boolean isConnected = false;
 
public static boolean onOrOff(){
//System.out.println("The turnOn method Started");
 
    if(isConnected==false){
	  isConnected= true;
	 
	}
	else if(isConnected==true){
		  isConnected=false;
	
	}
//System.out.println("The turnOn method is ended");
return isConnected;

}

}