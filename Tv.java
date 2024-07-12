class Tv{

static boolean isConnected = false;
static int currentVolume=0;
static int max=7;
static int min=0;
 
public static boolean onOrOff(){
System.out.println("The turnOn method Started");
 
   isConnected = (isConnected == false) ? true : false;
System.out.println("The turnOn method is ended");
return isConnected;

}
public static void increaseVolume(){
System.out.println("The increaseVolume method Started");
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
	System.out.println("TV is not truned on");
}
	
	System.out.println("The increaseVolume method is ended");
	
}
public static void decreaseVolume(){
	System.out.println("decreaseVolume method started");
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
		System.out.println("TV is not turned on");
	}
	System.out.println("decreaseVolume method ended");
	
}

}

