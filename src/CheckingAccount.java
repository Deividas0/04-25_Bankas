public class CheckingAccount extends BankAccount{
    double transactionFee;

    public CheckingAccount(double balance,double transactionFee) {
        super(balance);
    }

    public double getTransactionFee() {return transactionFee;}
    public void setTransactionFee(double transactionFee) {this.transactionFee = transactionFee;}

    @Override
    public Double calculateInterest(){
        return 0.0;
    }
}
