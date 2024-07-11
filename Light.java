class Light{

static boolean isConnected = false;
static int currentBrightness=0;
static int max=7;
static int min=0;
 
public static boolean onOrOff(){
System.out.println("The turnOn method Started");
 
   // if(isConnected==false){
	   if(!isConnected)  isConnected = true;
	   else isConnected=false;	
System.out.println("The turnOn method is ended");
return isConnected;

}
public static void increaseBrightness(){
System.out.println("The increaseBrightness method Started");
if(isConnected==true){
	currentBrightness = currentBrightness + 1;
	if(currentBrightness < max){
		System.out.println(currentBrightness);
	}
	else{
		System.out.println("The Brightness reached max");
	}
}
else{
	System.out.println("Light  is not truned on");
}
	
	System.out.println("The increaseBrightness method is ended");
	
}
public static void decreaseBrightness(){
	System.out.println("The decreaseBrightness method started");
	if(isConnected=true){
		currentBrightness = currentBrightness-1;
		if(currentBrightness>min){
			System.out.println(currentBrightness);
		}
		else{
			System.out.println("Brightness reached min");
		}
	}
	else{
		System.out.println("Light  is not turned on");
	}
	System.out.println("decreaseBrightness method ended");
	
}

}

