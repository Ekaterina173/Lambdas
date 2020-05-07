package com.step;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    
    static ArrayList<Auto> autos = new ArrayList<>();
    
    public static void main(String[] args){
    
//a. adăugați o listă de mașini  

        autos.add(new Auto("Dacia", "Sandero", 2010, 2100, "benzina"));
        autos.add(new Auto("Skoda", "Yeti", 2020, 1900, "benzina"));
        autos.add(new Auto("Volkswagen", "Polo", 2009, 1200, "benzina"));
        autos.add(new Auto("Ford", "Ranger", 2007, 1500, "benzina"));
        autos.add(new Auto("Jeep", "Grand Cherokee", 2015, 2600, "diesel"));
        autos.add(new Auto("Land Rover", "Defender", 2008, 1000, "diesel"));
                
        System.out.println(autos.toString()); 

//b. sortați și păstrați rezultatul într-o listă separată
//   alfabetic după numele modelului
        
        Collections.sort(autos, new ModelComparator());       
        List<String> models = autos.stream()
                .map(auto -> auto.getModel())
                .collect(Collectors.toList());
        System.out.println(models);
        
//c.1 filtrați și păstrați în colecții diferite:
//    toate mașinile cu motor> 1500 cm3
  
        List<Auto> autosWithMotorCapacityMoreThan1300 = autos
                .stream()
                .filter((Auto auto) ->{ return auto.getMotorCapacity() > 1500;})
                .collect(Collectors.toList());
        System.out.println(autosWithMotorCapacityMoreThan1300);
 //OPTIONAL
        /*autos.stream()
                .filter((Auto auto) ->{ return auto.getMotorCapacity() > 1500;})
                .forEach((x) -> System.out.println(x));
        */ 

//c.2 filtrați și păstrați în colecții diferite:
//    toate mașinile vechi de 10 ani        
        List<Auto> autosOlderThan10Years = autos
                .stream()
                .filter((Auto auto) ->{ return auto.getAn() < 2010;})
                .collect(Collectors.toList());
        System.out.println(autosOlderThan10Years);
       

//d. Salvați într-o colecție separată mașinile, după tipul de combustibil

        List<String> uniqueTypes = autos.stream()
                .map(auto -> auto.getTip())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueTypes);
                          
    }
    
}
