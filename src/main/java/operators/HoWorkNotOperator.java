package operators;

public class HoWorkNotOperator { //   ! operator it reverse the answer.

    public void notOperator1(){
        boolean b=true;
        boolean d=false;
//        System.out.println(!b);
        System.out.println(!(d==b && b!=d)); // any 1 is false then ans is false and i put! so the ans is true
    }
    public boolean notOperator2(){
        int h=9; int j=900;
        boolean hj=(h<=j || j>h);
        return hj;
    }

    public static void main(String[] args) {
        HoWorkNotOperator not=new HoWorkNotOperator();
        not.notOperator1();
        System.out.println(not.notOperator2());
    }

}
