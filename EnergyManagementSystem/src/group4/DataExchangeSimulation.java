package group4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DataExchangeSimulation {

    // Simulate data exchange between components using byte streams
    public static void simulateDataExchange() throws IOException {
        // Simulate sending data (e.g., energy usage data)
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        String data = "Energy Data from Charging Station";
        byteStream.write(data.getBytes());

        // Simulate receiving the data
        ByteArrayInputStream inputStream = new ByteArrayInputStream(byteStream.toByteArray());
        int byteData;
        while ((byteData = inputStream.read()) != -1) {
            System.out.print((char) byteData); // Print each byte as a character
        }
        System.out.println();
    }
}
