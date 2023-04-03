import java.util.ArrayList;

public class Programme_11_TwoArrayListAndCompare {
    public static void main(String[] args) {

        //Create an object
        Programme_11_TwoArrayListAndCompare obj = new Programme_11_TwoArrayListAndCompare();
        obj.method();  // Instance method calling

    }

    public void method() {                       //Method declaration
        ArrayList<String> c1 = new ArrayList<>(); // second array defining
        c1.add("Red");
        c1.add("Green");
        c1.add("Balck");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)) {
            System.out.println("cq and c2 are equal ");
        } else {
            System.out.println("cq and c2 are not equal ");
        }

    }

}
