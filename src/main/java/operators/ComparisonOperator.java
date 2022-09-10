package operators;

public class ComparisonOperator {
    //Always return boolean value
    //------->    ==   <>  <=  >= !=
    public static boolean myMethod(int a,int b){

        return a==b;
    }

    public static void main(String[] args) {

        System.out.println(myMethod(20,40));

//
//        int a=50;
//        int b=75;
//
//        System.out.println(a==b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a!=b);
    }
}
