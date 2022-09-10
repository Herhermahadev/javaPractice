package arrays;

import java.util.Random;

public class RandomNoDemo {

        public static void main(String[] args) {

            Random random=new Random();
            int myRandomNo =random.nextInt();
            System.out.println(myRandomNo);

            String email ="naresh"+ myRandomNo +"patel@gmail.com";
            System.out.println(email);




        }
    }

