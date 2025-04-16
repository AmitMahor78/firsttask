 import java.util.Scanner;
 // user class
 class user{
        private double balance;

      public user(double balance)  {
        this.balance = balance;
      }
      public double getbalance(){
             return balance;
      }
      public void setbalance(double balance){
        this.balance = balance;
      }
      public boolean withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance = balance - amount;
           return true;
        }
        else{
            return false;
        }
      
      }
      public void deposit(double amount){
        if(amount>0){
            balance = balance + amount;
        }

       }

}
// ATM class

class ATM{
  private  user account;
  private Scanner sc;

  public ATM(user account){
    this.account = account;
    sc = new Scanner(System.in);

  }
  public void display(){
    while (true) {
        System.out.println("\nATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBal();
                break;
            case 4:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

private void withdraw(){
    System.out.println("Enter ammount to withdraw: ");
    double amount = sc.nextDouble();

    if (account.withdraw(amount)) {
        System.out.println("Withdrawal successful. New balance: " + account.getbalance());
    } else {
        System.out.println("invalid amount.");
    }


}
private void deposit(){
         
    System.out.println("Enter ammount for deposite ");
    double amount = sc.nextDouble();
    account.deposit(amount);
    System.out.println("Deposit successful. New balance: " + account.getbalance());


}
private void checkBal(){
    System.out.println("Your current balance is: " + account.getbalance());

}

  }

public class thirdtask {
    public static void main(String[] args) {
        
    //   user us = new user();
    //   us.BankAccount(12000.000);
    //   us.getbalance()

    user account = new user(1000.0);
    ATM atm = new ATM(account);
    atm.display();
    
    ;

    }
}
