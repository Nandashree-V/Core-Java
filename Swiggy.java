class Swiggy{

public static void main(String args[]){

String nonvegStarters[]={"Kabab","chicken crispy","chicken lalipop","chicken65" ,"chilly chicken","chickentikka","fishfry","fish kabab","mutton fry","chicken ppeper dry"};
String vegStarters[]= {"veg Crispy","veg chilly", "veg garlic","veg lalipop","Gobi manuchiran"," mushroom chilly","mushroom manuchiran","panner65","mix crispy","panner chilly"};
String nonvegMaincourses[]={"Biriyani","egg fried rice","butter chicken","jerk chicken","mutton curry","chicken curry"," fish curry", "fish biryani","mtton fry","chicken noddles"};
String vegMaincourses[]={"veg fried rice","panner butter masala","veg biryani","pannerbiryani","mushroom biryani","mushroom fried rice","veg mix curry","mushoorm masala","pannerfried rice"};

System.out.println("available nonvegStarters are:");
for(String nonvegStarter: nonvegStarters){
System.out.println(nonvegStarter);
}

System.out.println("available vegStarters are:");
for( String vegStarter : vegStarters){
System.out.println(vegStarter );
}

System.out.println("available nonvegMaincourses are: ");
for( String nonvegMaincourse:nonvegMaincourses){
System.out.println(nonvegMaincourse);
}

System.out.println("available vegMaincourses are: ");
for(String vegMaincourse : vegMaincourses){
System.out.println(vegMaincourse);
}
}
}