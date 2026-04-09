import java.util.*;
import java.util.regex.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        Scanner sc = new Scanner(System.in);

        // 🔹 User input
        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // 🔹 Regex Patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // 🔹 Compile Patterns
        Pattern pTrain = Pattern.compile(trainPattern);
        Pattern pCargo = Pattern.compile(cargoPattern);

        // 🔹 Create Matchers
        Matcher mTrain = pTrain.matcher(trainId);
        Matcher mCargo = pCargo.matcher(cargoCode);

        // 🔹 Validation using matches()
        boolean isTrainValid = mTrain.matches();
        boolean isCargoValid = mCargo.matches();

        // 🔹 Display Results
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        sc.close();
    }
}