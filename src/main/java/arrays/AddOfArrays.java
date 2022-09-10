package arrays;

public class AddOfArrays {
    public static void main(String[] args) {

        int i[]={2,4,5,9,5,7,3,8};

        int add=0;


       /* for (int a=0 ; a<i.length ; a++)
        {
            add=add+i[a];
        }
        System.out.println("Addition of all emements is "+ add);*/

        for (int value:i)    //foreach/Enhanced forloop
        {
            add=add+value;
        }

        System.out.println("Addition of all elements is "+ add);
    }
}
