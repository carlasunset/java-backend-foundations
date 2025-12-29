package Section17_Generics_Set_Map.map;

import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99711122");

        cookies.remove("email");
        cookies.put("phone", "32122357"); //overrides the first "phone" value

        System.out.println("Contains 'username' key: " + cookies.containsKey("username"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email")); //returns null
        System.out.println("Size: " + cookies.size());

        System.out.println("All cookies:");
        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
