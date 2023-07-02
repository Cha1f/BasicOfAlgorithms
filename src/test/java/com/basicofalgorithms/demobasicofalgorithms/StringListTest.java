package com.basicofalgorithms.demobasicofalgorithms;

import com.basicofalgorithms.demobasicofalgorithms.stringlist.*;
import com.fasterxml.jackson.databind.type.ClassStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringListTest {

    private StringListImpl list;

    @BeforeEach
    public void setUp() {
        list = new StringListImpl();
    }

    @Test
    void addTest() {
        list.add("ivan");
        assertEquals(1, list.size());
        assertTrue(list.contains("ivan"));
    }

    @Test
    void addForIndexItem() {
        list.add("hi");
        list.add("ivan");
        list.add(1, "boy");
        assertEquals("hi", list.get(0));
        assertEquals("boy", list.get(1));
        assertEquals("ivan", list.get(2));
        assertEquals(3, list.size());
    }

    @Test
    void removeTest() {
        list.add("ivan");
        list.remove("ivan");
        assertTrue(list.isEmpty());
    }

    @Test
    void removeForIndexItem() {
        list.add("ivan");
        list.add("oleg");
        list.remove(0);
        assertEquals("oleg", list.get(0));
        assertEquals(1, list.size());
    }

    @Test
    void setTest() {
        list.add("ivan");
        list.set(0, "oleg");
        assertEquals("oleg", list.get(0));
    }

    @Test
    void indexOfItem() {
        list.add("ivan");
        list.add("petya");
        assertEquals(0, list.indexOf("ivan"));
        assertEquals(1, list.lastIndexOf("petya"));
        assertEquals(-1, list.indexOf("bob"));
    }

    @Test
    void equalsTest() {
        StringList newStringList = new StringListImpl();
        list.add("ivan");
        newStringList.add("ivan");
        assertTrue(list.equals(newStringList));
    }

    @Test
    void clearTest() {
        list.add("hi");
        list.add("ivan");
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    void ItemValueNullExceptionTest() {
        assertThrows(ItemValueNullException.class, () -> list.add(null));
    }

    @Test
    void SizeValueNullExceptionTest() {
        for (int i = 0; i < 5; i++) {
            list.add("ivan" + i);
        }
        assertThrows(SizeValueNullException.class, () -> list.add("petya"));
    }

    @Test
    void IndexValueNullExceptionTest() {
        assertThrows(IndexValueNullException.class, () -> list.add(-1, "ivan"));
    }

    @Test
    void IndexOfItemNotFoundExceptionTest() {
        assertThrows(IndexOfItemNotFoundException.class, () -> list.remove("petya"));
    }
}
