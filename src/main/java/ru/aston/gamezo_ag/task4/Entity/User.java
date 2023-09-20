package ru.aston.gamezo_ag.task4.Entity;

public class User {
    private long id;
    private String name;
    private String surname;
    private String middle_name;
    private String number;
    private String email;
    private long orderId;

    public User(long id, String name, String surname, String middle_name, String number, String email,long orderId){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.number = number;
        this.email = email;
        this.orderId = orderId;
    }

    public User(String name, String surname, String middleName,
                String number, String email, long orderId) {
        this.name = name;
        this.surname = surname;
        this.middle_name = middleName;
        this.number = number;
        this.email = email;
        this.orderId = orderId;
    }

    public User() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public long getOrderId() {
        return orderId;
    }
}
