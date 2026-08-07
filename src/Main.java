import java.util.Scanner;
public static void main()
{
    Scanner scanner = new Scanner(System.in);
    RentalManager rentalManager = new RentalManager();
    rentalManager.addVehicle(new Car("C1","AUDİ",1500));
    rentalManager.addVehicle(new Motorcycle("M1","Yamaha",600));
    rentalManager.addVehicle(new Truck("T1","Volvo",3000));
    boolean running = true;
    while (running)
    {
        System.out.println("\n--- VEHICLE RENTAL SYSTEM ---");
        System.out.println("1. List Available Vehicles");
        System.out.println("2. Rent a Vehicle");
        System.out.println("3. Return a Vehicle");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice)
        {
            case 1:
                rentalManager.listAvailableVehicles();
                break;
            case 2:
                System.out.print("Enter Vehicle ID to rent: ");
                String rentId = scanner.nextLine();
                System.out.print("Enter rental days: ");
                int days = Integer.parseInt(scanner.nextLine());
                rentalManager.rentVehicle(rentId,days);
                break;
            case 3:
                System.out.print("Enter Vehicle ID to return: ");
                String returnId = scanner.nextLine();
                rentalManager.returnVehicle(returnId);
            case 4:
                System.out.println("Exiting system... Goodbye!");
                running = false;
                break;
            default:
                System.out.println("Invalid option! Please try again.");
        }


    }
    scanner.close();
}