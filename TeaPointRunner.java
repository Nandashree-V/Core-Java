class TeaPointRunner{


public static void main(String[] args){
System.out.println("main started");

 boolean teaNames = TeaPoint.addTeaName("Amrut Tea");
 System.out.println("is tea name added " +teaNames);
 
  teaNames = TeaPoint.addTeaName("Green Tea");
 System.out.println("is tea name added " +teaNames);
 
  teaNames = TeaPoint.addTeaName("Ajwain Tea");
 System.out.println("is tea name added " +teaNames);
 
  teaNames = TeaPoint.addTeaName("Ginger Tea");
 System.out.println("is tea name added " +teaNames);
 
  teaNames = TeaPoint.addTeaName("chocolate Tea");
 System.out.println("is tea name added " +teaNames);
 
  teaNames = TeaPoint.addTeaName("classic Tea");
 System.out.println("is tea name added " +teaNames);
 
TeaPoint. getTeaNames();

  boolean updateTeaName = TeaPoint.updateTeaName("Ginger Tea" , "Masala Tea");
  System.out.println("The updated tea name is "  +updateTeaName);
  TeaPoint. getTeaNames();
  
  boolean deletTeaName = TeaPoint.deleteTeaName("classic Tea");
    System.out.println("The deleted tea name is: " +deletTeaName);
	TeaPoint.getTeaNames();
  
System.out.println("main ended");



}



}