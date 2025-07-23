package entity;

public class Client {

    private String name;
    private String surName;
    private String phoneNumber;
    private String mail;
    private Bill bill;

    public Client(String name, String surName, String phoneNumber, String mail, Bill bill) {
        this.name = name;
        this.surName = surName;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.bill = bill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
