class ChairTester{



public static void main(String s[]){

//onject creation in java
Chair chair = new Chair();
System.out.println("creating a 1st copy of the chair");
chair.name ="nirmala";
chair.color ="blue";
chair.type ="wood";
chair.price =500;
chair.toSit();

System.out.println(chair.name );
System.out.println(chair.color);
System.out.println(chair.type );
System.out.println(chair.price);

Chair chair1 = new Chair();
System.out.println("creating a 2nd copy of the chair");
chair1.name ="nirmala";
chair1.color ="red";
chair1.type ="plastic";
chair1.price =700;
chair1.toSit();


/*System.out.println(chair1.name);
System.out.println(chair1.color);
System.out.println(chair1.type);
System.out.println(chair1.price);*/



}


}