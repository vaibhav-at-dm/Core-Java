package HomeAssignments;

public class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float balance) {

        if((accType.equals("Savings") && balance < 1000) || (accType.equals("Current") && balance < 5000)){
            try {
                throw new LowBalanceException("This Balance is not sufficient to open an account");
            } catch (LowBalanceException e) {
                System.out.println("Exception occurred : " + e.getMessage());
            }
        }
        else {
            this.accNo = accNo;
            this.custName = custName;
            this.accType = accType;
            this.balance = balance;
        }
    }
    public void deposit(float amt)
    {
        if (amt <= 0){
            try {
                throw new NegativeAmount("Zero or Negative amount cannot be deposited");
            } catch (NegativeAmount e) {
                e.printStackTrace();
            }
        }
        else{
            this.balance = this.balance + amt;
        }
    }
    public void withdraw(float amt)
    {
        if (amt <= 0){
            try {
                throw new NegativeAmount("This amount cant be withdrawn");
            } catch (NegativeAmount e) {
                e.printStackTrace();
            }
        }
        else if ((((this.balance - amt) < 1000) && this.accType.equals("Savings")) || (((this.balance - amt) < 5000) && this.accType.equals("Current")) || (amt >= this.balance)){
            try {
                throw new InsufficientFunds("Your Account is not eligible for withdrawal of " + amt);
            } catch (InsufficientFunds e) {
                e.printStackTrace();
            }
        }
        else {
            this.balance = this.balance - amt;
        }
    }
    public float getBalance(){
        if ((this.balance < 1000 && accType.equals("Savings"))  ||  (this.balance < 5000 && accType.equals("Current"))){
            try {
                throw new LowBalanceException("Account balance is below the given limits ");
            } catch (LowBalanceException e) {
                e.printStackTrace();
            }
        }
        return this.balance;
    }
    public String checkIfAccountCreated(){
        return this.accType;
    }

}
