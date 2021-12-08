package pl.put.poznan.transformer.logic;

import java.util.List;

public class BubbleSort {



    public int[] bubbleSort(List<Integer> arra, String dec)
    {
        int[] arr = new int[arra.size()]; for(int i = 0; i < arra.size(); i++) arr[i] = arra.get(i);
        int n = arr.length;
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
    return arr;
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    /*public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr,"asc");
        System.out.println("Sorted array");
        ob.printArray(arr);
    }*/
}
