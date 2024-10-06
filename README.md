# Energy Management System

## Project Name:
Energy Management System

## Description:
This project simulates an Energy Management System that manages log files for charging stations and energy sources. It allows users to create daily logs, view logs, simulate data exchange, and manage log files (create, delete, move).

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
   - **LogFileManager**: Created methods for managing log files, including `createLogFile`, `deleteLogFile`, and `moveLogFile`, ensuring systematic handling and organization of log files.
   - **DataExchangeSimulation**: Simulated data exchange between energy stations and the system using byte streams, allowing for effective communication between components.

2. **Maede Eskandari Borujerdi: Main & GitHub Repository**
   - **Main**: Developed the main user interface, implementing an interactive loop to manage user input and calls to other classes, handling options for log creation, viewing, simulation, and deletion.
   - **GitHub Repository**: Created the project repository on GitHub and authored the README file to provide clear documentation for users and contributors.

3. **Zahra Paya: DailyLogCreator**
   - Focused on generating daily logs through methods like `createDailyLog` and `createSystemLogs`, ensuring that logs are consistently formatted and created across all components of the system.

4. **Vida Bahrami: LogViewer**
   - Implemented functionalities for users to access specific log files with `openLogFile` and validate dates with `validateDate`, creating a user-friendly interface for viewing logs.

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