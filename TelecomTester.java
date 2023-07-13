class TelecomTester{

public static void main(String arg[]){

Telecom.saveSim("jio sim");
Telecom.saveSim("bsnl sim");
Telecom.saveSim("airtel sim");
Telecom.saveSim("vi sim");
Telecom.saveSim("ideal sim");
Telecom.getAllTelecom1();



boolean isupdate=Telecom.updateTelecom1("jio sim","releyance");

Telecom.getAllTelecom1();



int newLength =Telecom.deleteTelecom1("ideal sim");
   System.out.println("Calling getAllTelecom1PostDeletion");
   Telecom.getAllTelecom1PostDeletion(newLength);

}

}