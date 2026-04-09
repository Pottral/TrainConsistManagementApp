import java.util.*;
import java.util.stream.*;

// 🔹 Bogie class (same as previous UCs)
class Bogie {
    String name;
    String type;
    int capacity;

    public Bogie(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + " seats)";
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

        System.out.println("\nBogie List:");
        System.out.println(bogies);

        // 🔹 Stream Aggregation (map + reduce)
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        // 🔹 Display total
        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        // 🔹 Verify original list unchanged
        System.out.println("\nOriginal List After Aggregation (Unchanged):");
        System.out.println(bogies);

        System.out.println("\nSystem ready for capacity analytics...");
    }
}