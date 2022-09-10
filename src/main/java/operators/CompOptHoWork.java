package operators;

public class CompOptHoWork {
    public void campHight(){
        float sam=5.4f;
        float amy=5.2f;
        float jason= 6.2f;
        System.out.println(jason<=amy);
        System.out.println(sam>amy);
        System.out.println(jason==sam);
    }
    public boolean compLength(int bakerloo,int overGround){

        return overGround>=bakerloo;
    }
    public static void compWeight(){
        int gopal= 88;
        int gomti=98;
        int kano = gomti-gopal;
        System.out.println(kano!=gomti);
        System.out.println(gopal==gomti);
    }


    public static void main(String[] args) {
        CompOptHoWork cohw=new CompOptHoWork();
        cohw.campHight();
        System.out.println(cohw.compLength(6000,5999));
        compWeight();
    }



}
