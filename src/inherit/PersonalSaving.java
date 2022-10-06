package inherit;

public abstract class PersonalSaving extends PersonalAccount {

    public final double interestRate = 0.03; // 3% interest rate
    public final double monthlyfee = 20;
    private int withdrawCount = 0;
    // Constructor
    public PersonalSaving(String name, String address, String email, String phone) {
        super(name, address, email, phone);
    }

    // No need for deposit, it's in the grandparent class.

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            withdrawCount++;
            return true;
        }
        return false;
    }

    public void addfee() {
        if(withdrawCount > 5) {
            balance -= ((withdrawCount - 5) * 5);
            withdrawCount = 0;
        }
        if(balance > 3000) {
            balance = balance;
        }
        else {
            balance -= monthlyfee;
        }
    }
}
