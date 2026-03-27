
import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Create HashMap for Bogie -> Capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert Data (Key-Value Mapping)
        System.out.println("\nAdding Bogie Capacity Details...");
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display Mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            String bogie = entry.getKey();
            int capacity = entry.getValue();
            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        System.out.println("\nProgram continues...");
    }
}
