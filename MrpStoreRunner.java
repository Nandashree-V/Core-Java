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
	
	 boolean updateName = MrpStore.updateAlcoholName("whisky" , "Old Monk");
  System.out.println("The updated Alcohol name is "  +updateName);
  MrpStore. getAlcoholNames();
  
  boolean deleteName = MrpStore.deleteAlcoholName("brandy");
    System.out.println("The deleted Alcohol name is: " +deleteName);
	MrpStore.getAlcoholNames();
	System.out.println("main ended");
}

}