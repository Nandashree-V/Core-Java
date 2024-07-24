class MrpStoreRunner{

public static void main(String[] args){
	System.out.println("main started");
	
	boolean alcoholName = MrpStore.createAlcoholName("Vodka");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("Gin");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("baijiu");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("soju");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("tequilla");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("rum");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("whisky");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("brandy");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("singani");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	alcoholName = MrpStore.createAlcoholName("Gimlet");
	System.out.println("The Alcohol Name is added " +alcoholName);
	
	
	MrpStore.getAlcoholNames();
	System.out.println("main ended");
}

}