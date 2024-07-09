class FanRunner{

public static void main(String[] args){

System.out.println("main started");

boolean connect = Fan.onOrOff();
connect = Fan.onOrOff();
System.out.println("The Fan is connected:" +connect);
System.out.println("main ended");


}


}