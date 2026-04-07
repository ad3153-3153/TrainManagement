
public class UseCase18TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("=======================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogie IDs
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        System.out.println("\n");

        // ---- LINEAR SEARCH LOGIC ----
        boolean found = false;

        for (String id : bogieIds) {

            if (id.equals(searchId)) {
                found = true;
                break; // stop immediately when found
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchId + " FOUND in the system.");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT FOUND.");
        }

        System.out.println("\nSearch operation completed.");
    }
}