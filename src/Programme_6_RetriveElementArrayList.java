import java.util.ArrayList;

/**
 * 6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */


public class Programme_6_RetriveElementArrayList {

    public static void main(String[] args) {

        //Create list of 5 elements of earth

        ArrayList<String> list_String = new ArrayList<>();
        list_String.add("Water");
        list_String.add("Air");
        list_String.add("Fire");
        list_String.add("Sky");
        list_String.add("Earth");
        //Print the list and statement
        System.out.println(list_String);
        // option of retrieval - First and Third elements
        String element = list_String.get(0);
        System.out.println("First Element : " + element);
        element = list_String.get(3);
        System.out.println("Third element : " + element);
    }
}
