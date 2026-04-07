import java.util.Arrays;

/*
 * =====================================================
 * MAIN CLASS - UseCase17TrainConsistMgmt
 * =====================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 *
 * @author Developer
 * @version 17.0
 */

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC17 - Sorting using Arrays.sort() ");
        System.out.println("=======================================\n");

        // Create array of bogie type names
        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "General",
                "First Class",
                "Second Sitting"
        };

        // Display original order
        System.out.println("Original Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sort using built-in method
        Arrays.sort(bogieTypes);

        // Display sorted result
        System.out.println("\nSorted Bogie Types (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nSorting completed using Java library.");
    }
}