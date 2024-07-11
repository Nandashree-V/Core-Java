class SpeakerRunner{

public static void main(String[] args){

System.out.println("main started");

boolean connect = Speaker.onOrOff();
System.out.println("The speaker is connected:" +connect);
 Speaker.increaseVolume();
  Speaker.increaseVolume();
   Speaker.increaseVolume();
    Speaker.increaseVolume();
	 Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  Speaker.increaseVolume();
	  
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
 connect = Speaker.onOrOff();
 System.out.println("The speaker is connected:" +connect);
 
System.out.println("main ended");


}


}