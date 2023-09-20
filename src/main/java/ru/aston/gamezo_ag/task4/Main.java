package ru.aston.gamezo_ag.task4;

import ru.aston.gamezo_ag.task4.Dao.OrderDao;
import ru.aston.gamezo_ag.task4.Dao.UserDao;
import ru.aston.gamezo_ag.task4.Entity.Order;
import ru.aston.gamezo_ag.task4.Entity.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Connection connection;

        try {
            connection = Connector.getConnection();
            Statement st = connection.createStatement();

            OrderDao orderDao = new OrderDao();
            orderDao.findEntityById(1);
            System.out.println(orderDao);

            List<Order> list = orderDao.findAll();
            System.out.println(list);

            UserDao userDao = new UserDao();
            userDao.create(new User("wad","awdawd","wadw","awd","wadwda",2));
            System.out.println(userDao);

            connection.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}

