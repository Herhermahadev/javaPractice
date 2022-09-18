package polymorphism;

public class PaymentTypes extends MetOverloading {

    public void giftVoucher(int voucherNo, int voucherAmount)
    {
        System.out.println("Voucher accepted");
    }

    public void giftVoucher(String coName )
    {
        System.out.println("Thank you ");
    }

    public static void main(String[] args) {
        PaymentTypes pt= new PaymentTypes();

        pt.debitCard(1234,1122);
        pt.debitCard(6543,1025,"S K Masala");
        pt.debitCard(12345678,1223,"T k maxx",123);
        pt.giftVoucher(456789,75);
        pt.giftVoucher("Next");
    }


}
