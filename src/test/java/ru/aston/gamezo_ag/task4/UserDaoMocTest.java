package ru.aston.gamezo_ag.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import ru.aston.gamezo_ag.task4.Dao.OrderDao;
import ru.aston.gamezo_ag.task4.Dao.UserDao;
import ru.aston.gamezo_ag.task4.Entity.Order;
import ru.aston.gamezo_ag.task4.Entity.User;
import ru.aston.gamezo_ag.task4.Repository.OrderRepository;
import ru.aston.gamezo_ag.task4.Repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserDaoMocTest {

    @InjectMocks
    private UserRepository userRepository;

    @Mock
    private UserDao userDao;


    @BeforeEach
    void initEach() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void findAll(){
        List<User> usersList = new ArrayList<>();

        usersList.add(new User("123", "buy" ,"awdawd","wadawd","wdawd", 2));
        usersList.add(new User("1233", "sell" ,"awdawd","wadawd","wdawd", 2));

        Mockito.when(userDao.findAll()).thenReturn(usersList);
        Assertions.assertEquals(2,userRepository.findAll().size());
    }

    @Test
    void findById(){
        User user = new User("123", "buy" ,"awdawd","wadawd","wdawd", 2);
        Mockito.when(userDao.findEntityById(user.getId())).thenReturn(user);
        Assertions.assertEquals(userRepository.findById(user.getId()).getName(), "123");
    }

    @Test
    void delete(){
        Mockito.when(userDao.delete(1)).thenReturn(true);
        Assertions.assertTrue(userRepository.delete(1));
    }

    @Test
    void creatre(){
        User user = new User("123", "buy" ,"awdawd","wadawd","wdawd", 2);
        Mockito.when(userDao.create(user)).thenReturn(true);
        Assertions.assertTrue(userRepository.create(user));
    }

    @Test
    void update(){
        User user1 = new User("123", "buy" ,"awdawd","wadawd","wdawd", 2);
        User user2 = new User("12333", "buy" ,"awdawd","wadawd","wdawd", 2);
        Mockito.when(userDao.update(user1)).thenReturn(user2);
        Assertions.assertEquals(userRepository.update(user1).getName(),user2.getName());
    }
}
