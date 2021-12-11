package pl.put.poznan.transformer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.transformer.logic.SortingMadness;

import java.util.Arrays;


@RestController
@RequestMapping("/{lista}/{parametr}/{typ}/{czyobiekt}/{rodzajsort}/{porzadek}/{liczIteracji}")
//lista/(po ktorym parametrze)/typ/czy obiekt/rodzaj sortowania(i czy automatycznie)/rosnaco czy malejaco/liczba iteracji(bez to <=0>)
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String lista, @PathVariable String parametr, @PathVariable String typ, @PathVariable String czyobiekt,
                      @PathVariable String rodzajsort, @PathVariable String porzadek, @PathVariable String liczIteracji,
                      @RequestParam(value = "transforms", defaultValue = "upper,escape") String[] transforms) {

        // log the parameters
        logger.debug(lista);
        logger.debug(parametr);
        logger.debug(typ);
        logger.debug(czyobiekt);
        logger.debug(rodzajsort);
        logger.debug(liczIteracji);
        logger.debug(porzadek);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
        SortingMadness transformer = new SortingMadness(transforms);
        return transformer.transform(lista, parametr, typ, czyobiekt,
                rodzajsort, porzadek, liczIteracji);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String lista, @PathVariable String parametr, @PathVariable String typ, @PathVariable String czyobiekt,
                       @PathVariable String rodzajsort, @PathVariable String porzadek, @PathVariable String liczIteracji,
                       @RequestBody String[] transforms) {

        // log the parameters
        logger.debug(lista);
        logger.debug(parametr);
        logger.debug(typ);
        logger.debug(czyobiekt);
        logger.debug(rodzajsort);
        logger.debug(liczIteracji);
        logger.debug(porzadek);
        logger.debug(Arrays.toString(transforms));

        // perform the transformation, you should run your logic here, below is just a silly example
        SortingMadness transformer = new SortingMadness(transforms);
        return transformer.transform(lista, parametr, typ, czyobiekt,
                rodzajsort, porzadek, liczIteracji);
    }


}


