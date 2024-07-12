class IronBox{

static boolean isConnected = false;
static int currentTemparature=0;
static int max=7;
static int min=0;
 
public static boolean onOrOff(){
System.out.println("The turnOn method Started");
 
 isConnected = (isConnected == false) ? true : false;	
System.out.println("The turnOn method is ended");
return isConnected;

}
public static void increaseTemparature(){
System.out.println("The increaseTemparature method Started");
if(isConnected==true){
	currentTemparature = currentTemparature + 1;
	if(currentTemparature < max){
		System.out.println(currentTemparature);
	}
	else{
		System.out.println("The Temparature reached max");
	}
}
else{
	System.out.println("IronBox is not truned on");
}
	
	System.out.println("The increaseTemparature method is ended");
	
}
public static void decreaseTemparature(){
	System.out.println("The decreaseTemparature method started");
	if(isConnected=true){
		currentTemparature = currentTemparature-1;
		if(currentTemparature>min){
			System.out.println(currentTemparature);
		}
		else{
			System.out.println("Temparature reached min");
		}
	}
	else{
		System.out.println("IronBox is not turned on");
	}
	System.out.println("decreaseTemparature method ended");
	
}

}

