package ru.aston.gamezo_ag.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HashMapTest {

    private HashMap<Integer,String> hashMap = new HashMap<Integer, String>();

    @BeforeEach
    public void creatHashMap(){
        hashMap = new HashMap<Integer,String>();
        hashMap.put(1,"Java");
        hashMap.put(2,"Intensive");
        hashMap.put(3,"Continues");
    }
    @Test
    public void containsKeyTest(){
        Assertions.assertEquals(hashMap.containsKey(1),true);
    }

    @Test
    public void containsValueTest(){
        Assertions.assertEquals(hashMap.containsValue("Java"), true);
    }
}
