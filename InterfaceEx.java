package OOPS;
//An interface is used to define a contract that implementing classes that follow
interface Payment{
    void pay();
}
class CreditCard implements Payment {
    public void pay() {
        System.out.println("payment using credit card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment using UPI");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        CreditCard card = new CreditCard();
        card.pay();
        UPI upi = new UPI();
        upi.pay();
    }
}