package ru.aston.gamezo_ag.task1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(22,"Egorov","Slava");
        User user2 = new User(32,"Vladislavov","Vlad");
        User user3 = new User(62,"Panin","Aliaksand");
        User user4 = new User(72,"Prigozhin","Eugene");


        System.out.println(deals.get(1).getDiscount());
        System.out.println(deals.get(2).getDiscount());

        System.out.println(deals);

        Order orderList = new Order(deals);
        System.out.println("Sum all orders:  " + orderList.sumAllOrders());

        for(Computer t:orderList.sortOrderListBySurname()) {
            System.out.println(t.toString());
        }
    }
}

