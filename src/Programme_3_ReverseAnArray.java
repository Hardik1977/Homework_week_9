/**
 * 3. Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseAnArray {

    public static void main(String[] args) {   //Main method declaration
        //Initialize array
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println("Original order of array  : ");
        for (int i = 0; i <arr.length; i++){   //For loop for increasing value
            System.out.println(arr[i]+"");  // Print statement
        }
        System.out.println();
        System.out.println("Array in reverse order : ");
        //loop through the array in reverse order
        for (int i = arr.length - 1; i>=0; i--){  ////For loop for decreasing value
            System.out.println(arr[i] + " ");
        }
    }

}
