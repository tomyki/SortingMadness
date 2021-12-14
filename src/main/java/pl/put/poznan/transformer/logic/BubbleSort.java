package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Klasa reprezentująca algorytm sortowania bąbelkowego
 */
public class BubbleSort {
    /**
     * Zmienna typu long, ktora bedzie przechowywac czas wykonania sortowania
     */
    public long executionTime;
    /**
     * Zmienna typu String, ktora bedzie przechowywac posortowana liste
     */
    public String lista;

    /**
     * Konstruktor, który dla podanych argumentow przydziela do zmiennej lista posrtowana juz liste oraz liczy czas wykonania i przydziela go do zmiennej executionTime
     * @param lista lista elementow do posortowania
     * @param porzadek jezeli "asc" to sortujemy rosnaco, jeżeli "desc" to malejaco
     * @param typ typ danych w liscie
     * @param iteracje liczba iteracji, po których następuje wymuszenie zakończenia działania algorytmu sortującego (dla {@literal <=0} działa do końca)
     */
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

    /**
     * Funkcja sortująca tablice liczb za pomocą algorytmu sortowania bąbelkowego
     * @param arra lista elementów wejściowych
     * @param dec porządek sortowania("asc"/"desc")
     * @param iteracje liczba iteracji, po których następuje wymuszenie zakończenia działania algorytmu sortującego (dla {@literal <=0} działa do końca)
     * @return posortowana lista typu int
     */
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
    /**
     * Funkcja sortująca tablice łańcuchów znaków za pomocą algorytmu sortowania bąbelkowego
     * @param arra lista elementów wejściowych
     * @param dec porządek sortowania("asc"/"desc")
     * @param iteracje liczba iteracji, po których następuje wymuszenie zakończenia działania algorytmu sortującego (dla {@literal <=0} działa do końca)
     * @return posortowana lista typu String
     */
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