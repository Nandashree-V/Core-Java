 class InsurancePackageRunner{
 
 public static void main (String[] insurances){
	 System.out.println("main started");
 
 String name = "HDFC Life Insurance";
 
 double price = InsurancePackage.searchInsurancePrizeByName(name);
 System.out.println(price);
 System.out.println("main ended");
 
 }
 
 }