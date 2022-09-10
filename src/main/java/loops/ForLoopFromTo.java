package loops;

// for (initialization; condition ; increment/decrement){statement to execute
//code........}


public class ForLoopFromTo {

    public static void checkOddNumber(int from, int to) {
        for (int a = from; a <= to; a++) {
            if (a % 2!= 0) {
                System.out.println(a);
            }

        }
    }
            public static void main (String[]args){
                checkOddNumber(10, 20);

    }

        }



