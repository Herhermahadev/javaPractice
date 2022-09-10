package loops;

public class ForloopTimeTable {
    public static void timeTable(int tableNumber){
        for(int i=1; i<=10 ; i++){
            int value= tableNumber*i;
            System.out.println(tableNumber + "x" + i +"=" + value);

        }

    }

    public static void main(String[] args) {
        timeTable(12);

    }
}
