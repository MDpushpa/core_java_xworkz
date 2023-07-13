class Medicalstore1{
static String  madicienNames[]={null,null,null,null,null,null,null,null};
static int index;


public static boolean createmadicienNames( String madicien){
boolean isCreate=false;
if(madicien!=null){
madicienNames[index]=madicien;
index++;
isCreate=true;

}else{
System.out.println("cannot add madicienNames,as it is a null value");

}
return isCreate;
}
public static void getAllmadicienNames(){

System.out.println("madicienNames");
for(int madicien=0;madicien<madicienNames.length;madicien++){
      String reference =madicienNames[madicien];
			System.out.println("accessing madicien "+ reference +" at index"+madicien);
			
		}
		System.out.println("end of getAllmadicienNames");
		
	}
	
	
	
	public static boolean updatemadicienNames(String existingmadicienNames,String updatedmadicienNames){
		boolean isupdated = false;
	for(int madicienindex = 0; madicienindex<madicienNames.length; madicienindex++)
	{
		
		if(madicienNames[madicienindex].equals(existingmadicienNames))
		{
			madicienNames[madicienindex]=updatedmadicienNames;
			isupdated=true;
		}
		
	}	
	return isupdated;		
	}		
	
	
	
	
	
	
}
