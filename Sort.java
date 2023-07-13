class Sort{
public static void main(String arg[]){

//initialize array
int arr[]={5,2,8,7,1};
int temp=0;

//displaying element of original array
System.out.println("element of original array");
for(int i=0; i<arr.length; i++){
System.out.println(arr[i]+"");
}
for(int i=0; i<arr.length; i++){
    for(int j=i+1; j<arr.length; j++){
	  if(arr[i]>arr[j]){
	  temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
	  }
	
	
	}

}
System.out.println();
//displaying element of arry after sorting
System.out.println("elements of array sorted in assending order:");
for(int i=0; i<arr.length; i++){
	
	System.out.println(arr[i]+"");
}
}
}
