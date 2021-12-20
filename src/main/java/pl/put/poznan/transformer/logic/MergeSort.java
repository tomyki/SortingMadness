package pl.put.poznan.transformer.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    /*Function to sort array using insertion sort*/
    public long executionTime;
    public String lista;
    public static int suma=0;

    public MergeSort(String lista, String porzadek, String typ, int iteracje) {
        long millisActualTime = System.currentTimeMillis();
        if (typ.equals("string")) {
            List<String> newText = new ArrayList<String>();
            for (String s : lista.split(",")) {
                newText.add(s);
            }
            String[] arr = new String[newText.size()];
            for (int i = 0; i < newText.size(); i++) arr[i] = newText.get(i);
            this.suma=0;
            String[] sorted = this.sortString(arr, 0, arr.length - 1, porzadek, iteracje);
            this.lista = Arrays.toString(sorted);
        } else if (typ.equals("int")) {
            List<Integer> newText = new ArrayList<Integer>();
            for (String s : lista.split(",")) {
                newText.add(Integer.parseInt(s));
            }
            int[] arr = new int[newText.size()];
            for (int i = 0; i < newText.size(); i++) arr[i] = newText.get(i);
            this.suma=0;
            int[] sorted = this.sort(arr, 0, arr.length - 1, porzadek, iteracje);
            this.lista = Arrays.toString(sorted);
        }
        this.executionTime = System.currentTimeMillis() - millisActualTime;
    }


    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r, String dec,int iteracje)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if(iteracje<=0)
            {
                if(dec.equals("asc"))
                {
                    if (L[i]<=R[j])
                    {
                        arr[k] = L[i];
                        i++;
                    }
                    else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }
                if(dec.equals("desc"))
                {
                    if (L[i]>R[j]) {
                        arr[k] = L[i];
                        i++;
                    }
                    else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }
            }
            else
            {
                if(suma<iteracje)
                {
                    if(dec.equals("asc"))
                    {
                        if (L[i]<=R[j])
                        {
                            arr[k] = L[i];
                            i++;
                        }
                        else {
                            arr[k] = R[j];
                            j++;
                        }
                        suma++;
                        k++;
                    }
                    if(dec.equals("desc"))
                    {
                        if (L[i]>R[j]) {
                            arr[k] = L[i];
                            i++;
                        }
                        else {
                            arr[k] = R[j];
                            j++;
                        }
                        suma++;
                        k++;
                    }
                }
                else
                {break;}
            }

        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void mergeString(String arr[], int l, int m, int r, String dec,int iteracje)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        String L[] = new String[n1];
        String R[] = new String[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if(iteracje<=0)
            {
                if(dec.equals("asc"))
                {
                    if (L[i].compareTo(R[j])<=0)
                    {
                        arr[k] = L[i];
                        i++;
                    }
                    else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }
                if(dec.equals("desc"))
                {
                    if (L[i].compareTo(R[j])>0) {
                        arr[k] = L[i];
                        i++;
                    }
                    else {
                        arr[k] = R[j];
                        j++;
                    }
                    k++;
                }
            }
            else
            {
                if(suma<iteracje)
                {
                    if(dec.equals("asc"))
                    {
                        if (L[i].compareTo(R[j])<=0)
                        {
                            arr[k] = L[i];
                            i++;
                        }
                        else {
                            arr[k] = R[j];
                            j++;
                        }
                        suma++;
                        k++;
                    }
                    if(dec.equals("desc"))
                    {
                        if (L[i].compareTo(R[j])>0) {
                            arr[k] = L[i];
                            i++;
                        }
                        else {
                            arr[k] = R[j];
                            j++;
                        }
                        suma++;
                        k++;
                    }
                }
                else
                {break;}
            }

        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public int[] sort(int arr[], int l, int r, String dec,int iteracje)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort(arr, l, m,dec,iteracje);
            sort(arr, m + 1, r,dec,iteracje);

            // Merge the sorted halves
            merge(arr, l, m, r,dec,iteracje);
        }
        return arr;
    }

    public String[] sortString(String arr[], int l, int r, String dec,int iteracje)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sortString(arr, l, m,dec,iteracje);
            sortString(arr, m + 1, r,dec,iteracje);

            // Merge the sorted halves
            mergeString(arr, l, m, r,dec,iteracje);
        }
        return arr;
    }
}