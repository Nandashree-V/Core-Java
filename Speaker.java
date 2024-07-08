class Speaker{

static boolean isConnected = false;
 
public static void turnOn(){
System.out.println("The turnOn method Started");
 
    if(isConnected==false){
	  isConnected= true;
	  System.out.println("The Speaker is turned ON..!");
	}
System.out.println("The turnOn method is ended");
return ;

}

public static void turnOff(){

System.out.println("The turnOff method is started");

         if(isConnected==true){
		    isConnected=false;
			System.out.println("The Speaker is turned Off");
		 }
		 System.out.println("The turnOff method is ended");
		 return;


}





}