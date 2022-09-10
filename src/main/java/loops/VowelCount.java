package loops;



public class VowelCount {
    public static void main(String[] args) {
        int vcount=0;
        int ccount=0;

        String statement=("Nirav and Nareshsir teaches java");
        statement=statement.toLowerCase();

        for(int i=0; i<statement.length(); i++){
            if (statement.charAt(i)=='a' || statement.charAt(i)=='e' || statement.charAt(i)=='i' || statement.charAt(i)=='o'
        || statement.charAt(i)=='u')
            { vcount++;
}
else if (statement.charAt(i)>='a' && statement.charAt(i)<='z'){
                 ccount++;
            }
        } System.out.println("Count of vowels "+ vcount);
          System.out.println("Count of consonants "+ ccount);

    }
}
