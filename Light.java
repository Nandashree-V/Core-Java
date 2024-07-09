class Light{

static boolean isConnected = false;
 
public static boolean onOrOff(){
 
    if(isConnected==false){
	  isConnected= true;
	}
	 else if(isConnected==true){
		    isConnected=false;
	}

return isConnected;

}





}