class TravelAgencyTester{

public static void main(String place[]){
TravelAgency.createtouristplace("hassan");
TravelAgency.createtouristplace("bangaluru");
TravelAgency.createtouristplace("hampi");
TravelAgency.createtouristplace("chithradurga");
TravelAgency.createtouristplace("bijapura");
TravelAgency.createtouristplace("sakaleshapura");
TravelAgency.createtouristplace("mysuru");
TravelAgency.createtouristplace("yana");
TravelAgency.getAlltouristplace();

boolean isupdate=TravelAgency.updatetouristplace("mysuru","kernagar");
TravelAgency.getAlltouristplace();
}
}