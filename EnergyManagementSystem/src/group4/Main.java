package group4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Energy Management System!");

        try {
            while (true) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Create daily logs");
                System.out.println("2. View log file");
                System.out.println("3. Simulate data exchange");
                System.out.println("4. Delete a log file");
                System.out.println("5. Exit");

                int choice = 0;
                boolean validInput = false;

                // Input validation loop
                while (!validInput) {
                    try {
                        choice = scanner.nextInt();
                        validInput = true;  // valid input, exit the loop
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number between 1 and 5.");
                        scanner.nextLine();  // clear the invalid input
                    }
                }
                scanner.nextLine();  // consume newline

                switch (choice) {
                    case 1:
                        DailyLogCreator.createSystemLogs();
                        break;
                    case 2:
                        System.out.print("Enter equipment name: ");
                        String equipmentName = scanner.nextLine();
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        LogViewer.openLogFile(equipmentName, date);
                        break;
                    case 3:
                        DataExchangeSimulation.simulateDataExchange();
                        break;
                    case 4:
                        System.out.print("Enter log file name to delete (e.g., ChargingStation1_log_2024-10-06.txt): ");
                        String fileName = scanner.nextLine();
                        LogFileManager.deleteLogFile(fileName);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        } finally {
            scanner.close();  // Close the scanner
        }
    }
}
