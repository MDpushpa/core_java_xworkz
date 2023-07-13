class Smart1{

static String vagitable[]={"Potato","onion","ladyfinger","tamota","carrate","brinjal","beans","cabbage","calliflower","drumstic"};
static String biscuits[]={"goodday","marrigold","50-50","20-20","milky","creamy","marle","parle-G","burbon","milkybites"};
static String perfume[]={"signature","fog","densor","nivia","vanilla perfume","best robost","chanel chance"};
static String gloceries[]={"pasta","rice","meat","bread","chees","sauces","eggs","eggssuper"};
static String consmetic[]={"cream","powder","nilepallish","poundetion","face primer","blush",
                          "Eyebrow pencil","Eye Primer","face powder","dior","silicon based","oil removal jel","moisturizer","lipstik","lip balm","nail.filter","eye kajal","compact","eyeshado","cleanser","lip gloss","lotion","sponge","hand cream"};



public static void main(String smart[])
{
System.out.println("main started");
System.out.println("list the vagitable are");
getvagitable();
System.out.println("list the biscuits are");
fatchbiscuits();
System.out.println("list the perfumeare are");
getperfume();
System.out.println("list the gloceries  are");
fatchgloceries();
System.out.println("list the consmetic are");
getconsmetic();
}
//for


public static void getvagitable()
{
System.out.println("inside vagitable ");
for(String vagitables : vagitable){
System.out.println(vagitables);
}
}
public static void fatchbiscuits()
{
System.out.println("inside biscuits ");
for(String biscuit : biscuits){
System.out.println(biscuit);
}
}
public static void getperfume()
{
System.out.println("inside perfume ");
for(String perfumes : perfume){
System.out.println(perfumes);
}
}
public static void fatchgloceries()
{
System.out.println("inside gloceries ");
for(String glocerie : gloceries){
System.out.println(glocerie);
}
}
public static void getconsmetic()
{
System.out.println("inside consmetic ");
for(String consmeticr : consmetic){
System.out.println(consmeticr);
}
}
}



