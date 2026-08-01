/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankmanagementsystem.main;
import bankmanagementsystem.model.Bank;
import bankmanagementsystem.model.Manager;
import bankmanagementsystem.model.Customer;
import bankmanagementsystem.model.Document;
import bankmanagementsystem.model.Account;
import bankmanagementsystem.model.Transaction;


/**
 *
 * @author sam_kartik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank bank = new Bank("SBI","B001","Lucknow");
        Manager manager=new Manager("001","Sam kartik","75634672782",26,"Lucknow Uttar Pradesh");
        bank.setManager(manager);
        Customer customer = new Customer("Sam ","Ballia","Sam@gmail.com","6734763422",25);
        Document document = new Document("Aadhaar","123456789012","10-01-2022");
        customer.setDocument(document);
        Account account = manager.openAccount(customer, "Saving");

customer.setAccount(account);
       

customer.setAccount(account);

account.deposit(5000);

System.out.println("Balance : " + account.checkBalance());

account.withdraw(1000);

System.out.println("Balance : " + account.checkBalance());
    }
    
}
