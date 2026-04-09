import java.util.*;

// 🔹 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔹 Goods Bogie Class
class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;  // Assigned cargo

    public GoodsBogie(String type) {
        this.type = type;
    }

    // 🔹 Cargo assignment with safety validation
    public void assignCargo(String cargo) {
        try {
            // ❌ Unsafe condition
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe: Rectangular bogie cannot carry Petroleum"
                );
            }

            // ✔ Safe assignment
            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + type + " bogie");

        } catch (CargoSafetyException e) {
            // 🔹 Handle exception gracefully
            System.out.println("Exception Caught: " + e.getMessage());

        } finally {
            // 🔹 Always executes
            System.out.println("Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }

    public String toString() {
        return type + " Bogie -> Cargo: " + (cargo == null ? "None" : cargo);
    }
}

// 🔹 Main Application
public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create goods bogies
        GoodsBogie bogie1 = new GoodsBogie("Cylindrical");
        GoodsBogie bogie2 = new GoodsBogie("Rectangular");

        // =========================
        // ✔ Safe Assignment
        // =========================
        bogie1.assignCargo("Petroleum");

        // =========================
        // ❌ Unsafe Assignment
        // =========================
        bogie2.assignCargo("Petroleum");

        // =========================
        // ✔ Another Safe Assignment
        // =========================
        bogie2.assignCargo("Coal");

        // 🔹 Final State
        System.out.println("Final Bogie States:");
        System.out.println(bogie1);
        System.out.println(bogie2);

        System.out.println("\nProgram continues safely after handling exceptions.");
    }
}