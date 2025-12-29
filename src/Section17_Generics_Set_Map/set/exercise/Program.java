package Section17_Generics_Set_Map.set.exercise;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Integer> courseA = new HashSet<>();
        Set<Integer> courseB = new HashSet<>();
        Set<Integer> courseC = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = scanner.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.print("Type the #" + i + " student code: ");
            int studentCode = scanner.nextInt();
            courseA.add(studentCode);
        }

        System.out.print("How many students for course B? ");
        n = scanner.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.print("Type the student " + i + " code: ");
            int studentCode = scanner.nextInt();
            courseB.add(studentCode);
        }

        System.out.print("How many students for course C? ");
        n = scanner.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.print("Type the #" + i + " student code: ");
            int studentCode = scanner.nextInt();
            courseC.add(studentCode);
        }

        Set<Integer> totalStudents = new HashSet<>(courseA);
        totalStudents.addAll(courseB);
        totalStudents.addAll(courseC);

        System.out.println("Total students: " + totalStudents.size());

        scanner.close();
    }
}