class RechargePlansRunner{
	
	public static void main(String[] jio){
System.out.println("main method started");

String planName = "1.5GB/Day Data for 22 Days Pack";
double planPrice = RechargePlans.getPriceByPlanName(planName);
System.out.println(planPrice);
System.out.println("main method ended");

}
}