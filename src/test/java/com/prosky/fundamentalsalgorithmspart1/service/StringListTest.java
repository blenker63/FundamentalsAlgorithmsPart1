package com.prosky.fundamentalsalgorithmspart1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringListTest {
    private final StringList stringList = new StringList();

    @BeforeEach
    public void List() {
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
//        stringList.add("d");
    }

    @Test
    public void addTest() {
        Assertions.assertEquals("e", stringList.add("e"));
    }

    @Test
    public void addExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            stringList.add("f");
            stringList.add("g");
            stringList.add("j");
        });
    }

    @Test
    public void addIndexTest() {
        assertEquals("n", stringList.add(1, "n"));
    }

    @Test
    public void addIndexExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            stringList.add(4, "n");
//            stringList.add(1, "n");
        });
    }

    @Test
    public void setTest() {
        assertEquals("m", stringList.set(1, "m"));
    }

    @Test
    public void setIndexExceptionTest() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            stringList.set(4, "m");
//            stringList.add(1, "n");
        });
    }

    @Test
    public void removeTest() {
        assertEquals("b", stringList.remove("b"));
//        Assertions.assertEquals(null, stringList.remove("b"));
    }
//    @Test
//    public void removeNullTest() {
//        Assertions.assertEquals("b", stringList.remove("b"));
//    }


    @Test
    public void removeIndexTest() {
        assertEquals("b", stringList.remove(1));
    }

    @Test
    public void removeIndexExceptionTest() {
        assertThrows(ElementMissingException.class, () -> {
            stringList.remove(4);
        });
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            stringList.remove(5);
        });
    }

    @Test
    public void indexOfTest() {
        assertEquals(-1, stringList.indexOf("v"));
        assertEquals(0, stringList.indexOf("a"));
    }
    @Test
    public void LastIndexOfTest() {
        assertEquals(-1, stringList.indexOf("v"));
//        Assertions.assertEquals(1, stringList.indexOf("b"));
    }

    @Test
    public void getTest() {
        assertEquals("b", stringList.get(1));
        assertEquals(null, stringList.get(4));
    }
    @Test
    public void getTestException() {
        assertThrows(ArrayIndexOutBondsException.class, () -> {
            stringList.get(6);
        });
    }

    @Test
    public void sizeTest() {
        assertEquals(3, stringList.size());
    }

    @Test
    public void clear() {
        Assertions.assertNull(stringList.clear());
    }


    @Test
    public void isEmptyTest() {
        Assertions.assertFalse(stringList.isEmpty());

    }

}
