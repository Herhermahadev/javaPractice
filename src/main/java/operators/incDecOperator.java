package operators;

public class incDecOperator {
    //increment/decrement  operator ++ --

    public static int num(int y){
       //return  y++;
       return ++y;
    }

    public static void main(String[] args) {
        int r= 25;
        r++;  //  POSTFIX first assign then increase  25+1
        System.out.println(r); //print 26
        ++r; //prefix increase first and then assign  26+1
        System.out.println(r);
        System.out.println(num(20));


    }
}
