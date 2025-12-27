package Section17_Generics_Set_Map.bounded_generics.services;

import java.util.List;

public class CalculationService {

    // A generic type parameter (T) is used instead of a wildcard because the method needs type consistency and returns T
    public static <T extends Comparable<T>> T max(List<T> list){
        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty!");
        }
        T max = list.get(0);
        for (T item : list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
