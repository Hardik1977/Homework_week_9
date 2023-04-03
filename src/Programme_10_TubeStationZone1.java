import java.util.HashMap;
import java.util.Scanner;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */


public class Programme_10_TubeStationZone1 {

    public static void main(String[] args) {

        //London Zone 1 station list
        char result;
        System.out.println("London Zone 1 Stations : ");
        System.out.println("Bond Street, Covent Garden, Edgware Road, Green Park, Holborn District, Kensington, London Bridge, Oxford Cercus, Paddington, Westminister");
        HashMap<String, String> zone = new HashMap<>();
        zone.put("Bond Street", "Jubilee");
        zone.put("Edgware Road", "Piccadily");
        zone.put("Geen Park", "Piccadily, Victoria");
        zone.put("Covent Garden", "Piccadily");
        zone.put("Victoria", "Circle, Circle, District");
        zone.put("Westminister", "Circle, District");
        zone.put("Kensigton", "Circle and District");
        zone.put("Leicester Square", "Piccadily");
        zone.put("Oxford Circus", "Bakerloo, Central");
        zone.put("Bond Street", "Jubilee");
        // Do while loop if user will continue

        do {
         //scanner declaration for user
            Scanner scanner = new Scanner(System.in);   // Scanner calling
            System.out.println("Enter station name from above list  : ");
            // user inputs are required and stores
            String stationName = scanner.nextLine();
            // for each loop to find lines for the station
            for (String str : zone.keySet()) {                  // For loop defining
                if (stationName.equalsIgnoreCase(str)) {
                    System.out.println("Tube Lines ; " + zone.get(str));
                }
            }
            System.out.println("");
            System.out.println("Do you want to check again? Y or N : ");
            result = scanner.next().charAt(0);
        }
        while (result == 'Y' || result == 'y') ;

    }

}
