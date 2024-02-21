package week3_ds_proj1;

public class creditcard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    /** 
        @param customer The person who owns the card
        @param bank Bank name
        @param account Account name
        @param limit Maximum transaction
        @param balance Total money
    */

    public creditcard(String customer_set, String bank_set, String account_set, int limit_set, double balance_set){
        customer = customer_set;
        bank = bank_set;
        account = account_set;
        limit = limit_set;
        balance = balance_set;
    }

    public String getCustomer() {return customer;}
    public String getBank() {return bank;}
    public String getAccount() {return account;}
    public int getLimit() {return limit;}
    public double getBalance() {return balance;}
    public boolean charge(double price) {return price <= limit;}
    public void makePayment(double amount) {System.out.println("Payment of " + amount +" has been made.");}
}
