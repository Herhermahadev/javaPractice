package operators;

public class AssigOptHoWork {
    public static void assigOpt1(){
        int t=25;
        System.out.println(t+=5);
        System.out.println(t-=15);
        System.out.println(t*=3);
    }
    public int assigOpt2(){
        int k=999;
        return k /=9;
    }
    public void assigOpt3(int l,int m, int n){
        int o=l%=m;
        int p=m%=n;
        System.out.println(o);
        System.out.println(p);
    }
    public void swapValue(){
        int raja=45;
        int rani=25;
        int gulam=45;
        raja=rani;
        rani=gulam;
        System.out.println(raja);
        System.out.println(rani);
    }

    public static void main(String[] args) {
        assigOpt1();
        AssigOptHoWork aohw=new AssigOptHoWork();
        System.out.println(aohw.assigOpt2());
        aohw.assigOpt3(80,60,40);
        aohw.swapValue();
    }
}
