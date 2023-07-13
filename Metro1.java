class Metro1{
static String stationNames[]={null,null,null,null,null,null,null};
static int index;

public static boolean addstation(String station){
boolean isAdded=false;
if(station!=null){
stationNames[index]=station;
index++;
isAdded=true;

}else{
System.out.println("cannot add stationNames,as it is a null value");

}
return isAdded;
}
public static void getAllstationNames(){

System.out.println("stationNames");
for(int station=0;station<stationNames.length;station++){
      String reference =stationNames[station];
			System.out.println("accessing station "+ reference +" at index"+station);
			
		}
		System.out.println("end of getAllstationNames");
		
}	
	public static boolean updatestationNames(String existingstationNames,String updatedstationNames){
		boolean isupdated = false;
	for(int stationindex = 0; stationindex<stationNames.length; stationindex++)
	{
		
		if(stationNames[stationindex].equals(existingstationNames))
		{
			stationNames[stationindex]=updatedstationNames;
			isupdated=true;
		}
		
	}	
	return isupdated;		
	}	


public static int deletestationNames[]={(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = stationNames[]={.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<stationNames[]={.length; statIndex++){
		  if(stationNames[]={statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		 stationNames[]={[newItemIndex] =stationNames[]={[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(stationNames[itemIndex]);
	} 
		
  }







	
	
}











   