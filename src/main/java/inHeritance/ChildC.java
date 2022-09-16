package inHeritance;

public class ChildC extends ChildB {
    public void division(int j,int k)
    {
        int l=j/k;
        System.out.println(l);

    }
    public void fullName(String firstName,String lastname){
        String Name=firstName+lastname;
        System.out.println(Name);
    }

    public static void main(String[] args) {
        ChildC ChildCobj=new ChildC();
        ChildCobj.addition(20,30); //from parentClass
        ChildCobj.subtraction(30,20);  // from parentClass
        ChildCobj.multiplication(2,15); // from ChildA
        ChildCobj.Add1(40,50); // from ClassB
        ChildCobj.sub1("Purohit ","Pandit"); //from ClassB
        ChildCobj.division(10,2);  //from same classC
        ChildCobj.fullName("Sachin ","Tendulker");  //from same ClassC

    }

}
