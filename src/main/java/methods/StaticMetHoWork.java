package methods;

public class StaticMetHoWork {
    public static void addThreeDigit()
    {   int a= 25;
        int b= 35;
        int c= 45;
        int d=a+b+c;
        System.out.println(d);
    }
    public static int multiThreeDigit()
    {   int x=20;
        int y=30;
        int z=40;
        int A=20*30*40;
        return A;
    }
    public static void subtractionOfThreeDigit(int l,int m,int n)
    {   int O = l - m - n;
        System.out.println(O);
    }

    public static void main(String[] args)
    {
        addThreeDigit();
        System.out.println(multiThreeDigit());
        subtractionOfThreeDigit(100,50,25);
    }

}
