package ru.aston.gamezo_ag.task4.Dao;

import ru.aston.gamezo_ag.task4.Connector;
import ru.aston.gamezo_ag.task4.Entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements DaoDataEntityLayer<User>{
    @Override
    public List findAll() {
        List<User> usersList = new ArrayList<>();
        try {
            Connection connection = Connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                usersList.add(new User(resultSet.getLong(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getLong(7)));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return usersList;
    }

    @Override
    public User findEntityById(long id) {
        User user = new User();
        try {
            Connection connection = Connector.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users where id =" + id);
            if (resultSet.next()){
                user.setId(resultSet.getLong(1));
                user.setName(resultSet.getString(2));
                user.setName(resultSet.getString(3));
                user.setName(resultSet.getString(4));
                user.setName(resultSet.getString(5));
                user.setName(resultSet.getString(6));
                user.setId(resultSet.getLong(7));
                return user;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean delete(long id) {
        boolean isDelete = false;
        try {
            Connection connection = Connector.getConnection();
            PreparedStatement st = connection.prepareStatement("delete from users where id=?;");
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
    public boolean create(User user) {
        boolean isCreate = false;
        try {
            Connection connection = Connector.getConnection();
            PreparedStatement st = connection.prepareStatement("insert into users(name, surname, middle_name, number, email, order_id) values (?, ?, ?, ?, ?, ?);");
            st.setString(1, user.getName());
            st.setString(2, user.getSurname());
            st.setString(3, user.getMiddle_name());
            st.setString(4, user.getNumber());
            st.setString(5, user.getEmail());
            st.setLong(6, user.getOrderId());
            if (st.executeUpdate() > 0){
                isCreate = true;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return isCreate;
    }

    @Override
    public User update(User user) {
        try{
            Connection connection = Connector.getConnection();
            PreparedStatement st = connection.prepareStatement("update users set number=?, email=? where id=?;");
            st.setString(2,user.getNumber());
            st.setString(3,user.getEmail());
            st.setLong(1, user.getId());
            if (st.executeUpdate() > 0){
                return findEntityById(user.getId());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return new User();
    }
}
