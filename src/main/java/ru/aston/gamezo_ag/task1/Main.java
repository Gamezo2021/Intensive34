package ru.aston.gamezo_ag.task1;

import ru.aston.gamezo_ag.task1.Exception.PriceSettingException;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(22,"Egorov","Slava");
        User user2 = new User(32,"Vladislavov","Vlad");
        User user3 = new User(62,"Panin","Aliaksand");
        User user4 = new User(72,"Prigozhin","Eugene");

        List<Computer> deals = new ArrayList<Computer>();
        try {
            Computer computer = new Buying(Manufacturer.HP,"Elite X2",BigDecimal.valueOf(1),user1);
            Computer computer1 = new Buying(Manufacturer.LENOVO, "Yoga",BigDecimal.valueOf(1000),user2);
            Computer computer2 = new Selling(Manufacturer.LENOVO,"Legion",BigDecimal.valueOf(1000),user3);
            Computer computer3 = new Selling(Manufacturer.ASUS, "Rog",BigDecimal.valueOf(5000),user4);
            deals.add(computer);
            deals.add(computer1);
            deals.add(computer2);
            deals.add(computer3);
        }catch (PriceSettingException e){
            System.out.println(e.toString());
        }

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

