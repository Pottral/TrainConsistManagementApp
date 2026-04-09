import java.util.*;
import java.util.stream.*;

// 🔹 Bogie class (extended with type)
class Bogie {
    String name;
    String type; // Passenger / Goods
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Cargo Rectangular", "Goods", 100));
        bogies.add(new Bogie("Cargo Cylindrical", "Goods", 120));
        bogies.add(new Bogie("Sleeper", "Passenger", 72)); // duplicate type

        System.out.println("\nOriginal Bogie List:");
        System.out.println(bogies);

        // 🔹 Group by type using groupingBy()
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // 🔹 Display grouped result
        System.out.println("\nGrouped Bogies by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔹 Verify original list unchanged
        System.out.println("\nOriginal List After Grouping (Unchanged):");
        System.out.println(bogies);

        System.out.println("\nSystem ready for structured reporting...");
    }
}