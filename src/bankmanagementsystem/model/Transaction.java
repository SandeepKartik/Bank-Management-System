/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem.model;

/**
 *
 * @author sam_kartik
 */
public class Transaction {
    protected double amount;
    private String time;
    private String date;
    private String accountNumber;
    private int transactionId;
    Transaction(double amount,String time,String date, String accountNumber,int transactionId){
        this.transactionId=transactionId;
        this.amount=amount;
        this.accountNumber=accountNumber;
        this.date=date;
        this.time=time;
    }
  public void  showTransactionHistory(){
       
   }
    
}
