class TouristCompanyRunner{

public static void main(String[] args){
	System.out.println("main started");
	
	boolean placeName = TouristCompany.createPlaceName("Kodagu");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Udupi");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Chikkamagaluru");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Bidar");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Kerala");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Ooty");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Mysuru");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Goa");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("Mumbai");
	System.out.println("The Place name is added " +placeName);
	
	placeName = TouristCompany.createPlaceName("New Delhi");
	System.out.println("The Place name is added " +placeName);
	
	TouristCompany.getPlaceNames();
	 boolean updatePlaceName = TouristCompany.updatePlaceName("Kerala" , "Tirupati");
  System.out.println("The updated Place name is "  +updatePlaceName);
  TouristCompany. getPlaceNames();
  
  boolean deleteName = TouristCompany.deletePlaceName("New Delhi");
    System.out.println("The deleted Place name is: " +deleteName);
	TouristCompany.getPlaceNames();
	System.out.println("main ended");
}
}