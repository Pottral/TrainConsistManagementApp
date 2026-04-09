import java.util.*;

// 🔹 Bogie class (custom object)
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

        // 🔹 Create List of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // 🔹 Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        System.out.println(bogies);

        // 🔹 Sort using Comparator (by capacity ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        System.out.println(bogies);

        // 🔹 Sort in descending order (optional)
        bogies.sort((b1, b2) -> Integer.compare(b2.capacity, b1.capacity));

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        System.out.println(bogies);

        System.out.println("\nSystem ready for capacity-based planning...");
    }
}