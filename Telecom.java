class Telecom{
static String Telecom1[]={null,null,null,null,null};
static int index;
public static boolean saveSim(String sim)
{
	boolean isSaveSim=false;
	if(sim!=null)
	{
	Telecom1[index]=sim;
	index++;
	isSaveSim=true;
	}
	else
	{
	System.out.println("cannot add sim,as it is a null value");
	}
	return isSaveSim;
}
public static void getAllTelecom1(){
System.out.println(" start getAllTelecom1");
for(int sim =0;sim<Telecom1.length;sim++){
			
			String reference =Telecom1[sim];
			System.out.println("accessing sim "+ reference +" at index"+sim);
			
		}
		System.out.println("end of getAllsim");
		
	}
	
	
	public static boolean updateTelecom1(String existingTelecom1,String updatedTelecom1){
		boolean isupdated = false;
	for(int simindex = 0; simindex<Telecom1.length; simindex++){
		
		if(Telecom1[simindex].equals(existingTelecom1)){
			Telecom1[simindex]=updatedTelecom1;
			isupdated=true;
		}
		
	}	
	return isupdated;		
	}
	
	
	
	
	
  public static int deleteTelecom1(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = Telecom1.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<Telecom1.length; statIndex++){
		  if(Telecom1[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  Telecom1[newItemIndex] = Telecom1[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllTelecom1PostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(Telecom1[itemIndex]);
	} 
		
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	

