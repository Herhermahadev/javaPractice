package operators;

public class HoWorkOrOperator {
    // || or
    public static boolean orOperator(int a,int b)
    {
        boolean c=(a>=b || a!=b);
        return c;
    }
    public void compare()
    {
        int a= 89;
        int b=48;
        boolean c=(a<b || b>a);
        System.out.println(c);
    }
    public  void trueorFalse(int q, int k){
        boolean p=(q!=k || k>=q);
        System.out.println(p);
    }

    public static void main(String[] args) {
        System.out.println( orOperator(5,7));
        HoWorkOrOperator hwor=new HoWorkOrOperator();
        hwor.compare();
        hwor.trueorFalse(477,839);
    }
}
