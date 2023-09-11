package ru.aston.gamezo_ag.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TreeSetTest {

    private TreeSet<String> treeSet = new TreeSet<String>();

    @BeforeEach
    public void creatTreeSet(){
        treeSet.add("Java");
        treeSet.add("Intensive");
        treeSet.add("Continues");
    }

    @Test
    public void firstTest(){
        Assertions.assertEquals(treeSet.first(), "Continues");
    }

    @Test
    public void lastTest(){
        Assertions.assertEquals(treeSet.last(),"Java");
    }

    @Test
    public void sizeTest() {
        Assertions.assertEquals(treeSet.size(), 3);
    }

}
