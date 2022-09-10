package conditionalStatements;

public class OddEvenNumber {

    public static void odd_or_Even(int number){
        if (number%2==0) {
            System.out.println(number + " is even number");
        }
        else {
            System.out.println(number + " is odd number");
        }
    }
    public static void main(String[] args) {
        odd_or_Even(22342);

    }
}
