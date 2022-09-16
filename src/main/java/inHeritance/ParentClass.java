package inHeritance;

public class ParentClass {
    String streetName= "Smith Street";
    static int houseNumber=157;

    public static void SumOfFourDigit(int C1,int C2,int C3,int C4){
        System.out.println(C1+C2+C3+C4);
    }


    public void addition(int a,int b)
    {   int c=a+b;
        System.out.println(c);
    }

    public void subtraction(int p,int q){
        int r=p-q;
        System.out.println(r);

    }

    public static void main(String[] args) {
        ParentClass pclass=new ParentClass();
        pclass.addition(100,200);
        pclass.subtraction(200,125);
        ParentClass.SumOfFourDigit(1,2,3,4); //Static method access directly with out object creation.
    }
}
