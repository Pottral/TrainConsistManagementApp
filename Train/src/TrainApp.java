import java.util.*;
import java.util.stream.*;

// 🔹 Bogie class (same as UC7)
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Original List (UC7 reuse)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 80)); // extra example

        System.out.println("\nOriginal Bogies:");
        System.out.println(bogies);

        // 🔹 Stream Filtering (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // 🔹 Display filtered result
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        System.out.println(filteredBogies);

        // 🔹 Verify original list unchanged
        System.out.println("\nOriginal List After Filtering (Unchanged):");
        System.out.println(bogies);

        System.out.println("\nSystem ready for advanced filtering...");
    }
}