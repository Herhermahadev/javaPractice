package inHeritance;

public class ChildB extends ChildA {
    public void Add1(int A1,int A2){
        int A3=A1+A2;
        System.out.println(A3);
    }
    public void sub1(String mrs,String mr){
        String couple=mrs+mr;
        System.out.println(couple);

    }

    public static void main(String[] args) {
        ChildB childBObj=new ChildB();
        childBObj.addition(5,6);  //from parentClass
        childBObj.subtraction(25,10); //from parentClass
        childBObj.multiplication(6,10); //from ChildA Class
        childBObj.Add1(400,160);  //from Same ClassB
        childBObj.sub1("Gupta","Sharma");  //from Same classB
    }
}
