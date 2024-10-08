package group4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;

public class LogFileManager {

    // Method to create log file for a charging station or energy source
    public static void createLogFile(String equipmentName) throws IOException {
        LocalDate today = LocalDate.now();
        String fileName = "logs/" + equipmentName + "_log_" + today + ".txt";
        File logFile = new File(fileName);
        
        if (logFile.createNewFile()) {
            System.out.println("Log file created: " + logFile.getName());
        } else {
            System.out.println("Log file already exists.");
        }
    }

    // Method to delete a log file
    public static void deleteLogFile(String fileName) {
        File logFile = new File("logs/" + fileName);
        if (logFile.delete()) {
            System.out.println("Deleted the file: " + logFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    // Method to move a log file (used for archiving)
    public static void moveLogFile(String fileName, String newDirectory) throws IOException {
        Path source = Path.of("logs/" + fileName);
        Path destination = Path.of(newDirectory + "/" + fileName);
        Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Moved file to: " + destination);
    }
}
