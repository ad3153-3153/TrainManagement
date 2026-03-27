
import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add Bogies (CREATE)
        System.out.println("\nAdding Passenger Bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display Bogies (READ)
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a Bogie (DELETE)
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        // Check existence (SEARCH)
        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        // Final State
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nProgram continues...");
    }
}