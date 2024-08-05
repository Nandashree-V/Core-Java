class CountryRunner{
	
	public static void main(String args[]){
		
Country country1 = new Country("NA","India",28,"Narendra modi","1,428 million");
System.out.println("---Country1 details-----");
country1.displayDetails();


Country country2 = new Country("US" ,"United States",50,"Joe Biden","332 million");
System.out.println("---country2 details-----");
country2.displayDetails();

Country country3 = new Country( "CN","China",34,"Li Qiang","1,425 million");
System.out.println("---country3 details-----");
country3.displayDetails();

Country country4 = new Country("JP","Japan",47,"Fumio Kishida","124 million");
System.out.println("---country4 details-----");
country4.displayDetails();

Country country5 = new Country("DE","Germany",16,"Olaf Scholaz","83 million");
System.out.println("---country5 details-----");
country5.displayDetails();

Country country6 = new Country("BR","Brazil" ,26,"Luiz Inacio Lula da Silva","203 million");
System.out.println("---country6 details-----");
country6.displayDetails();

Country country7 = new Country("AU","Australia",6,"Anthony Albanese","26 million");
System.out.println("---country7 details-----");
country7.displayDetails();


Country country8 = new Country("CA","Canada",13,"Justin Trudeau","39 million");
System.out.println("---country8 details-----");
country8.displayDetails();

	}

}