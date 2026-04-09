import java.util.*;
import java.util.stream.*;

// 🔹 Goods Bogie class
class GoodsBogie {
    String type;   // Cylindrical, Rectangular, etc.
    String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " -> " + cargo;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create list of goods bogies
        List<GoodsBogie> goodsList = new ArrayList<>();

        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Rectangular", "Coal"));
        goodsList.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsList.add(new GoodsBogie("Open", "Grain"));

        System.out.println("\nGoods Bogies:");
        goodsList.forEach(System.out::println);

        // 🔹 Safety validation using allMatch()
        boolean isSafe = goodsList.stream()
                .allMatch(b ->
                        // Rule: Cylindrical must carry Petroleum
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // 🔹 Display result
        System.out.println("\nSafety Compliance Status:");

        if (isSafe) {
            System.out.println("Train is SAFE for operation ✅");
        } else {
            System.out.println("Train is UNSAFE ❌ (Invalid cargo detected)");
        }

        System.out.println("\nSystem completed safety validation.");
    }
}