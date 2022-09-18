package polymorphism;

public class MyCar extends MetOverriiding{

    public void volvo(String colour,int price)
    {
        System.out.println("This is my volovo from MyCar Class");
    }

    public void hyundai(String colour,int price)
    {
        System.out.println("This is my Hyundai from MyCar Class");
    }

    public static void main(String[] args) {

        MyCar mc=new MyCar();
        mc.volvo("Silver",35000); //override from MetOverridingClass
        mc.nissan("Blue",23000);  // from parentclass
        mc.hyundai("Grey",27000);
    }
}
