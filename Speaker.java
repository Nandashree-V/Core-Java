class Speaker{

static boolean isConnected = false;
static int currentVolume=0;
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
public static void increaseVolume(){
System.out.println("The turnOn method Started");
if(isConnected==true){
	currentVolume = currentVolume + 1;
	if(currentVolume < max){
		System.out.println(currentVolume);
	}
	else{
		System.out.println("The volume reached max");
	}
}
else{
	System.out.println("Speaker is not truned on");
}
	
	System.out.println("The turnOn method is ended");
	
}
public static void decreaseVolume(){
	if(isConnected=true){
		currentVolume = currentVolume-1;
		if(currentVolume>min){
			System.out.println(currentVolume);
		}
		else{
			System.out.println("Volume reached min");
		}
	}
	else{
		System.out.println("Speaker is not turned on");
	}
	
}

}

