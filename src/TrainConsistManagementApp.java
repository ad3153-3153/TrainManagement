
import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println("   TRAIN CONSIST MANAGEMENT SYSTEM     ");
        System.out.println("=======================================");
        System.out.println("Welcome to Train Consist Management App!");
        System.out.println();

        // Initialize Train Consist (Dynamic Initialization)
        List<String> trainConsist = new ArrayList<>();

        // Display Initial State
        System.out.println("Initializing train consist...");
        System.out.println("Train consist initialized successfully!");

        // Display Initial Bogie Count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Summary
        System.out.println("\nTrain Consist Summary:");
        System.out.println("No bogies attached yet.");

        System.out.println("\nApplication is ready for further operations...");
    }
}