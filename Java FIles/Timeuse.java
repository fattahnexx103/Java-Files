class Timeuse {

public static void main(String[] args){

Multipleconstructor object = new Multipleconstructor();
Multipleconstructor object1 = new Multipleconstructor(2);
Multipleconstructor object2 = new Multipleconstructor(13,24);
Multipleconstructor object3 = new Multipleconstructor(13,26,13);

System.out.printf("%s\n",object.toMilitary());// %s\n means string followed by a line
System.out.printf("%s\n",object1.toMilitary());
System.out.printf("%s\n",object2.toMilitary());
System.out.printf("%s\n",object3.toMilitary());

}

}