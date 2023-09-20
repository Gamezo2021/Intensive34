package ru.aston.gamezo_ag.task4.Dao;

import ru.aston.gamezo_ag.task4.Connector;
import ru.aston.gamezo_ag.task4.Entity.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDao implements DaoDataEntityLayer<Order>{
    @Override
    public List<Order> findAll() {
        List<Order> orderList = new ArrayList<>();
        try {
            Connection connection = Connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from orders");
            while (resultSet.next()){
                orderList.add(new Order(resultSet.getLong(1),resultSet.getString(2), resultSet.getDouble(3)));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return orderList;
    }

    @Override
    public Order findEntityById(long id) {
        Order order = new Order();
        try {
            Connection connection = Connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from orders where id =" + id);
            if (resultSet.next()){
            order.setId(resultSet.getLong(1));
            order.setName(resultSet.getString(2));
            order.setAmount(resultSet.getDouble(3));
            return order;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return order;
    }

    @Override
    public boolean delete(long id) {
        boolean isDelete = false;
        try {
            Connection connection = Connector.getConnection();
            PreparedStatement st = connection.prepareStatement("delete from orders where id=?;");
            st.setLong(1, id);
           if (st.executeUpdate() > 0){
               isDelete = true;
           }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return isDelete;
    }

    @Override
    public boolean create(Order order) {
        boolean isCreate = false;
        try {
            Connection connection = Connector.getConnection();
            PreparedStatement st = connection.prepareStatement("insert into orders(name, amount) values (?, ?);");
            st.setString(1, order.getName());
            st.setDouble(2, order.getAmount());
            if (st.executeUpdate() > 0){
                isCreate = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return isCreate;
    }

    @Override
    public Order update(Order order) {
        try{
            Connection connection = Connector.getConnection();
            PreparedStatement st = connection.prepareStatement("update orders set name=?, amount=? where id=?;");
            st.setString(2,order.getName());
            st.setDouble(3,order.getAmount());
            st.setLong(1, order.getId());
            if (st.executeUpdate() > 0){
                return findEntityById(order.getId());
            }
        }catch (SQLException e){
            e.printStackTrace();
            }
        return new Order();
    }
}
