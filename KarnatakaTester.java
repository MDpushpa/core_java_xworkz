 class KarnatakaTester{
 public static void main(String city[]){
Karnataka1.createcity("hassan city");
 Karnataka1.createcity("mangaluru city");
Karnataka1.createcity("bangalore city");
 Karnataka1.createcity("shanthigram city");
 Karnataka1.createcity("chikamangalore city");
 Karnataka1.createcity("kopa city ");
 Karnataka1.createcity("kalaburagi city ");
 Karnataka1.createcity("daravada city ");
 Karnataka1.createcity("mandya city ");
 
Karnataka1.getAllKarnataka();
  
boolean isupdate=Karnataka1.updateKarnataka("bangalore city","bengaluru");

 Karnataka1.getAllKarnataka();
 
 int newLength = Karnataka1.deleteKarnataka("city");
   System.out.println("Calling getAllKarnataka1PostDeletion");
   Karnataka1.getAllKarnataka1PostDeletion(newLength);
   
 
 
 
 }
 }