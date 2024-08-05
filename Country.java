class Country{

String countryId;
int noOfStates;
String name;
String pmName;
String population;

public Country(String countryId,String name,int noOfStates,String pmName,String population){
	this.countryId=countryId;
	this.noOfStates=noOfStates;
	this.name=name;
	this.pmName=pmName;
	this.population=population;
	
	
}

public void displayDetails(){
System.out.println("countryId: " +countryId);
System.out.println("country name: " +name);
System.out.println("number of states: " +noOfStates);
System.out.println("prime minister: " +pmName);
System.out.println("population: " +population);
}

}