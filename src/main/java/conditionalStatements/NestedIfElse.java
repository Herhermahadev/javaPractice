package conditionalStatements;

public class NestedIfElse {

    public static void compareNumbers(int x, int y, int z){
        if (x > y && x > z)
        {
            System.out.println("x is the largest number");
        }
        else if (y>x && y>z){
            System.out.println("y is the largest number");
        }
        else {
            System.out.println("z is the largest number");
        }

    }

    public static void main(String[] args) {
//        int x = 100;
//        int y = 200;
//        int z = 30;
        compareNumbers(30,60,70);
        compareNumbers(90,67,84);


 //Other Way

//        if (x > y && x > z)
//        {
//            System.out.println(" x is the largest number");
//        }
//        else
//        {if (y > x && y > z)
//        {
//                System.out.println("y is the largest number");
//        }
//            else {
//                System.out.println("z is the largest number");
//                 }
//        }
        }


}
