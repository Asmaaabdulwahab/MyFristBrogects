public class CreditCard {
    private String cardNumber;
    private double balance;
    private double creditLimit;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = 0;
        this.creditLimit = creditLimit;
    }
    public void updateCreditLimit(double newLimit){
        this.creditLimit=newLimit;
    }
    public void charge(double amount){
        if (amount<=(creditLimit-balance)){
            balance+=amount;
            System.out.println("Successfully made a payment of : " + amount);
        }
        else {
            System.out.println("Invalid  payment amount : " );
        }
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        CreditCard myCard=new CreditCard("1234-5-568-234-877",500.23);
        System.out.println("Initial Credit Limit : " +myCard.getCreditLimit());
        myCard.updateCreditLimit(9000.7);
        System.out.println("update Credit Limit : " + myCard.getCreditLimit());

    }



}
