class Icecream{

static String flovors[]={null,null,null,null,null,null};
static int index;

public static boolean addflovors(String flv)
{
boolean  isAdded=false;
if(flv!=null)
{
flovors[index]=flv;
index++;
isAdded=true;

}else{
	
	System.out.println("cannot add flovors,as it is a null value");
	
	
}
return isAdded;
}
public static void getAllflovors(){
System.out.println("flovors");
		for(int flv =0;flv<flovors.length;flv++){
			
			String reference =flovors[flv];
			System.out.println("accessing flv "+ reference +" at index"+flv);
			
		}
		System.out.println("end of getAllflovors");
		
	}
	
	
	public static boolean updateflovors(String existingflovors,String updatedflovors){
		boolean isupdated = false;
	for(int flvindex = 0; flvindex<flovors.length; flvindex++)
	{
		
		if(flovors[flvindex].equals(existingflovors))
		{
			flovors[flvindex]=updatedflovors;
			isupdated=true;
		}
		
	}	
	return isupdated;		
	}
	
	
	public static int deleteflovors(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = flovors.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<flovors.length; statIndex++){
		  if(flovors[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  flovors[newItemIndex] = flovors[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllflovorsPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(flovors[itemIndex]);
	} 
		
  }
	
	
	
	
	
	
	
	
	

}
