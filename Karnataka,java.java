class Karnataka{

static String Karnataka[]={null,null,null,null,null};
static int index;

public static boolean createcity(String city){

boolean isCreate=false;
if(city!=null){
cityNames[index]=city;
index++;
iscreate=true;
}else{
	
	System.out.println("cannot add city,as it is a null value");
	
	
}
return iscreate;

public static void getAllCityNames(){
		
		System.out.println("invoking getAllCityNames");
		for(int city =0;city<Karnataka.length;city++){
			
			String reference =Karnataka[city];
			System.out.println("accessing city "+ reference +" at index"+city);
			
		}
		System.out.println("end of getAllcityNames");
		System.out.println("end of getAllcityNames");
		
	}
	
	
	
}
}