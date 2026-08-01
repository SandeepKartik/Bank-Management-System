/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem.model;

/**
 *
 * @author sam_kartik
 */
public class Manager {

    private Bank bank;
    private String managerId;
    private String managerName;
    private String mobileNumber;
    private int age;
    private String address;

    public Manager(String managerId,
            String managerName,
            String mobileNumber,
            int age,
            String address) {

        this.managerId = managerId;
        this.managerName = managerName;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.address = address;
    }

    public boolean accountVerify(Document document) {
        if (document == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setPermission() {
    }

    public Account openAccount(Customer customer, String accountType) {

        if (accountType.equalsIgnoreCase("Saving")) {
            return new SavingAccount("A1001","Saving",0,"01-08-2026");
        }
        if (accountType.equalsIgnoreCase("Current")) {
            return new CurrentAccount("C1001","Current",0,"01-08-2026");
        }
        return null;
    }

}
