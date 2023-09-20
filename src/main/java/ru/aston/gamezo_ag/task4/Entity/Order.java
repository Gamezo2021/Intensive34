package ru.aston.gamezo_ag.task4.Entity;

public class Order {
    private long id;
    private String name;
    private double amount;

    public Order(long id, String name, double amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    public Order() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return "Order{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
