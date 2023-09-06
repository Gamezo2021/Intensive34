package ru.aston.gamezo_ag.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    private List<String> arrayList;


    @BeforeEach
    public void creatList(){
        arrayList = new ArrayList<String>();
        arrayList.add("Java");
        arrayList.add("Intensive");
        arrayList.add("Continues");
    }
    @Test
    public void indexOfTest(){
        Assertions.assertEquals(arrayList.indexOf("Java"), 0);

    }

    @Test
    public void containsAllTest(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Intensive");
        list.add("Continues");
        Assertions.assertEquals(arrayList.containsAll(list), true);

    }
    @Test
    public void isEmpty(){
        Assertions.assertEquals(arrayList.isEmpty(),false);
    }


}
