package Section17_Generics_Set_Map.set;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Anna");
        stringSet.add("Joe");
        stringSet.add("Julia");
        stringSet.add("Brenda");

        System.out.println(stringSet.contains("Joe"));

        // HashSet does not maintain insertion order
        for (String s : stringSet){
            System.out.println(s);
        }

        stringSet.remove("Anna");
        stringSet.removeIf(x -> x.length() < 4);
        stringSet.removeIf(x -> x.charAt(0) == 'J');
    }
}
