package methods;

public class NonstaticMetHoWork {
    public void add3Digit()
    {   int a=2013;
        int b=2016;
        int c=2019;
        int d=a+b+c;
        System.out.println(d);
    }
    public int sub3Digit()
    {   int e=1999;
        int f=1947;
        int g=1857;
        return e-f-g;
    }
    public void multi3Digit(int h,int i, int j)
    {
        int k=h*i*j;
        System.out.println(k);
    }

    public static void main(String[] args)
    {
        NonstaticMetHoWork nsmh=new NonstaticMetHoWork();
        nsmh.add3Digit();
        System.out.println(nsmh.sub3Digit());
        nsmh.multi3Digit(5,10,15);
    }
}
