import java.util.ArrayList;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop
 */


public class Programme_4_ArrayListColour {

    int a[] = new int[5];

    public static void main(String[] args) {
        ArrayList<String>lsit_String = new ArrayList<String>();
        lsit_String.add("Red");
        lsit_String.add("Orange");
        lsit_String.add("Yellow");
        lsit_String.add("Magenta");
        lsit_String.add("Purpul");
        System.out.println(lsit_String);
    }

}
