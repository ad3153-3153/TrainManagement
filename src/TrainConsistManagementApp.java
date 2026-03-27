
import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Create LinkedList for Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add Bogies (Initial Order)
        System.out.println("\nAdding Bogies...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display Initial Consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        System.out.println("\nInserting Pantry Car at position 2...");
        trainConsist.add(2, "Pantry");

        // Display After Insertion
        System.out.println("\nAfter Inserting Pantry:");
        System.out.println(trainConsist);

        // Remove First and Last Bogie
        System.out.println("\nRemoving First and Last Bogie...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final Consist
        System.out.println("\nFinal Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nProgram continues...");
    }
}