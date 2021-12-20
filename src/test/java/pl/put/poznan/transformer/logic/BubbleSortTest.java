package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @Test
    public void testIntSortDesc1() {
        BubbleSort testEx1 = new BubbleSort("12,34,123,5435", "desc", "int", 0);
        assertEquals("[5435, 123, 34, 12]", testEx1.lista);
    }
    @Test
    public void testIntSortDesc2() {
        BubbleSort testEx1 = new BubbleSort("12,-34,123,5435,9132,1231,23423,123,12,324,5,235,436,54,62,4,5,325,2346,234,2,12,3", "desc", "int", 0);
        assertEquals("[23423, 9132, 5435, 2346, 1231, 436, 325, 324, 235, 234, 123, 123, 62, 54, 12, 12, 12, 5, 5, 4, 3, 2, -34]", testEx1.lista);
    }
    @Test
    public void testIntSort2() {
        BubbleSort testEx1 = new BubbleSort("12,34,123,5435", "asc", "int", 0);
        assertEquals("[12, 34, 123, 5435]", testEx1.lista);
    }
    @Test
    public void testIntSortWithIteration() {
        BubbleSort testEx1 = new BubbleSort("5,3,7,8,2", "asc", "int", 1);
        assertEquals("[3, 5, 7, 8, 2]", testEx1.lista);
    }
    @Test
    public void testIntSortWithIteration2() {
        BubbleSort testEx1 = new BubbleSort("5,3,7,8,2,9,10,3,4", "asc", "int", 4);
        assertEquals("[3, 5, 7, 2, 8, 9, 10, 3, 4]", testEx1.lista);
    }
    @Test
    public void testStringSort1() {
        BubbleSort testEx1 = new BubbleSort("orzech,lisc,abazur,gabka", "asc", "string", 0);
        assertEquals("[abazur, gabka, lisc, orzech]", testEx1.lista);
    }
    @Test
    public void testStringSort2() {
        BubbleSort testEx1 = new BubbleSort("orzech,lisc,abazur,gabka", "desc", "string", 0);
        assertEquals("[orzech, lisc, gabka, abazur]", testEx1.lista);
    }

}