package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    public long executionTime;
    public String lista;
    public InsertionSort(String lista, String porzadek, String typ){
        long millisActualTime = System.currentTimeMillis();
        if(typ.equals("string")){
            List<String> newText = new ArrayList<String>();
            for (String s : lista.split("-")) {       newText.add(s); }
            String[] sorted = this.sortString(newText, porzadek);
            this.lista = Arrays.toString(sorted);
        }
        else if(typ.equals("int")){
            List<Integer> newText = new ArrayList<Integer>();
            for (String s : lista.split("-")) {       newText.add(Integer.parseInt(s)); }
            int[] sorted = this.sort(newText, porzadek);
            this.lista = Arrays.toString(sorted);
        }
        this.executionTime = System.currentTimeMillis() - millisActualTime;
    }


    public int[] sort(List<Integer> arra, String dec)
    {
        int[] arr = new int[arra.size()];
        for(int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        int n = arr.length;
        if(dec.equals("asc"))
        {
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
        if(dec.equals("desc"))
        {
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j >= 0 && arr[j] < key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }

        }
        return arr;
    }

    public String[] sortString(List<String> arra,String dec)
    {
        String[] arr = new String[arra.size()];
        for(int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        int n = arr.length;
        if(dec.equals("asc"))
        {
            for (int i = 1; i < n; ++i) {
                String key = arr[i];
                int j = i - 1;

                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j >= 0 && arr[j].compareTo(key)>0) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
        if(dec.equals("desc"))
        {
            for (int i = 1; i < n; ++i) {
                String key = arr[i];
                int j = i - 1;

                /* Move elements of arr[0..i-1], that are
                   greater than key, to one position ahead
                   of their current position */
                while (j >= 0 && arr[j].compareTo(key)<0) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }

        }
        return arr;
    }
}