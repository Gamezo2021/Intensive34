package ru.aston.gamezo_ag.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    private List<String> list = new ArrayList<String>();

    @BeforeEach
    public void creatArrayList(){
        list.add("Javaa");
        list.add("Intensive");
        list.add("Continue");
    }

    @Test
    public void minTest() {
        Assertions.assertEquals(Collections.min(list),"Continue");
    }

    @Test
    public void maxTest() {
        Assertions.assertEquals(Collections.max(list),"Javaa");
    }
}
