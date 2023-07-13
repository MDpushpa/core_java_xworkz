class GardenTester{
public static void main(String arg[]){
Garden.createflower("rose flower");
Garden.createflower("lily flower");
Garden.createflower("jasmine flower");
Garden.createflower("sunflower");
Garden.createflower("jasmin");
Garden.getAllflowernames();


boolean isupdate=Garden.updateflowerNames("rose flower","red rose");
Garden.getAllflowernames();

int newLength =Garden.deleteflowerNames("sunflower");
   System.out.println("Calling getAllflowerNamesPostDeletion");
   Garden.getAllflowerNamesPostDeletion(newLength);


}
}