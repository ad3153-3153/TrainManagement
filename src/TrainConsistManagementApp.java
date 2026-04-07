import java.util.*;

// MAIN CLASS - UseCase15TrainConsistMgmt
public class UseCase15TrainConsistMgmt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- Goods Bogie Class ----
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {

            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe Assignment: Rectangular bogie cannot carry Petroleum"
                    );
                }

                // If safe
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo + " -> " + shape + " bogie");

            } catch (CargoSafetyException e) {
                System.out.println("Exception Caught: " + e.getMessage());

            } finally {
                System.out.println("Logging: Cargo assignment attempt completed.\n");
            }
        }

        @Override
        public String toString() {
            return shape + " bogie carrying: " +
                    (cargo == null ? "Nothing" : cargo);
        }
    }

    // ---- MAIN METHOD ----
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" SAFE CARGO ASSIGNMENT SYSTEM ");
        System.out.println("=======================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        bogies.add(b1);
        bogies.add(b2);

        // Assign cargo (safe + unsafe)
        b1.assignCargo("Petroleum");   // ❌ unsafe
        b2.assignCargo("Petroleum");   // ✅ safe
        b1.assignCargo("Grain");       // ✅ safe

        // Display final state
        System.out.println("Final Bogie Status:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nSystem running safely...");
    }
}