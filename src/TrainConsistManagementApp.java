
import java.util.ArrayList;
import java.util.List;

// Goods Bogie Class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular
    String cargo;  // Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=======================================");
        System.out.println(" TRAIN CONSIST MANAGEMENT SYSTEM ");
        System.out.println("=======================================");

        // Create Goods Bogie List
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Rectangular", "Coal"));      // allowed
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Rectangular", "Grain"));     // allowed

        // Display Bogies
        System.out.println("\nGoods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // UC12: Safety Validation using Stream
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equalsIgnoreCase("Cylindrical") // non-cylindrical allowed
                                || b.cargo.equalsIgnoreCase("Petroleum") // cylindrical must be petroleum
                );

        // Display Result
        System.out.println("\nSafety Compliance Check:");

        if (isSafe) {
            System.out.println("Train is SAFE for operation");
        } else {
            System.out.println("Train is UNSAFE! Rule violation detected");
        }

        System.out.println("\nProgram continues...");
    }
}