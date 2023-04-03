import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not
 */
public class Programme_7_EmptyRemovingValue {
    public static void main(String[] args) {
        ArrayList<String> tubeList = new ArrayList<String>();
        tubeList.add("Kingsury");
        tubeList.add("Dollis Hill");
        tubeList.add("West Hampstead");
        tubeList.add("Cannons Park");
        tubeList.add("Stanmore");
        for (String tubename : tubeList) {
            System.out.println(" Tubename  :  " + tubeList);
        }
        System.out.println("Checking above Array list is empty or not : " + tubeList.isEmpty());  //print statement
        tubeList.removeAll(tubeList);
        System.out.println("Array list after remove all elements  : " + tubeList.isEmpty()); // print statement

    }

}
