class TravelAgency{
static String  touristplace[]={null,null,null,null,null,null,null,null};
static int index;


public static boolean createtouristplace(String place){
boolean isCreate=false;
if(place!=null){
touristplace[index]=place;
index++;
isCreate=true;

}else{
System.out.println("cannot add touristplace,as it is a null value");

}
return isCreate;
}
public static void getAlltouristplace(){

System.out.println("touristplace");
for(int place=0;place<touristplace.length;place++){
      String reference =touristplace[place];
			System.out.println("accessing place "+ reference +" at index"+place);
			
		}
		System.out.println("end of getAlltouristplace");
		
}
	
	public static boolean updatetouristplace(String existingtouristplace,String updatedtouristplace){
		boolean isupdated = false;
	for(int placeindex = 0; placeindex<touristplace.length; placeindex++)
	{
		
		if(touristplace[placeindex].equals(existingtouristplace))
		{
			 touristplace[placeindex]=updatedtouristplace;
			isupdated=true;
		}
		
	}	
	return isupdated;		
	}	
	
	
	
	
	
	
}

	

	
