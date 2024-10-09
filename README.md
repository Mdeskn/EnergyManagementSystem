# Energy Management System

## Project Name:
Energy Management System

## Description:
This project simulates an Energy Management System that manages log files for charging stations and energy sources. It allows users to create daily logs, view logs, simulate data exchange, and manage log files (create, delete, move). 

### Project Requirements:
1. **Create Metadata for Managing Log Files**:
   - Implemented in the **LogFileManager** class with methods like `createLogFile`, `deleteLogFile`, and `moveLogFile` for systematic handling of log files.

2. **Use Byte and Character Streams for Data Exchange**:
   - Implemented in the **DataExchangeSimulation** class, utilizing byte streams to simulate data exchange between energy stations and the system.

3. **Add Logs for Each Day for Charging Stations and Energy Sources**:
   - Implemented in the **DailyLogCreator** class with methods such as `createDailyLog` and `createSystemLogs`, ensuring consistent log formatting.

4. **Allow Users to Open Log Files Based on Equipment Name or Date**:
   - Implemented in the **LogViewer** class with the `openLogFile` method, enabling users to view specific log files by equipment name or date.

## Version:
1.0

## Author(s):
- Zahra Mahdion - 7221957
- Maede Eskandari Borujerdi - 7221435
- Zahra Paya - 7216582
- Vida Bahrami - 7221533

## Date Created:
October 2024

## Role Distribution:
1. **Zahra Mahdion: LogFileManager & DataExchangeSimulation**
   - **LogFileManager**: Developed methods for managing log files.
   - **DataExchangeSimulation**: Simulated data exchange using byte streams.

2. **Maede Eskandari Borujerdi: Main & GitHub Repository**
   - **Main**: Developed the main user interface and interactive loop for user input and functionality.
   - **GitHub Repository**: Created the project repository and authored this README file.

3. **Zahra Paya: DailyLogCreator**
   - Focused on generating daily logs to ensure consistency and format across logs.

4. **Vida Bahrami: LogViewer**
   - Implemented functionalities for accessing log files and validating dates for a user-friendly interface.

## Link to Video:
https://fhdoprod-my.sharepoint.com/:v:/g/personal/maede_eskandariborujerdi001_stud_fh-dortmund_de/EapHIu2fUNdBmbPqlJ6yp8QBceMuAenpXBog_XjAHmiegw

## Instructions for Running the Project

### Step 1: Clone or Download the Project from GitHub
Visit the GitHub repository containing the project. You can download the project by clicking the **Code** button and selecting **Download ZIP**, or clone the repository using the following command:

```bash
git clone https://github.com/Mdeskn/EnergyManagementSystem.git
```

Extract the ZIP file to a folder on your local machine, or find the cloned project folder.

### Step 2: Import the Project into Eclipse
1. Open **Eclipse IDE**.
2. Go to **File > Import**.
3. Select **General > Existing Projects into Workspace** and click **Next**.
4. Click **Browse** and navigate to the folder where you saved or extracted the project.
5. Select the project and click **Finish**.

### Step 3: Run the Program in Eclipse
1. In Eclipse, locate the imported project in the **Package Explorer**.
2. Right-click the project folder and choose **Run As > Java Application**.
3. Follow the on-screen menu to create logs, view logs, simulate data exchange, or manage log files.

---

This project is developed for the Basic I/O and Regular Expressions Assignment for the Java pre-course by Dr. Prof. Galyna Tabunshchyk.

---