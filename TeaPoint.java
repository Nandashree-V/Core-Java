class TeaPoint{

static String teaNames[] = {null,null,null,null,null,null};
static int start = 0;

public static boolean addTeaName(String teaName){
	boolean isTeaNameAdded = false ;
	if(start < teaNames.length){
		System.out.println("array index is out of bound");
	}
	 if(teaName != null){
		teaNames[start++] =teaName ; 
		isTeaNameAdded = true;
		
	}
	else{
		System.out.println("Invalid Tea Name");
	}	
	return isTeaNameAdded;
}
 
 public static void getTeaNames(){
	 for( String teaName : teaNames)
		 System.out.println("The tea name is" +teaName);
 }


}