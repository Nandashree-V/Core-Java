class RadioRunner{

public static void main(String[] args){

System.out.println("main started");

boolean connect = Radio.onOrOff();
System.out.println("The Radio is connected:" +connect);
 Radio.increaseVolume();
  Radio.increaseVolume();
   Radio.increaseVolume();
    Radio.increaseVolume();
	 Radio.increaseVolume();
	  Radio.increaseVolume();
	  Radio.increaseVolume();
	  Radio.increaseVolume();
	  
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
Radio.decreaseVolume();
 connect = Radio.onOrOff();
 System.out.println("The Radio is connected:" +connect);
 
System.out.println("main ended");


}


}