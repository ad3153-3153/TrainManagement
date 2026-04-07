
import java.util.*;

public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC20 - Exception Handling in Search ");
        System.out.println("=======================================\n");

        // Create bogie list (EMPTY case)
        List<String> bogieIds = new ArrayList<>();

        // Search key
        String searchId = "BG101";

        try {

            // ---- STATE VALIDATION ----
            if (bogieIds.isEmpty()) {
                throw new IllegalStateException(
                        "Cannot perform search: No bogies available in the train."
                );
            }

            // ---- SEARCH LOGIC (Linear Search) ----
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            // Display result
            if (found) {
                System.out.println("Bogie ID " + searchId + " FOUND.");
            } else {
                System.out.println("Bogie ID " + searchId + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nProgram terminated safely.");
    }
}