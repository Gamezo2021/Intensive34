package ru.aston.gamezo_ag.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.aston.gamezo_ag.task1.Exception.PriceSettingException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderTest {

    private Order orderList;


    @BeforeEach
    public void CreatOrderTest()throws PriceSettingException {
        User user1 = new User(22,"Egorov","Slava");
        User user2 = new User(32,"Vladislavov","Vlad");
        User user3 = new User(62,"Panin","Aliaksand");
        User user4 = new User(72,"Prigozhin","Eugene");

        List<Computer> deals = new ArrayList<Computer>();
        Computer computer = new Buying(Manufacturer.HP,"Elite X2", BigDecimal.valueOf(1),user1);
        Computer computer1 = new Buying(Manufacturer.LENOVO, "Yoga",BigDecimal.valueOf(1000),user2);
        Computer computer2 = new Selling(Manufacturer.LENOVO,"Legion",BigDecimal.valueOf(1000),user3);
        Computer computer3 = new Selling(Manufacturer.ASUS, "Rog",BigDecimal.valueOf(5000),user4);
        deals.add(computer);
        deals.add(computer1);
        deals.add(computer2);
        deals.add(computer3);

        orderList = new Order(deals);
    }

    @Test
    public void sumAllOrdersTest(){
        Assertions.assertEquals(new BigDecimal(7001), orderList.sumAllOrders());
    }

    @Test
    public void sortOrderListBySurnameTest(){
        Assertions.assertEquals(orderList.sortOrderListBySurname().get(0).getUser().getSourName(),"Egorov");
    }

    @Test
    public void priceSettingExceptionTest(){
        Assertions.assertThrows(PriceSettingException.class,() ->{
            User user1 = new User(22,"Egorov","Slava");
            Buying buying = new Buying(Manufacturer.ASUS, "AWD", BigDecimal.valueOf(0), user1);
        });
    }
}
