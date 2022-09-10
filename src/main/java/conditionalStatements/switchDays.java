package conditionalStatements;

public class switchDays {
    public static void checkMonth(String dayName)
    {
        switch (dayName)
        {
        case "Monday":
            System.out.println("First day of the week");break;
        case "Tuesday":
            System.out.println("Second day of the week");break;
            case "Wednesday":
                System.out.println("Third day of the week");break;
            case "Thursday":
                System.out.println("Fourth day of the week");break;
            case "Friday":
                System.out.println("Fifth day of the week");break;
            case "Saturday":
                System.out.println("Sixth day of the week");break;
            case "Sunday":
                System.out.println("Seventh day of the week");
                default:
            System.out.println("is not a week day");
    }

    }

    public static void main(String[] args) {
        checkMonth("Tuesday");
    }
}
