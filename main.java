package week3_ds_proj1;

public class main {
    public static void main(String[] args) {
        creditcard my_card = new creditcard("Registan", "BCA", "Registan_123", 200, 1000);

        System.out.println("==================================");
        
        System.out.println("Customer name: " + my_card.getCustomer() +
                            "\nAccount: " + my_card.getAccount() +
                            "\nBank: " + my_card.getBank() +
                            "\nTransaction limit: " + my_card.getLimit() +
                            "\nCurrent Balance: " + my_card.getBalance()
        );

        System.out.println("==================================");

        System.out.println("Attempting transaction: $300" + "\nTransaction Finished: " + my_card.charge(300));

        System.out.println("==================================");

        my_card.makePayment(150);
    }
}
