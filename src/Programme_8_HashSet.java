import java.util.HashSet;

public class Programme_8_HashSet {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        //show which number are between "1 to 10" are in set

        for (int i = 1; i <= 10; i++){
            if(numbers.contains(i)){
                System.out.println("number was found in list : "  +  i); //print statement at positive outcome
            }else{
                System.out.println("Number was not found in list : " + i); // print statement in negative scenario
            }
        }
    }
}
