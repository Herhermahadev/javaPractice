package inHeritance;

public class ChildA extends ParentClass{
    public void multiplication(int x,int y){
        int z=x*y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        ChildA ChildA=new ChildA();
        ChildA.addition(20,25); // from ParentClass
        ChildA.subtraction(50,35); //from ParentClass
        ChildA.multiplication(5,10); //from Same ClassA
    }
}
