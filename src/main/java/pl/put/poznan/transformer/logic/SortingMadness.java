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
        System.out.println(lista);
        System.out.println(parametr);
        System.out.println(typ);
        System.out.println(czyobiekt);
        System.out.println(rodzajsort);
        System.out.println(porzadek);
        System.out.println(liczIteracji);
        // of course, normally it would do something based on the transforms
        /*BubbleSort sortowanie = new BubbleSort();
        List<Integer> newText = new ArrayList<Integer>();
        for (String s : text.split("-")) {       newText.add(Integer.parseInt(s)); }
        int[] dupa = sortowanie.bubbleSort(newText, "asc");

        sortowanie.printArray(dupa);
        text = dupa.toString();*/

        return lista;
    }
}
