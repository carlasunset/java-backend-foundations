package Section17_Generics_Set_Map.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SecondDemo {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("Arrays a and b united");
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println("Keep all the elements in common between arrays a and b");
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println("Keep all the elements present only in the array a");
        System.out.println(e);
    }
}
