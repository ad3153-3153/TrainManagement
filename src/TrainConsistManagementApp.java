

import java.util.Arrays;

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=======================================\n");

        // Sorted array of bogie IDs (IMPORTANT)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Search key
        String searchId = "BG309";

        // Display IDs
        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));
        System.out.println();

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            }
            else if (result > 0) {
                low = mid + 1;   // search right half
            }
            else {
                high = mid - 1;  // search left half
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchId + " FOUND.");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT FOUND.");
        }

        System.out.println("\nSearch completed using Binary Search.");
    }
}