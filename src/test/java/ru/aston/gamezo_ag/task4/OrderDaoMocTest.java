package ru.aston.gamezo_ag.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.base.MockitoException;

import ru.aston.gamezo_ag.task4.Dao.OrderDao;
import ru.aston.gamezo_ag.task4.Repository.OrderRepository;
import ru.aston.gamezo_ag.task4.Entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDaoMocTest {

    @InjectMocks
    private OrderRepository orderRepository;

    @Mock
    private OrderDao orderDao;


    @BeforeEach
    void initEach() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void findAll(){
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(1, "buy" , 200));
        orderList.add(new Order(2 , "sell", 300));

        Mockito.when(orderDao.findAll()).thenReturn(orderList);
        Assertions.assertEquals(2,orderRepository.findAll().size());
    }

    @Test
    void findById(){
        Order order = new Order(1,"buy",200);
        Mockito.when(orderDao.findEntityById(order.getId())).thenReturn(order);
        Assertions.assertEquals(orderRepository.findById(order.getId()).getName(), "buy");
    }

    @Test
    void delete(){
        Mockito.when(orderDao.delete(1)).thenReturn(true);
        Assertions.assertTrue(orderRepository.delete(1));
    }

    @Test
    void creatre(){
        Order order = new Order(3,"thirdOrder",300);
        Mockito.when(orderDao.create(order)).thenReturn(true);
        Assertions.assertTrue(orderRepository.create(order));
    }

    @Test
    void update(){
        Order order1 = new Order(1,"buy",200);
        Order order2 = new Order(2,"sell",300);
        Mockito.when(orderDao.update(order1)).thenReturn(order2);
        Assertions.assertEquals(orderRepository.update(order1).getName(),order2.getName());
    }
}
