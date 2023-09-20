package ru.aston.gamezo_ag.task4.Repository;

import ru.aston.gamezo_ag.task4.Dao.UserDao;
import ru.aston.gamezo_ag.task4.Entity.User;

import java.util.List;

public class UserRepository {

    private final UserDao userDao;

    public UserRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll(){
        return userDao.findAll();
    }

    public User findById(long id){
        return userDao.findEntityById(id);
    }

    public boolean delete(long id){
        return userDao.delete(id);
    }

    public boolean create(User user){
        return userDao.create(user);
    }

    public User update(User user){
        return userDao.update(user);
    }

}
