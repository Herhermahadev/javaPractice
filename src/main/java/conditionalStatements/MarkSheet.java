package conditionalStatements;

public class MarkSheet {

    public static void studentResult(int marks){
        if (marks>=35 && marks<=50){
            System.out.println("Pass with the passing "+ marks);
        }
        else if(marks>=51 && marks<= 61){
            System.out.println("Pass with Third class "+ marks);
        }
        else if(marks>=62 && marks<=72){
            System.out.println("pass with second class " + marks);
        }

        else if (marks>=73 && marks<=85) {
            System.out.println("pass with First Class " + marks);
        }
        else if (marks>=86 && marks<=100){
            System.out.println("pass with distinction "+ marks);}
        else {
            System.out.println("FAILED");
        }
    }

    public static void main(String[] args) {
        studentResult(85);
        studentResult(90);
        studentResult(62);
        studentResult(51);
        studentResult(-1);
        studentResult(34);
    }
}
