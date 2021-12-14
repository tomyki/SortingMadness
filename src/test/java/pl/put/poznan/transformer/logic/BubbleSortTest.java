package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {


    @Test
    public void testIntSort1() {
        BubbleSort testEx1 = new BubbleSort("12-34-123-5435", "desc", "int", 0);
        assertEquals("[5435, 123, 34, 12]", testEx1.lista);
    }
    @Test
    public void testIntSort2() {
        BubbleSort testEx1 = new BubbleSort("12-34-123-5435", "asc", "int", 0);
        assertEquals("[12, 34, 123, 5435]", testEx1.lista);
    }
    @Test
    public void testIntSortWithIteration() {
        BubbleSort testEx1 = new BubbleSort("5-3-7-8-2", "asc", "int", 1);
        assertEquals("[3, 5, 7, 8, 2]", testEx1.lista);
    }
    @Test
    public void testStringSort1() {
        BubbleSort testEx1 = new BubbleSort("orzech-lisc-abazur-gabka", "asc", "string", 0);
        assertEquals("[abazur, gabka, lisc, orzech]", testEx1.lista);
    }
    @Test
    public void testStringSort2() {
        BubbleSort testEx1 = new BubbleSort("orzech-lisc-abazur-gabka", "desc", "string", 0);
        assertEquals("[orzech, lisc, gabka, abazur]", testEx1.lista);
    }

}