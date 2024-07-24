class JuiceShopRunner{

public static void main(String[] args){
	System.out.println("main started");
	
	boolean juiceName = JuiceShop.createJuiceNames("Mango Juice");
	System.out.println("The Juice name is added " +juiceName);
	
	juiceName = JuiceShop.createJuiceNames("Mango Juice");
	System.out.println("The Juice name is added " +juiceName);
	
	juiceName = JuiceShop.createJuiceNames("Apple Juice");
	System.out.println("The Juice name is added " +juiceName);
	
	juiceName = JuiceShop.createJuiceNames("Watermelon Juice");
	System.out.println("The Juice name is added " +juiceName);
	
	juiceName = JuiceShop.createJuiceNames("Muskmelon Juice");
	System.out.println("The Juice name is added " +juiceName);
	
	juiceName = JuiceShop.createJuiceNames("Kiwi Juice");
	System.out.println("The Juice name is added " +juiceName);
	
	
	JuiceShop.getJuiceNames();
	System.out.println("main ended");
}
}