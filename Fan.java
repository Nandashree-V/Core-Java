class Fan{

static boolean isConnected = false;
static int currentSpeed=0;
static int maxSpeed=5;
static int minSpeed =0;

 
public static boolean onOrOff(){
 
    if(isConnected==false)  isConnected= true;
	
	 else if(isConnected==true)
		    isConnected=false;
	

return isConnected;

}

public static void increaseSpeed(){
	if(isConnected==true){
		currentSpeed =currentSpeed+1;
		if(currentSpeed<maxSpeed){
			System.out.println(currentSpeed);
				
		}
		else{
			System.out.println("Speed reached Max");
		}
	}
	else{
		System.out.println("Trun on the Fan");
	}
}


public static void decreaseSpeed(){
	System.out.println("The decreaseSpeed method started");
	if(isConnected=true){
		currentSpeed = currentSpeed-1;
		if(currentSpeed>minSpeed){
			System.out.println(currentSpeed);
		}
		else{
			System.out.println("Speed reached min");
		}
	}
	else{
		System.out.println("Fan is not turned on");
	}
	System.out.println("decreaseSpeed method ended");
	
}


}