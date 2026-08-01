/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem.model;

/**
 *
 * @author sam_kartik
 */
public class Bank {
    private Customer customer;
private Account account;
private Manager manager;
    private String bankName;
    private String bankId;
    private String bnakHeadOfficeAddress;
  public   Bank(String bankName ,String bankId,String bankHeadOfficeAddress){
        this.bankName=bankName;
        this.bankId=bankId;
        this.bnakHeadOfficeAddress=bankHeadOfficeAddress;
    }
  public void setManager(Manager manager){
      this.manager = manager;
  }

public Manager getManager(){
    return manager;
}
 //   public int getTotalCustomers();
   // public void showBankSummary();
   // public void manageEmployee();
}
