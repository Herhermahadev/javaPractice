package dataTypes;

public class Variable {
    // is a containers which hold certain values , example r=5 r is variable here

    static int birthdate= 12345;  //Static Variable
    int myHouseNumber= 1220;       //Global or instance variable

    public void myMethod()  //user defined method
    {

        int b=650;     // int a, b, & c is Local Variable

    }

    public static void main(String[] args)
    {
        int a;     //declaration       (int here is Datatype)
        a = 450;   //initialization
        int c=150;    //int a & c is instance variable
        System.out.println(a+c);
        System.out.println(birthdate);




    }





}
