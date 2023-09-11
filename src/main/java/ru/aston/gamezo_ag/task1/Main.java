package ru.aston.gamezo_ag.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(22,"Egorov","Slava");
        User user2 = new User(32,"Vladislavov","Vlad");
        User user3 = new User(62,"Panin","Aliaksand");
        User user4 = new User(72,"Prigozhin","Eugene");


        Computer computer = new Buying(Manufacturer.HP,"Elite X2",BigDecimal.valueOf(2222),user1);
        Computer computer1 = new Buying(Manufacturer.LENOVO, "Yoga",BigDecimal.valueOf(1000),user2);
        Computer computer2 = new Selling(Manufacturer.LENOVO,"Legion",BigDecimal.valueOf(1000),user3);
        Computer computer3 = new Selling(Manufacturer.ASUS, "Rog",BigDecimal.valueOf(5000),user4);

        List<Computer> deals = new ArrayList<Computer>();
        deals.add(computer);
        deals.add(computer1);
        deals.add(computer2);
        deals.add(computer3);

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

