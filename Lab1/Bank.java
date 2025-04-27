class Account {
  private String name;
  private String accNumber;
  private String address;
  private String type;
  private double balance;

  Account(String user, String accNum, double bal) {
    name = user;
    accNumber = accNum;
    balance = bal;
  }

  Account(String user, String accNum, String add, String accType, double bal) {
    name = user;
    accNumber = accNum;
    address = add;
    type = accType;
    balance = bal;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposited: " + amount);
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println("Withdrawn: " + amount);
    } else {
      System.out.println("Insufficient balance");
    }
  }

  public double getBalance() {
    return balance;
  }
}

public class Bank {
  public static void main(String[] args) {
    Account acc1 = new Account("Saurav", "A12345", 1000.0);
    Account acc2 = new Account("Ram", "B54321", "123 Main St", "Saving", 5000.0);

    acc1.deposit(500);
    acc1.withdraw(200);
    System.out.println("Account 1 Balance: " + acc1.getBalance());

    acc2.withdraw(1000);
    acc2.deposit(300);
    System.out.println("Account 2 Balance: " + acc2.getBalance());
  }
}
