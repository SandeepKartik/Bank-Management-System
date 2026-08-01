/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem.model;

/**
 *
 * @author sam_kartik
 */
public class Document {

    private String documentType;
    private String documentNumber;
    private String issueDate;

    public Document(String documentType,
                    String documentNumber,
                    String issueDate) {

        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.issueDate = issueDate;
    }
}
    
    

