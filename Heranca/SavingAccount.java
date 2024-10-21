package Heranca;

public class SavingAccount extends Acciount{
    private double intersrtRate;

    public SavingAccount(Integer number, String holder, Double balance, double intersrtRate) {
        super(number, holder, balance);
        this.intersrtRate = intersrtRate;

    }

    public double getIntersrtRate() {
        return intersrtRate;
    }

    public void setIntersrtRate(double intersrtRate) {
        this.intersrtRate = intersrtRate;
    }

    public void updateBalance(){
        //balance += intersrtRate;
    }
}
