import java.util.HashMap;

public class Programme_9_HashMapStringKeysAndInteger {
    public static void main(String[] args) {   // Main method
        //Create a Hashmap object called  people's name ana age
        HashMap<String, Integer> people = new HashMap<>();  // Key and value storing statement
        people.put("Tony", 17);
        people.put("David", 20);
        people.put("Terisa", 32);
        people.put("Tresy", 44);
        people.put("Jhon", 55);
        people.put("Graham", 57);
        for (String i : people.keySet()) {
            System.out.println("Key : " + i + " value : " + people.get(i));  // Print statement
        }
    }
}
