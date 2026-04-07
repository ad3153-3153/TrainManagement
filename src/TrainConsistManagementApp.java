import java.util.Arrays;

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