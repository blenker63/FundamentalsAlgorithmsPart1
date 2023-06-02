package com.prosky.fundamentalsalgorithmspart1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringListTest {
    private final StringList stringList = new StringList();

    @BeforeEach
    public void List() {
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
    }

    @Test
    public void addTest() {
        Assertions.assertEquals("e", stringList.add("e"));
    }

    @Test
    public void addExceptionTest() {
        Assertions.assertThrows(EmployeeStoragelsFullException.class, () -> {
            stringList.add("f");
            stringList.add("g");
//            stringList.add("j");
        });
    }

    @Test
    public void addIndexTest() {
        Assertions.assertEquals("n", stringList.add(1, "n"));
    }

    @Test
    public void addIndexExceptionTest() {
        Assertions.assertThrows(EmployeeStoragelsFullException.class, () -> {
            stringList.add(4, "n");
//            stringList.add(1, "n");
        });
    }

    @Test
    public void setTest() {
        Assertions.assertEquals("m", stringList.set(1, "m"));
    }

    @Test
    public void setIndexExceptionTest() {
        Assertions.assertThrows(EmployeeStoragelsFullException.class, () -> {
            stringList.set(4, "m");
//            stringList.add(1, "n");
        });
    }

    @Test
    public void removeTest() {
        Assertions.assertEquals("c", stringList.remove("c"));
    }


}
