package pl.put.poznan.transformer.logic;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] transforms;

    public SortingMadness(String[] transforms) {
        this.transforms = transforms;
    }

    public int findBest(long[] times) {
        int index = 0;
        long min = 999999999;
        for (int j = 0; j < times.length; j++) {
            if (times[j] < min) {
                min = times[j];
                index = j;
            }
        }
        return index;
    }


    public String transform(String lista, String parametr, String typ, String czyobiekt,
                            String rodzajsort, String porzadek, String liczIteracji) {
        String wynik = "gluptas";
        long czas = 999999;


        switch (rodzajsort) {
            case "s": {
                SelectionSort sortowanie = new SelectionSort(lista, porzadek, typ);
                wynik = sortowanie.lista;
                System.out.println("SelectionSort z czasem: "+sortowanie.executionTime);
                break;
            }
            case "b": {
                BubbleSort sortowanie = new BubbleSort(lista, porzadek, typ);
                wynik = sortowanie.lista;
                czas = sortowanie.executionTime;
                System.out.println("BubbleSort z czasem: "+sortowanie.executionTime);
                break;
            }
            case "m": {
                MergeSort sortowanie = new MergeSort(lista, porzadek, typ);
                wynik = sortowanie.lista;
                czas = sortowanie.executionTime;
                System.out.println("MergeSort z czasem: "+sortowanie.executionTime);
                break;
            }
            case "i": {
                InsertionSort sortowanie = new InsertionSort(lista, porzadek, typ);
                wynik = sortowanie.lista;
                czas = sortowanie.executionTime;
                System.out.println("InsertionSort z czasem: "+sortowanie.executionTime);
                break;
            }
            case "a": {
                SelectionSort sortowanieS = new SelectionSort(lista, porzadek, typ);
                BubbleSort sortowanieB = new BubbleSort(lista, porzadek, typ);
                MergeSort sortowanieM = new MergeSort(lista, porzadek, typ);
                InsertionSort sortowanieI = new InsertionSort(lista, porzadek, typ);
                long[] timesOfSortings = new long[]{sortowanieS.executionTime, sortowanieB.executionTime, sortowanieM.executionTime, sortowanieI.executionTime};
                switch (findBest(timesOfSortings)) {
                    case 0: {
                        wynik = sortowanieS.lista;
                        System.out.println("SelectionSort z czasem: "+sortowanieS.executionTime+"ms");
                        break;
                    }
                    case 1: {
                        wynik = sortowanieB.lista;
                        System.out.println("BubbleSort z czasem: "+sortowanieB.executionTime+"ms");
                        break;
                    }
                    case 2: {
                        wynik = sortowanieM.lista;
                        System.out.println("MergeSort z czasem: "+sortowanieM.executionTime+"ms");
                        break;
                    }
                    case 3: {
                        wynik = sortowanieI.lista;
                        System.out.println("InsertionSort z czasem: "+sortowanieI.executionTime+"ms");
                        break;
                    }
                }
            }
            break;
        }

        System.out.println(wynik);



        return wynik;
    }
}
