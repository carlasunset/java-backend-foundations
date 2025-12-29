package Section17_Generics_Set_Map.set.resolved_exercise.application;

import Section17_Generics_Set_Map.set.resolved_exercise.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = bufferedReader.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                set.add(new LogEntry(username, moment));
                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + set.size());
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
