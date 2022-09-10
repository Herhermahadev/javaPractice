package operators;

public class LogicalOperators{
    //----------->>>>>   && (and) any one is false then ans. is false
    //  ||(or)
    //  !(opposite) reverse the ans.
    // works between two boolean

    public static boolean twoNo(int a,int b){
    boolean flag= (a>=b && a<b);
    return flag;
    }

    public static void main(String[] args) {

        System.out.println(twoNo(5,7));

    }
{

//         boolean a=false;
//          boolean z=true;
//
//        System.out.println(a&&z);
//        System.out.println(a||z);
//        System.out.println(!z);
//        System.out.println(!a);
//
//        int c=6877;
//        int d=865;
//        System.out.println(c>d || c==d);
//        System.out.println(c>=d  && d!=c);
//




    }
}

