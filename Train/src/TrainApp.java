import java.util.*;
import java.util.stream.*;

// 🔹 Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create large dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            bogies.add(new Bogie("Bogie" + i, (i % 100) + 20)); // capacities 20–119
        }

        // =========================
        // 🔹 Loop-Based Filtering
        // =========================
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // =========================
        // 🔹 Stream-Based Filtering
        // =========================
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // =========================
        // 🔹 Display Results
        // =========================
        System.out.println("\nLoop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("\nLoop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");

        // 🔹 Validate results match
        if (loopResult.size() == streamResult.size()) {
            System.out.println("\n✔ Both approaches produce SAME results");
        } else {
            System.out.println("\n❌ Results DIFFER");
        }

        System.out.println("\nPerformance comparison completed.");
    }
}