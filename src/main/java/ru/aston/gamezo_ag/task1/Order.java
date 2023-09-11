package ru.aston.gamezo_ag.task1;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

public class Order {

    private List<Computer> orderList;

    public Order(List<Computer> orderList) {
        this.orderList = orderList;
    }

    public BigDecimal sumAllOrders() {
        BigDecimal sumAllOrders = new BigDecimal("0");

        for(Computer computer:orderList) {
            sumAllOrders = sumAllOrders.add(computer.getPrice());
        }
        return sumAllOrders;
    }

    public List<Computer> sortOrderListBySurname(){
        orderList.sort(Comparator.comparing(computer -> computer.getUser().getSourName()));
        return orderList;
    }
}
