package arrays;

public class FindElemandItsPosition {
    public static void main(String[] args) {
        int myNum[] = {25, 35, 65, 85, 95, 15, 75, 45, 55};

        int find = 55; //pass number
        boolean tag=false;

        for (int i = 0; i < myNum.length; i++) {
            //System.out.println(myNum[i]);

            if (find == myNum[i]) {
                System.out.println("Element found at " + i +" index");
                tag=true;
                break;
            }
        }
        if (tag==false)
        System.out.println("Element not found");
    }
}