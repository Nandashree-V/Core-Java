class House{

       int houseId;
	   int noOfRooms;
	   int noOfFloors;
	   String houseName;
	   int areaInSqFeet;
	   int noOfMembers;
   public House(int houseId,int noOfRooms,int noOfFloors,String houseName,int areaInSqFeet,int noOfMembers){
	   this.houseId=houseId;
	   this.noOfRooms=noOfRooms;
	   this.noOfFloors=noOfFloors;
	   this.houseName=houseName;
	   this.areaInSqFeet=areaInSqFeet;
	   this.noOfMembers=noOfMembers;
	   
	   
   }
   
   public void getDetails(){
	    System.out.println("The House Id is: " +houseId);
	   System.out.println("The number of rooms is: " +noOfRooms);
	   System.out.println("The number of floors is: " +noOfFloors);
	   System.out.println("The House name is: " +houseName);
	   System.out.println("The area of house in square feet is: " +areaInSqFeet);
	   System.out.println("The number of memebers is: " +noOfMembers);
   }

}