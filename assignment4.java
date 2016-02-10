class Bank{
int getRate(){return 0;}
}

class Bank2 extends Bank{
int getRate(){return 10;}
}

class Bank3 extends Bank{
int getRate(){return 7;}
}
class Bank4 extends Bank{
int getRate(){return 2;}
}

class assignment4{

public static void main(String args[]){
Bank b1=new Bank2();
Bank b2=new Bank3();
Bank b3=new Bank4();
System.out.println("Bank1 Rate of Interest: "+b1.getRate());
System.out.println("Bank2 Rate of Interest: "+b2.getRate());
System.out.println("Bank3 Rate of Interest: "+b3.getRate());
}
}
