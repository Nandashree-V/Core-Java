class FanRunner{

public static void main(String[] args){

System.out.println("main started");

boolean connect = Fan .onOrOff();
System.out.println("The Fan  is connected:" +connect);
 Fan .increaseSpeed();
  Fan .increaseSpeed();
   Fan .increaseSpeed();
    Fan .increaseSpeed();
	 Fan .increaseSpeed();
	  Fan .increaseSpeed();
	  
Fan .decreaseSpeed();
Fan .decreaseSpeed();
Fan .decreaseSpeed();
Fan .decreaseSpeed();
Fan .decreaseSpeed();
Fan .decreaseSpeed();

 connect = Fan .onOrOff();
 System.out.println("The Fan  is connected:" +connect);
 
System.out.println("main ended");


}


}