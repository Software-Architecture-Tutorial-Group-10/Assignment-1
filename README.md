
## How to Run

### Run Main Program
1. Open the project in IntelliJ (or any IDE).
2. Run `Main.java` (found in `src/assignment1`).
3. The program will load values from the files in `dataFiles/` and display output for each brand.

### Run Tests
1. Ensure you have **JUnit 5** set up (IntelliJ includes this by default).
2. The test file is located in `src/test/assignment1/SmartDeviceFactoryTest.java`.
3. Right-click on the file (or class) and choose **Run 'SmartDeviceFactoryTest'**.
4. All tests should pass if the code and data files are set correctly.

## Notes
- `dataFiles/` must be in the root project folder so the code can read the values properly.
- Tests rely on these input files (e.g., `brandA_bulb.txt` must contain an integer like `75`).




## Project Directory Structure

```text
Assignment-1/
│
├── README.md                  # Project documentation
├── UML.png                    # UML diagram for the project
├── dataFiles/                 # Input files for bulbs and locks
│   ├── brandA_bulb.txt
│   ├── brandA_lock.txt
│   ├── brandB_bulb.txt
│   └── brandB_lock.txt
│
└── src/                       # Source code
    ├── assignment1/           # Main implementation
    │   ├── Bulb.java
    │   ├── Lock.java
    │   ├── brandABulb.java
    │   ├── brandALock.java
    │   ├── brandBBulb.java
    │   ├── brandBLock.java
    │   ├── brandAFactory.java
    │   ├── brandBFactory.java
    |   |── Main.java            # Main code file
    │   ├── smartDeviceFactory.java
    │   
    │
    └── test/                    # Unit tests
        └── assignment1/
            └── SmartDeviceFactoryTest.java
```
## UML Diagram

![Assignment_1_UML.png](Assignment_1_UML.png)

## Tests
We wrote JUnit tests to verify that each brand’s `Bulb` and `Lock` correctly load their power or battery usage from the data files. These tests ensure that the Abstract Factory creates the proper objects and that file input values are read as expected.

![Test_Results.png](src/Test_Results.png)

### Output
This is the output of our code given our data.
![Output.png](src/Output.png)