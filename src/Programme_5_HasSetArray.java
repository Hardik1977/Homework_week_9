import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */

public class Programme_5_HasSetArray {
    int b[] = new int[5];

    public static void main(String[] args) {
      //Declaration of Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        //Creating an instance of Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
