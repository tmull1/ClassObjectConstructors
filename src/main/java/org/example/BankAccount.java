package org.example;
public class BankAccount {
    private String name;
    private double balance;


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }


    public void printAccountDetails() {
        System.out.println(name + "'s account balance: " + balance);
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Larry", 5000.0);
        BankAccount account2 = new BankAccount("Mary", 300.0);


        account1.withdraw(100.0);

        account2.deposit(100.0);


        account1.printAccountDetails();
        account2.printAccountDetails();
    }
}

