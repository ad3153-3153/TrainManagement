
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie Class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Original List (from UC7)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        // Display Original List
        System.out.println("\nAll Passenger Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Filter using Stream (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display Filtered List
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        if (filteredBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            for (Bogie b : filteredBogies) {
                System.out.println(b);
            }
        }

        // Verify Original List Unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}
