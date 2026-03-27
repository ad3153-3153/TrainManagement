
import java.util.ArrayList;
import java.util.List;

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
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Create Bogie List
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));

        // Display Bogies
        System.out.println("\nBogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // UC10: Calculate Total Seating Capacity using Stream
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum);  // sum all values

        // Display Result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // Verify Original List Unchanged
        System.out.println("\nOriginal List After Calculation:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}