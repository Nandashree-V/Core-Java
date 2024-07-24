class JuiceShop{

static String juiceNames[] = {null,null,null,null.null,null}
static int start = 0;
public static boolean createJuiceNames(String juiceName){
	boolean isJuiceNameCreated = false;
	if(start<juiceNames.length){
		System.out.println("Array is out of bound");
	}
	if(juiceName != null){
		juiceNames[start++] = juiceName;
		isJuiceNameCreated = true;
	}
	else{
		Sytem.out.println("Invalid juice name");
	}
	return isJuiceNameCreated;
}

public static void getJuiceNames(){
	for(String juiceName:juiceNames){
		System.out.println("The Juice Name is" +juiceName)
	}
		
}
}