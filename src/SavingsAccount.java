public class SavingsAccount extends BankAccount{
    double interstRate;

    public SavingsAccount(double balance, double interstRate) {
        super(balance);
        this.interstRate = interstRate;
    }

    public double getInterstRate() {return interstRate;}
    public void setInterstRate(double interstRate) {this.interstRate = interstRate;}

    @Override
    public Double calculateInterest(){
        return (balance * interstRate) - balance;
    }
}
