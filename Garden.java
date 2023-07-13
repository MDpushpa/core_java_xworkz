class Garden{
static String flowerNames[]={null,null,null,null,null};
static int index;

public static boolean createflower(String flower)
{
boolean isCreate=false;
if(flower!=null){
flowerNames[index]=flower;
index++;
isCreate=true;

}else{
	
	System.out.println("cannot add flower,as it is a null value");
	
	
}
return isCreate;
}
public static void getAllflowernames(){
System.out.println("flowernames");
		for(int flower =0;flower<flowerNames.length;flower++){
			
			String reference =flowerNames[flower];
			System.out.println("accessing flower "+ reference +" at index"+flower);
			
		}
		
		
	}
	public static boolean updateflowerNames(String existingflowerNames,String updatedflowerNames){
		boolean isupdated = false;
	for(int flowerindex = 0; flowerindex<flowerNames.length; flowerindex++){
		
		if(flowerNames[flowerindex].equals(existingflowerNames)){
			flowerNames[flowerindex]=updatedflowerNames;
			isupdated=true;
		}
		
	}	
	return isupdated;		
	}
	
	public static int deleteflowerNames(String deletedItemName){
	  boolean isDeleted = false;
	  int statIndex;
	  int noOfElements = flowerNames.length;  //store the length in a dummy variable and then alter the length
	  for(statIndex=0; statIndex<flowerNames.length; statIndex++){
		  if(flowerNames[statIndex].equals(deletedItemName)){
			  break;
		  }
	  }
	  
	  if(statIndex < noOfElements){
	  noOfElements = noOfElements-1;
	  for(int newItemIndex=statIndex; newItemIndex < noOfElements; newItemIndex++){
		  //logic to remove deleted data from the array
		  //  5=6 from assigning from 6 to 5 position 
		  //6=7
		  flowerNames[newItemIndex] = flowerNames[newItemIndex+1];
	  }
	  }
	  System.out.println(noOfElements);
	  return noOfElements;
  }
  
  public static void getAllflowerNamesPostDeletion(int newLength){
	for(int itemIndex=0; itemIndex < newLength; itemIndex++){
		System.out.println(flowerNames[itemIndex]);
	} 
		
  }
	
	
	
	
	
	
	}

 