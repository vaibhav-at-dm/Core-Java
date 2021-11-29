package HomeAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankMain {
    public static void main(String[] args) {
        int accNo;
        String custName, accType;
        float balance;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("Enter Account Number : ");
            accNo = Integer.parseInt(br.readLine());

            System.out.println("Enter Customer Name : ");
            custName = br.readLine();

            System.out.println("Enter Account Type either Savings or Current");
            accType = br.readLine();

            System.out.println("Enter balance to open account  : ");
            balance = Float.parseFloat(br.readLine());

            BankAccount b = new BankAccount(accNo, custName, accType, balance);


            String Choice;
            try {
                if (b.checkIfAccountCreated().equals("Savings") || b.checkIfAccountCreated().equals("Current")) {
                    do {
                        System.out.println("These operations you can perform on your account ");
                        System.out.println("1) Check Balance \n2) Deposit amount \n3) Withdraw Amount \n4) Create New Account ");
                        int c = Integer.parseInt(br.readLine());

                        switch (c) {
                            case 1:
                                System.out.println(b.getBalance());
                                break;
                            case 2:
                                System.out.println("Enter Amount : ");
                                float amt = Float.parseFloat(br.readLine());
                                b.deposit(amt);
                                break;
                            case 3:
                                System.out.println("Withdraw amount : ");
                                float amt1 = Float.parseFloat(br.readLine());
                                b.withdraw(amt1);
                                break;
                            case 4:
                                main(null);
                            default:
                                System.out.println("Incorrect Choice...");
                        }
                        System.out.println("More Operations (Yes/No)");
                        Choice = br.readLine();
                    } while (Choice.equals("Yes"));
                }
            }catch (NullPointerException e){
                System.out.println("Account Not Created " );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
