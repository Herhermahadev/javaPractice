package arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        String name[] = {"rahul ", "jigar ", "kanak ", "naman ", "Hiren "};

        arr[2]=9; // modify value stored at index 2

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int j = 0; j < name.length; j++)
            System.out.println(name[j]);

        for (String s : name) {
            System.out.print(s);
        }

    }
}

