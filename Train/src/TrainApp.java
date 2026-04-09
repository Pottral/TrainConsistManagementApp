import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create HashMap (Bogie → Capacity)
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // 🔹 Insert key–value pairs using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100); // example load capacity

        // 🔹 Display mapping using entrySet()
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }

        // 🔹 Example: Fast lookup
        String searchBogie = "Sleeper";
        System.out.println("\nCapacity of " + searchBogie + ": "
                + bogieCapacity.get(searchBogie));

        System.out.println("\nSystem ready for capacity analysis...");
    }
}