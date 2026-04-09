import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create HashSet for Bogie IDs (ensures uniqueness)
        Set<String> bogieIds = new HashSet<>();

        // 🔹 Add Bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // 🔹 Display Unique Bogie IDs
        System.out.println("\nUnique Bogie IDs in Train:");
        System.out.println(bogieIds);

        // 🔹 Show count (duplicates removed automatically)
        System.out.println("\nTotal unique bogies: " + bogieIds.size());

        System.out.println("\nSystem ensures no duplicate bogie IDs.");
    }
}