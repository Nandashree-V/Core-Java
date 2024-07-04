class SuperMarket {

public static void main(String dmart[]) {
System.out.println("main started");

String groceries[] = {"Wheat","sugar","cooking oil","Urad dal","Rice","Salt","Colve","Jaggery","Peanuts","Ragi","thoor dal","Mustard","Jeera","Vermicle","poha"};
String vegetables[]  ={"Onion","beans","carrort","Bottle gourd","snake gourd" ,"bitter gourd","garlic","ginger","cabbage","green chilli"};
String cosmetics[]={"Concelar","eyelinear","Blush","Lipsticks","Foundation","Primer","mosituriser","Mascara","Face Cream","Toner","Sunscreen","eye pencil","eye shadow","hair conditioner","nail care"};
String iceCreams[]={"Amul","Kwality","Mother Dairy","Vadilal","Havmor","Creambell","Dinshaw's","Baskin Robbins","Nirulas","Arun","Keventers","Nestle","lazza","Top N","mali"};
String perfumes[]={"Armani","chanel","Dior","Gucci","Hugo boss","Marc jacobs","Mugler","Rabanne","Prada","Tom ford","Yues saint","Fog","Eva","Wattagirl","Dolce"};
String coolDrinks[] = {"coke","fanta","pepsi","7up","Mirinda","sprite","Thums up","Fizz","Mountain Dew","limca","crush","beverly","Copella","Britvic","Bindu Jeera"};
String fruits[] ={"Apple","Banana","Jackfruit","orange","Grapes","Chikku","water melon","musk melon","Strawberry","blue berry"};
String alcohols[] = {"Bear","rum","Gin","wine","Sake","Whiskey","Cider","Liqueurs","Vodka","Vermouth","Brandy","cognac","Galliano","Marsala","Disaronno"};
String snacks[] = {"Banana fritter","Banana chips","jackfruit chips","popcorn","samosa","Khakhra","trail mix","chikki","ganthiya","chickpea"};
String milkProducts[] ={"milk","cream","butter","fermented","yogurt","cheese","custard","frozen","skim milk","butter milk"};
String chocolates[]= {"Cadburay","Amul","Nestle","ferrero rocher","mars bars","5star","bournville","snickers","wispa","picnic","lindit","toblerno","valrhona","mini eggs","kitkat"};
String homeAppliances[]= {"AC","dish washer","clothes dyers","stoves","heaters","washing machines","trash compactors","microwave","cookers","TV","refrigerator","Iron box","blender","vaccum cleaner","Fan","Juicer","sewing machine","toaster","lamp","hairdyers","coffee maker"};

System.out.println("The available groceries are:");
for( String grocery:groceries){
	System.out.println(grocery);
}

System.out.println("The available vegetables are:");
for(String vegetable:vegetables){
	System.out.println(vegetable);
}

System.out.println("The available cosmetic are:");
for(String cosmetic:cosmetics){
	System.out.println(cosmetic);
}

System.out.println("The available icecreams are:");
for(String iceCream:iceCreams){
	System.out.println(iceCream);
}

System.out.println("The available perfumes are :" );
for(String perfume:perfumes){
	System.out.println(perfume);
}

System.out.println("The available coolDrinks are:");
for(String coolDrink:coolDrinks){
	System.out.println(coolDrink);
}

System.out.println("The available fruits are:");
for(String fruit:fruits){
	System.out.println(fruit);
}

System.out.println("The available alcohols are");
for(String alcohol:alcohols){
	System.out.println(alcohol);
}

System.out.println("The available snacks are:");
for(String snack:snacks){
	System.out.println(snack);
}

System.out.println("The available milkProducts are:");
for(String milkProduct:milkProducts){
	System.out.println(milkProduct);
}

System.out.println("The available chocolates are:");
for(String chocolate:chocolates){
	System.out.println(chocolate);
}
System.out.println("The available homeAppliances are:");
for(String homeAppliance:homeAppliances){
	System.out.println(homeAppliance);
}


System.out.println("main ended");

}


}