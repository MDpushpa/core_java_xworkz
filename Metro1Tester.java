class Metro1Tester{

public static void main(String Sation[]){

Metro1.addstation("rajaginagar");
Metro1.addstation("kr puram");
Metro1.addstation("whitefiled");
Metro1.addstation("nagasandra");
Metro1.addstation("madavara");
Metro1.addstation("majestic");
Metro1.addstation("yesvantpura");
Metro1.getAllstationNames();

boolean isupdate=Metro1.updatestationNames("kr puram","kolankuntte");
Metro1.getAllstationNames();




int newLength =Metro1.deletestationNames("majestic");
   System.out.println("Calling getAllstationNamesPostDeletion");
  Metro1.getAllstationNamesPostDeletion(newLength);

}


}