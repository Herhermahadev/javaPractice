package methods;

public class TypesOfmethods {
    int y = 5000;

    public static void add() {
        //static , instance method

        int a = 56;
        int b = 90;
        int c = a + b;
        System.out.println(c);
    }


    public static int multi() {
        // return type method
        int l = 5;
        int m = 25;
        int n = l * m;
        return n;

    }

    public static String myName() {
        String printName = "Resourcewise ";
        String coName = " Consultancy";
        return printName + coName;

    }

    public static boolean statement() {
        boolean b = true;
        boolean a = false;
        //boolean c = b && a;
        boolean d = a || b;
        //return c;
        return d;
    }

    public static void streetName(String myStreetName)
    //parameterized method
    {
        System.out.println(myStreetName);

    }

    public static void addTwoNo(int t, int u) {
        //parameterized method
        int c = t + u;
        System.out.println(c);

    }

    public void multiTwoDigit() {
        //non static method
        int h = 50;
        int i = 10;
        int j = h * i;
        System.out.println(j);
    }


    public static void main(String[] args) {
//        add();
//        int n=multi();
//        System.out.println(multi());
//        System.out.println(myName());
//        System.out.println(statement());
//        streetName("London Road");
        addTwoNo(10, 30);

        //object for multiTwoDigit
        TypesOfmethods tom = new TypesOfmethods();
        tom.multiTwoDigit();
        System.out.println(tom.y);
    }
}
