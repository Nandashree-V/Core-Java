class HouseRunner{
	
	public static void main(String[] args){
		
		House house1 = new House(13,2,1,"Garudradri Nilaya",1200,4);
	   System.out.println("====House1 Details====");
	      house1.getDetails();

		House house2 = new House(25,3,2, "Lakshmi Venkateshwara Nilaya",1200,8);
	   System.out.println("====house2 Details====");
	   house2.getDetails();
	   
	   House house3 = new House(9,5,3,"Srimathi Villa",2400,12);
		System.out.println("====house3 Details====");
		 house3.getDetails();
		
		House house4 = new House(12,3,1,"Gowri Ganesha Nilaya",1200,6);
		System.out.println("====house4 Details====");
		 house4.getDetails();
	   
	   House house5 = new House(71,4,4,"Aadharsha Nivaasa",1200,3);
		System.out.println("====house5 Details====");
		 house5.getDetails();
	   
	   House house6 = new House(99,4,5,"Preethiya Mane",1800,8);
		System.out.println("====house6 Details====");
		 house6.getDetails();
	   
	   House house7 = new House(19,2,2,"Shanthi Kuteera",1200,4);
		System.out.println("====house7 Details====");
		 house7.getDetails();
	   
   House house8 = new House(45,3,3,"Anamda Nivassa",1200,3);
		System.out.println("====house8 Details====");
		 house8.getDetails();
	}
	
}