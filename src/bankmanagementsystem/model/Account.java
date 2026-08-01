/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem.model;

/**
 *
 * @author sam_kartik
 */
public abstract class Account {
    private String accountNumber;
    private String accountType;
    protected double balance;
    private String accountOpenDate;
    public Account(String accountNumber,
                   String accountType,
                   double balance,
                   String accountOpenDate){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.accountOpenDate = accountOpenDate;
    }
    public abstract void withdraw(double amount);
    public abstract double calculateInterest();
    
    public void deposit(double amount) {
        balance += amount;
    }

    public double checkBalance() {
        return balance;
    }

}
class SavingAccount extends Account {
    public SavingAccount(String accountNumber,
                         String accountType,
                         double balance,
                         String accountOpenDate){
        super(accountNumber, accountType, balance, accountOpenDate);
    }
    @Override
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    @Override
    public double calculateInterest(){
        return balance * 4/100;
    }
}
class CurrentAccount extends Account{
    CurrentAccount(String accountNumber,
                         String accountType,
                         double balance,
                         String accountOpenDate){
        super(accountNumber, accountType, balance, accountOpenDate);
    }
    @Override
    public void withdraw(double amount){
          if(balance >= amount){
                 balance -= amount;
           }else{
                System.out.println("Insufficient balance");
            }
    }
    @Override
public double calculateInterest() {
    return 0;
}
 public String getTransactionHistory(){
    
        return null;
    
}
    
}