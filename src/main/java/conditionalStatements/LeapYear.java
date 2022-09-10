package conditionalStatements;

// year can be divided by 400 ||
//year can be divided by 4  &  not by 100

public class LeapYear {
    public static void checkLeapYearorNot(int year){
        if ((year % 4 ==0) || (year % 400 ==0) && (year % 100 !=0) ){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void main(String[] args) {
        checkLeapYearorNot(2000);
    }
}
