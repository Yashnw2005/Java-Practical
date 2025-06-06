import java.util.Scanner;

interface Vehicle {
    void acceptDetails(Scanner sc);
    void displayDetails();
}

class Car implements Vehicle {
    String fuelType, model, company;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Company: ");
        company = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Fuel Type: ");
        fuelType = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("\nCar Details:");
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class InterfaceVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cars do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine();  // Clear newline after nextInt()

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Car " + (i + 1) + ":");
            Car myCar = new Car();
            myCar.acceptDetails(sc);
            myCar.displayDetails();
        }

        sc.close();
    }
}
