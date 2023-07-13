class IcecreamTester{
public static void main(String arg[]){
Icecream.addflovors("venila");
Icecream.addflovors("mango");
Icecream.addflovors("chocolate");
Icecream.addflovors("matcha");
Icecream.addflovors("butter pecan");
Icecream.addflovors("strawberry");
Icecream.getAllflovors();



boolean isupdate=Icecream.updateflovors("mango","orange");
Icecream.getAllflovors();
int newLength =Icecream.deleteflovors("strawberry");
   System.out.println("Calling getAllflovorsPostDeletion");
  Icecream.getAllflovorsPostDeletion(newLength);


}




}