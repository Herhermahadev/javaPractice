package string;

public class StringMethods {
    public static void main(String[] args) {
        String K="firstName ";
        String Q="LastName ";

        System.out.println(K.length());
        System.out.println(K.charAt(5));
        System.out.println(K.concat(Q));
        System.out.println(K.toUpperCase());
        System.out.println(Q.trim());
        //System.out.println(K.compareTo(Q));
        System.out.println(Q.indexOf('e'));
        //System.out.println(K.compareTo(Q));
        System.out.println(K.replace("first","middle"));
        System.out.println(Q.replace('L','M'));
        System.out.println(K.contains("Name"));
        System.out.println(K.substring(1,4));
        System.out.println(Q.indexOf('m'));

        StringBuffer stringBuffer=new StringBuffer(K);
        System.out.println(stringBuffer.reverse());





    }

}
