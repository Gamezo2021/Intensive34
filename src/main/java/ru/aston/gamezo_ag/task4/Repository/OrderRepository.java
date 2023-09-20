package ru.aston.gamezo_ag.task4.Repository;

import ru.aston.gamezo_ag.task4.Dao.OrderDao;
import ru.aston.gamezo_ag.task4.Dao.UserDao;
import ru.aston.gamezo_ag.task4.Entity.Order;
import ru.aston.gamezo_ag.task4.Entity.User;

import java.util.List;

public class OrderRepository {
    private final OrderDao orderDao;

    public OrderRepository(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public List<Order> findAll(){
        return orderDao.findAll();
    }

    public Order findById(long id){
        return orderDao.findEntityById(id);
    }

    public boolean delete(long id){
        return orderDao.delete(id);
    }

    public boolean create(Order order){
        return orderDao.create(order);
    }

    public Order update(Order order){
        return orderDao.update(order);
    }
}
