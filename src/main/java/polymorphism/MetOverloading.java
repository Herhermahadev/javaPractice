package polymorphism;

public class MetOverloading {

    public void debitCard(int cardNo,int expiryDate)

    {
        System.out.println("Barclays visaCard");
    }

    public void debitCard(int cardNo,int expiryDate,String Name)
    {
        System.out.println("Halifax Master card ");
    }

    public void debitCard(int cardNo,int expiryDate,String Name,int cvv)
    {
        System.out.println("Payment successfull your order is on its way ");
    }

    public static void main(String[] args) {
        MetOverloading mo=new MetOverloading();
        mo.debitCard(12345678,1228);
        mo.debitCard(12345,1124," K P Patel");

    }

}
