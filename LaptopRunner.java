class LaptopRunner{

public static void main(String[] args){

System.out.println("main started");

boolean connect = Laptop.onOrOff();
System.out.println("The Laptop is connected:" +connect);
 Laptop.increaseVolume();
 Laptop.increaseVolume();
Laptop.increaseVolume();
Laptop.increaseVolume();
 Laptop.increaseVolume();
 Laptop.increaseVolume();
 Laptop.increaseVolume();
Laptop.increaseVolume();
	  
Laptop.decreaseVolume();
Laptop.decreaseVolume();
Laptop.decreaseVolume();
Laptop.decreaseVolume();
Laptop.decreaseVolume();
Laptop.decreaseVolume();
Laptop.decreaseVolume();
Laptop.decreaseVolume();
 connect = Laptop.onOrOff();
 System.out.println("The Laptop is connected:" +connect);
 
System.out.println("main ended");


}


}