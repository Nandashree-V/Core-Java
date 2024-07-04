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

System.out.println("available groceries are : " +groceries[0] +"," +groceries[1] +"," +groceries[2] +"," +groceries[3] +","+groceries[4] +"," +groceries[5] +"," +groceries[6] +"," +groceries[7]  +"," +groceries[8] +"," +groceries[9] +"," +groceries[10] +"," +groceries[11] +"," +groceries[12] +"," +groceries[13] +"," +groceries[14]);
System.out.println("available vegetables are : " +vegetables[0] +","+vegetables[1] +","+vegetables[2] +","+vegetables[3] +","+vegetables[4] +","+vegetables[5] +","+vegetables[6] +","+vegetables[7] +","+vegetables[8] +","+vegetables[9]);
System.out.println("available cosmetics are : " +cosmetics[0] +","+cosmetics[1] +"," +cosmetics[2] +"," +cosmetics[3] +"," +cosmetics[4] +"," +cosmetics[5] +"," +cosmetics[6] +"," +cosmetics[7] +"," +cosmetics[8] +"," +cosmetics[9] +"," +cosmetics[10] +"," +cosmetics[11] +"," +cosmetics[12] +"," +cosmetics[13] +"," +cosmetics[14]);
System.out.println("available iceCreams are : " +iceCreams[0] +","+iceCreams[1] +","+iceCreams[2] +"," +iceCreams[3] +"," +iceCreams[4] +"," +iceCreams[5] +"," +iceCreams[6] +"," +iceCreams[7] +"," +iceCreams[8] +"," +iceCreams[9] +"," +iceCreams[10] +"," +iceCreams[11] +"," +iceCreams[12] +"," +iceCreams[13] +"," +iceCreams[14]);
System.out.println("available coolDrinks are : " +coolDrinks[0] +","+coolDrinks[1] +","+coolDrinks[2] +"," +coolDrinks[3] +"," +coolDrinks[4] +"," +coolDrinks[5] +"," +coolDrinks[6] +"," +coolDrinks[7] +"," +coolDrinks[8] +"," +coolDrinks[9] +"," +coolDrinks[10] +"," +coolDrinks[11] +"," +coolDrinks[12] +"," +coolDrinks[13] +"," +coolDrinks[14]);
System.out.println("available perfumes are : " +perfumes[0] +"," +perfumes[1] +"," +perfumes[2] +"," +perfumes[3] +"," +perfumes[4] +"," +perfumes[5] +"," +perfumes[6] +"," +perfumes[7] +"," +perfumes[8] +"," +perfumes[9] +"," +perfumes[10] +"," +perfumes[11] +"," +perfumes[12] +"," +perfumes[13] +"," +perfumes[14]);
System.out.println("available fruits are :" +fruits[0] +","+fruits[1] +","+fruits[2] +","+fruits[3] +","+fruits[4] +","+fruits[5] +","+fruits[6] +","+fruits[7] +","+fruits[8] +","+fruits[9]);
System.out.println("available alcohols are :" +alcohols[0] +","+alcohols[1] +","+alcohols[2] +","+alcohols[3] +","+alcohols[4] +","+alcohols[5] +"," +alcohols[6] +"," +alcohols[7] +","+alcohols[8] +","+alcohols[9] +","+alcohols[10] +","+alcohols[11] +","+alcohols[12] +","+alcohols[13] +","+alcohols[14]);
System.out.println("available snacks are :" +snacks[0]+","+snacks[1] +","+snacks[2] +","+snacks[3] +","+snacks[4] +","+snacks[5] +","+snacks[6] +","+snacks[7] +","+snacks[8] +","+snacks[9] );
System.out.println("available milkProducts are :" +milkProducts[0] +","+milkProducts[1] +","+milkProducts[2] +","+milkProducts[3] +","+milkProducts[4] +"," +milkProducts[5] +","+milkProducts[6] +","+milkProducts[7] +","+milkProducts[8] +","+milkProducts[9]);
System.out.println("available  chocolates are :" +chocolates[0] +","+chocolates[1] +","+chocolates[2] +","+chocolates[3] +","+chocolates[4] +","+chocolates[5] +","+chocolates[6] +","+chocolates[7] +","+chocolates[8] +","+chocolates[9] + ","+chocolates[10] +","+chocolates[11] +","+chocolates[12] +","+chocolates[13] +","+chocolates[14]);
System.out.println("available homeAppliances are :" +homeAppliances[0] +","+homeAppliances[1] +","+homeAppliances[2] +","+homeAppliances[3] +","+homeAppliances[4] +","+homeAppliances[5] +","+homeAppliances[6] +","+homeAppliances[7] +","+homeAppliances[8] +","+homeAppliances[9] +","+homeAppliances[10] +","+homeAppliances[11] +","+homeAppliances[12] +","+homeAppliances[13] +","+homeAppliances[14] +","+homeAppliances[15] +","+homeAppliances[16] +","+homeAppliances[17] +","+homeAppliances[18] +","+homeAppliances[19]);
System.out.println("main ended");
}


}