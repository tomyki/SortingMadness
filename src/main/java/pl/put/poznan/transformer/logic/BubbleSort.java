package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public long executionTime;
    public String lista;

    public BubbleSort(String lista, String porzadek, String typ, int iteracje) {
        long millisActualTime = System.currentTimeMillis();
        if (typ.equals("string")) {
            List<String> newText = new ArrayList<String>();
            for (String s : lista.split("-")) {
                newText.add(s);
            }
            String[] sorted = this.bubbleSortString(newText, porzadek, iteracje);
            this.lista = Arrays.toString(sorted);
        } else if (typ.equals("int")) {
            List<Integer> newText = new ArrayList<Integer>();
            for (String s : lista.split("-")) {
                newText.add(Integer.parseInt(s));
            }
            int[] sorted = this.bubbleSort(newText, porzadek, iteracje);
            this.lista = Arrays.toString(sorted);
        }
        this.executionTime = System.currentTimeMillis() - millisActualTime;
    }

    public int[] bubbleSort(List<Integer> arra, String dec, int iteracje) {
        int[] arr = new int[arra.size()];
        for (int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        int n = arr.length;
        if(iteracje>0){
            int suma=0;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if(suma<iteracje)
                    {
                        if(dec.equals("asc"))
                        {
                            if (arr[j] > arr[j+1])
                            {
                                // swap arr[j+1] and arr[j]
                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        else if(dec.equals("desc"))
                        {
                            if (arr[j] < arr[j+1])
                            {
                                // swap arr[j+1] and arr[j]
                                int temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        suma++;
                    }
                    else
                    {
                        break;
                    }

        }
        else
        {
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if(dec.equals("asc"))
                    {
                        if (arr[j] > arr[j+1])
                        {
                            // swap arr[j+1] and arr[j]
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                    else if(dec.equals("desc"))
                    {
                        if (arr[j] < arr[j+1])
                        {
                            // swap arr[j+1] and arr[j]
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
        }
        return arr;
    }

    public String[] bubbleSortString(List<String> arra, String dec, int iteracje) {
        String[] arr = new String[arra.size()];
        for (int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        if(iteracje>0)
        {
            int suma=0;
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if(suma<iteracje)
                    {
                        if(dec.equals("asc"))
                        {
                            if (arr[j].compareTo(arr[j+1])>0)
                            {
                                // swap arr[j+1] and arr[j]
                                String temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        else if(dec.equals("desc"))
                        {
                            if (arr[j].compareTo(arr[j+1])<0)
                            {
                                // swap arr[j+1] and arr[j]
                                String temp = arr[j];
                                arr[j] = arr[j+1];
                                arr[j+1] = temp;
                            }
                        }
                        suma++;
                    }
                    else
                    {
                        break;
                    }
        }
        else
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if(dec.equals("asc"))
                    {
                        if (arr[j].compareTo(arr[j+1])>0)
                        {
                            // swap arr[j+1] and arr[j]
                            String temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                    else if(dec.equals("desc"))
                    {
                        if (arr[j].compareTo(arr[j+1])<0)
                        {
                            // swap arr[j+1] and arr[j]
                            String temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
        }
        return arr;
    }

}