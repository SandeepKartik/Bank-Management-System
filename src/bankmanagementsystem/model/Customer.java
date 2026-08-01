/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem.model;

/**
 *
 * @author sam_kartik
 */
public class Customer {
    private String name;
    private String address;
    private String mobileNumber;
    private String email;
    private int age;
    private Account account;
    public Customer(String name, String address, String email,
                String mobileNumber, int age) {
    this.name = name;
    this.address = address;
    this.email = email;
    this.mobileNumber = mobileNumber;
    this.age = age;
}
    public void setDocument(Document document) {
    this.document = document;
}   
    
    private Document document;
    public void customerRequest(){
        
    }
    public void setAccount(Account account) {
    this.account = account;
}

public Account getAccount() {
    return account;
}
    
}
