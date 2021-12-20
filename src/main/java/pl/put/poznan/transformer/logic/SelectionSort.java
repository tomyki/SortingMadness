package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public long executionTime;
    public String lista;

    public SelectionSort(String lista, String porzadek, String typ, int iteracje) {
        long millisActualTime = System.currentTimeMillis();
        if (typ.equals("string")) {
            List<String> newText = new ArrayList<String>();
            for (String s : lista.split(",")) {
                newText.add(s);
            }
            String[] sorted = this.sortString(newText, porzadek, iteracje);
            this.lista = Arrays.toString(sorted);
        } else if (typ.equals("int")) {
            List<Integer> newText = new ArrayList<Integer>();
            for (String s : lista.split(",")) {
                newText.add(Integer.parseInt(s));
            }
            int[] sorted = this.sort(newText, porzadek, iteracje);
            this.lista = Arrays.toString(sorted);
        }
        this.executionTime = System.currentTimeMillis() - millisActualTime;
    }


    public int[] sort(List<Integer> arra, String dec, int iteracje) {

        int[] arr = new int[arra.size()];
        for (int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        if(iteracje>0)
        {
            int suma=0;
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                if(suma<iteracje){
                    if(dec.equals("asc")){
                        int min_idx = i;
                        for (int j = i+1; j < n; j++)
                            if (arr[j] < arr[min_idx])
                                min_idx = j;

                        // Swap the found minimum element with the first
                        // element

                        int temp = arr[min_idx];
                        arr[min_idx] = arr[i];
                        arr[i] = temp;
                        suma++;
                    }
                    if(dec.equals("desc")){
                        int min_idx = i;
                        for (int j = i+1; j < n; j++)
                            if (arr[j] > arr[min_idx])
                                min_idx = j;

                        // Swap the found minimum element with the first
                        // element
                        int temp = arr[min_idx];
                        arr[min_idx] = arr[i];
                        arr[i] = temp;
                        suma++;
                    }

                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                if(dec.equals("asc")){
                    int min_idx = i;
                    for (int j = i+1; j < n; j++)
                        if (arr[j] < arr[min_idx])
                            min_idx = j;

                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
                if(dec.equals("desc")){
                    int min_idx = i;
                    for (int j = i+1; j < n; j++)
                        if (arr[j] > arr[min_idx])
                            min_idx = j;

                    // Swap the found minimum element with the first
                    // element
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        return arr;
    }

    public String[] sortString(List<String> arra, String dec, int iteracje) {
        String[] arr = new String[arra.size()];
        for (int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        if(iteracje>0)
        {
            int suma=0;
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                if(suma<iteracje){
                    if(dec.equals("asc")){
                        int min_idx = i;
                        for (int j = i+1; j < n; j++)
                            if (arr[j].compareTo(arr[min_idx])<0)
                                min_idx = j;

                        // Swap the found minimum element with the first
                        // element

                        String temp = arr[min_idx];
                        arr[min_idx] = arr[i];
                        arr[i] = temp;
                        suma++;
                    }
                    if(dec.equals("desc")){
                        int min_idx = i;
                        for (int j = i+1; j < n; j++)
                            if (arr[j].compareTo(arr[min_idx])>0)
                                min_idx = j;

                        // Swap the found minimum element with the first
                        // element
                        String temp = arr[min_idx];
                        arr[min_idx] = arr[i];
                        arr[i] = temp;
                        suma++;
                    }

                }
                else
                {
                    break;
                }
            }
        }
        else
        {
            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                if(dec.equals("asc")){
                    int min_idx = i;
                    for (int j = i+1; j < n; j++)
                        if (arr[j].compareTo(arr[min_idx])<0)
                            min_idx = j;

                    // Swap the found minimum element with the first
                    // element
                    String temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
                if(dec.equals("desc")){
                    int min_idx = i;
                    for (int j = i+1; j < n; j++)
                        if (arr[j].compareTo(arr[min_idx])>0)
                            min_idx = j;

                    // Swap the found minimum element with the first
                    // element
                    String temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        return arr;
    }
}