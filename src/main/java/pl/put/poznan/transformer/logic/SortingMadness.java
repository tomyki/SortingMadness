package pl.put.poznan.transformer.logic;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

/**
 * This is just an example to show that the logic should be outside the REST service.
 */
public class SortingMadness {

    private final String[] transforms;

    public SortingMadness(String[] transforms){
        this.transforms = transforms;
    }

    public String transform(String lista, String parametr, String typ, String czyobiekt,
                            String rodzajsort, String porzadek, String liczIteracji){
        String wynik ="gluptas";


        if(rodzajsort.equals("s")){
            SelectionSort sortowanie = new SelectionSort(lista, porzadek, typ);
            wynik = sortowanie.lista;
        }
        else if(rodzajsort.equals("b")){
            BubbleSort sortowanie = new BubbleSort(lista, porzadek, typ);
            wynik = sortowanie.lista;
        }
        else if(rodzajsort.equals("m")){
            MergeSort sortowanie = new MergeSort(lista, porzadek, typ);
            wynik = sortowanie.lista;
        }
        else if(rodzajsort.equals("i")){
            InsertionSort sortowanie = new InsertionSort(lista, porzadek, typ);
            wynik = sortowanie.lista;
        }



        System.out.println(wynik);


        return wynik;
    }
}
