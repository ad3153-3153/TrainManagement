
import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Create LinkedHashSet for Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add Bogies
        System.out.println("\nAttaching Bogies...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate
        System.out.println("\nAttempting to add duplicate bogie 'Sleeper'...");
        trainFormation.add("Sleeper"); // Duplicate (ignored)

        // Display Formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        System.out.println("\nNote: Duplicate bogies are automatically ignored.");

        System.out.println("\nProgram continues...");
    }
}