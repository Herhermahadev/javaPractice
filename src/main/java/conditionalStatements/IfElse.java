package conditionalStatements;

public class IfElse {
    public static void oyster(float Balance) {
    float MINIMUM_BALANCE=10.00f;
        if (Balance >=MINIMUM_BALANCE) {
            System.out.println("Barrier opens");
        } else {
            System.out.println("barriers bips saying please top up your balance");
        }
    }


    public static void main(String[] args) {
        oyster(1.25f);


    }
}