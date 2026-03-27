
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
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" PERFORMANCE COMPARISON (LOOP vs STREAM)");
        System.out.println("=======================================");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            if (i % 3 == 0)
                bogies.add(new Bogie("Sleeper", 72));
            else if (i % 3 == 1)
                bogies.add(new Bogie("AC Chair", 60));
            else
                bogies.add(new Bogie("First Class", 24));
        }

        // ---------------- LOOP APPROACH ----------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---------------- STREAM APPROACH ----------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // ---------------- RESULTS ----------------
        System.out.println("\nFiltered Bogies Count (capacity > 60):");
        System.out.println("Loop Result Size   : " + loopResult.size());
        System.out.println("Stream Result Size : " + streamResult.size());

        System.out.println("\nExecution Time:");
        System.out.println("Loop Time   : " + loopTime + " ns");
        System.out.println("Stream Time : " + streamTime + " ns");

        // Verify correctness
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\n✔ Results Match");
        } else {
            System.out.println("\n❌ Results DO NOT Match");
        }

        System.out.println("\nProgram continues...");
    }
}