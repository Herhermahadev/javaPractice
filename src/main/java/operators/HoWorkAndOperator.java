package operators;

public class HoWorkAndOperator { // && operator

    public static void andOperator(){
        boolean a=true;
        boolean b=false;
        boolean c= (a==b && a!=b);
        System.out.println(c);
    }
    public boolean andOperator1(){
        int a=1727;
        int b= 1525;
        boolean c=(a>=b && b>=a);
        return c;
    }
    public static void andOperator2(short c, short d){
        boolean m=(c!=d && c>d);
        System.out.println(m);

    }

    public static void main(String[] args) {
        andOperator();
        HoWorkAndOperator and=new HoWorkAndOperator();
        System.out.println(and.andOperator1());
        andOperator2((short) 3, (short) 5);

    }
}
