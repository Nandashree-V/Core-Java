class InsurancePackage{

public static double searchInsurancePrizeByName(String insranceName){
	
	double  insurancePrice = 0.0;

if(insranceName == "HDFC Life Insurance")  return insurancePrice = 1800.0;
	
if(insranceName == "Max Life")  return insurancePrice = 78090.62;

if(insranceName== "Bajaj Allianz Life") return insurancePrice = 8700.09;

if(insranceName== "Aditya Birla Capital") return insurancePrice = 12345.56;
	
if(insranceName == "India FirstLife Insurance") return insurancePrice = 1586.34;

if(insranceName=="Ask Money")  	return insurancePrice = 5678.98;
	
if(insranceName=="Lincoln Financial Insurance") return insurancePrice = 87623.00;

if(insranceName == "Mutual of Omaha") return insurancePrice =9087.87;

if(insranceName=="State Farm") return insurancePrice=6754.87;

if(insranceName == "Nationwide Insurance") return insurancePrice=6574.008;
	
if(insranceName == "Progressive Insurance") 	return insurancePrice=8732.96;

if(insranceName == "Insurance Choices") return insurancePrice=3421.00;

if(insranceName == "SBI") return insurancePrice=7619.43;
	
if(insranceName == "Edelweiss Tokio Life Insurance") return insurancePrice=1678.96;

if(insranceName == "Tata AIA Life Insurance") return insurancePrice=6578.00;
	
if(insranceName == "PNB MetLife Mera Term Plan Plus") return insurancePrice=6756.86;

if(insranceName == "LIC") return insurancePrice =6543.08;
	
if(insranceName == "HDFC Life Click 2 Protect Super") return insurancePrice=7658.99;

if(insranceName == "Hsbc") 	return insurancePrice = 8432.09;

if(insranceName == "SBI Life eShield") return insurancePrice =6548.00;

if(insranceName == "Hsbc") return insurancePrice=5432.00;
	
if(insranceName == "Axa") return insurancePrice	 = 9870.77;;
	
if(insranceName == "Bandhan Life Insurance") return insurancePrice=6789.65;

if(insranceName == "SBI Life eShield") return insurancePrice=6543.00;

if(insranceName == "Aegon Life Insurance") return insurancePrice = 9874.66;
	
if(insranceName == "Aviva life insurance") return insurancePrice=9807.45;
	
else{
System.out.println(insranceName + "not found");
}
  return insurancePrice ; 
}
}