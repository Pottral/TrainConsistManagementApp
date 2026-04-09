import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedList for ordered consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 🔹 Add bogies (initial sequence)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // 🔹 Insert Pantry Car at position 2 (index-based insertion)
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter inserting Pantry at position 2:");
        System.out.println(trainConsist);

        // 🔹 Remove first and last bogies
        trainConsist.removeFirst(); // removes Engine
        trainConsist.removeLast();  // removes Guard

        System.out.println("\nAfter removing first and last bogies:");
        System.out.println(trainConsist);

        // 🔹 Final ordered consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);

        System.out.println("\nTrain sequence maintained successfully.");
    }
}