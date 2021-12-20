package pl.put.poznan.transformer.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    public void testIntSortDesc1() {
        InsertionSort testEx1 = new InsertionSort("12,34,123,5435", "desc", "int", 0);
        assertEquals("[5435, 123, 34, 12]", testEx1.lista);
    }
    @Test
    public void testIntSortDesc2() {
        InsertionSort testEx1 = new InsertionSort("12,-34,123,5435,9132,1231,23423,123,12,324,5,235,436,54,62,4,5,325,2346,234,2,12,3", "desc", "int", 0);
        assertEquals("[23423, 9132, 5435, 2346, 1231, 436, 325, 324, 235, 234, 123, 123, 62, 54, 12, 12, 12, 5, 5, 4, 3, 2, -34]", testEx1.lista);
    }
    @Test
    public void testIntSortAsc1() {
        InsertionSort testEx1 = new InsertionSort("12,34,123,5435,-435,12312,53453,4123,13,5432,45,43,51,32,412,-3423424,-231,-2312,31231,-23", "asc", "int", 0);
        assertEquals("[-3423424, -2312, -435, -231, -23, 12, 13, 32, 34, 43, 45, 51, 123, 412, 4123, 5432, 5435, 12312, 31231, 53453]", testEx1.lista);
    }
    @Test
    public void testIntSortAsc2() {
        InsertionSort testEx1 = new InsertionSort("0,0,0,5,0,2,0,-5,-2", "asc", "int", 0);
        assertEquals("[-5, -2, 0, 0, 0, 0, 0, 2, 5]", testEx1.lista);
    }
    @Test
    public void testIntSortWithIterationAsc1() {
        InsertionSort testEx1 = new InsertionSort("5,3,7,8,2,-3,-4,-1,123,123,12,4,324,2,432,4,0,0,0", "asc", "int", 5);
        assertEquals("[-3, 2, 3, 5, 7, 8, -4, -1, 123, 123, 12, 4, 324, 2, 432, 4, 0, 0, 0]", testEx1.lista);
    }
    @Test
    public void testIntSortWithIterationAsc2() {
        InsertionSort testEx1 = new InsertionSort("5,3,7,8,2,9,10,3,4,-4,1,2,-8,-13,-45,2,33", "asc", "int", 14);
        assertEquals("[-45, -13, -8, -4, 1, 2, 2, 3, 3, 4, 5, 7, 8, 9, 10, 2, 33]", testEx1.lista);
    }
    @Test
    public void testStringSortAsc1() {
        InsertionSort testEx1 = new InsertionSort("orzech,lisc,abazur,gabka,pan,kominiarz,w,kominie", "asc", "string", 0);
        assertEquals("[abazur, gabka, kominiarz, kominie, lisc, orzech, pan, w]", testEx1.lista);
    }
    @Test
    public void testStringSortAsc2() {
        InsertionSort testEx1 = new InsertionSort("wojtek,strzelil,wczoraj,gola,druzynie,przeciwnikow,w,ktorej,grali,same,dziewczyny,i,bardzo,sie,z,tego,cieszyl", "asc", "string", 0);
        assertEquals("[bardzo, cieszyl, druzynie, dziewczyny, gola, grali, i, ktorej, przeciwnikow, same, sie, strzelil, tego, w, wczoraj, wojtek, z]", testEx1.lista);
    }
    @Test
    public void testStringSortDesc1() {
        InsertionSort testEx1 = new InsertionSort("na,obiad,mialem,dzisiaj,rosol,i,kotlety,ale,jednego,kotleta,nie,zjadlem,poniewaz,troszke,zle,sie,czuje", "desc", "string", 0);
        assertEquals("[zle, zjadlem, troszke, sie, rosol, poniewaz, obiad, nie, na, mialem, kotlety, kotleta, jednego, i, dzisiaj, czuje, ale]", testEx1.lista);
    }
    @Test
    public void testStringSortDesc2() {
        InsertionSort testEx1 = new InsertionSort("kiedy,konczylem,szkole,po,trzynastej,to,jadlem,obiad,o,ale,powiedzialem,ze,jedno,bedziesz,musial,uzupelnic,zgodnie,z,prawda,hahaha", "desc", "string", 0);
        assertEquals("[zgodnie, ze, z, uzupelnic, trzynastej, to, szkole, prawda, powiedzialem, po, obiad, o, musial, konczylem, kiedy, jedno, jadlem, hahaha, bedziesz, ale]", testEx1.lista);
    }
}