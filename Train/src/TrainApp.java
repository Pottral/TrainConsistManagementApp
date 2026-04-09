import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet (ordered + unique)
        Set<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 🔹 Display formation
        System.out.println("\nTrain Formation (Insertion Order Preserved):");
        System.out.println(trainFormation);

        // 🔹 Show size (duplicate not counted)
        System.out.println("\nTotal bogies: " + trainFormation.size());

        System.out.println("\nDuplicate entries automatically prevented.");
    }
}