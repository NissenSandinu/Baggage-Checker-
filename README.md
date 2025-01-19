# Baggage Handler Software 🛩️🛄

A Java application for managing and analyzing baggage details. The software provides both a **Graphical User Interface (GUI)** and a **Console-based Interface** for interacting with baggage data.

## Features

- **Input and Validation**: Enter baggage dimensions (length, width, height) and weight.
- **Carry-On Suitability**: Checks if the baggage meets carry-on requirements.
- **Overweight Check**: Determines if the baggage exceeds the allowed weight (22.00 kg) and calculates the surcharge.
- **Detailed Output**: Displays a summary of the baggage status, including carry-on eligibility and overweight surcharge if applicable.
- **Multiple Interfaces**:
  - **GUI Version**: A graphical interface built with `Swing` for ease of use.
  - **Console Version**: A text-based interface for efficient input and processing using validated data.

## Class Overview

### **GUI Version**
#### `BaggageGUI`
The graphical interface for interacting with baggage data. Features include:
- Text fields for entering dimensions and weight.
- Buttons to submit baggage details or quit the application.
- A text area to display results.

### **Console Version**
#### `BaggageLauncher`
The main class for the console-based version. Features include:
- A loop to handle multiple baggage entries.
- Input validation using the `InputData` utility class.
- Summary of the total number of valid bags and their combined weight.
- User prompts for continuing or exiting the program.

#### `InputData`
A utility class for validating user input. Features include:
- **`validateInt`**: Ensures valid integer input.
- **`validateDouble`**: Ensures valid double input.
- **`validateString`**: Reads and returns a string input.

### **Core Functionality**
#### `Baggage`
Represents a baggage item:
- **Properties**: Length, width, height, and weight.
- **Methods**:
  - Getters and setters for all properties.
  - `toString` to provide a detailed description of the baggage.

#### `BaggageChecker`
Utility class for baggage validation:
- **Carry-On Eligibility**: Checks if all dimensions are within the carry-on limit.
- **Overweight Check**: Determines if the baggage exceeds the allowed weight.
- **Surcharge Calculation**: Calculates the surcharge for overweight baggage.
- **Dimension Check**: Verifies if the total dimensions exceed the maximum allowed sum.

## How It Works

### GUI Version
1. **Run the Program**: Launch the `BaggageGUI` class.
2. **Input Details**: Enter the dimensions and weight in the provided fields.
3. **Submit**: Click "Submit" to process the baggage.
4. **Output**: View results in the text area, including carry-on eligibility and overweight surcharges.
5. **Quit**: Click "Quit" to exit.

### Console Version
1. **Run the Program**: Launch the `BaggageLauncher` class.
2. **Input Details**: Enter baggage dimensions and weight as prompted.
3. **Validation**: The `InputData` class ensures valid input.
4. **Processing**: The program evaluates the baggage, displays its status, and prompts for another entry.
5. **Summary**: Upon exit, view the total valid bags and their combined weight.

## Compile The Codes 
`javac Baggage/Baggage.java Baggage/BaggageChecker.java BaggageLauncher.java InputData.java BaggageGUI.java`

### Run The GUI Version
`BaggageGUI.java`

### Run the Console Version
`BaggageLauncher.java` - In the console version the user inputs are valided by the `InputData.java`


## Example Output

### GUI Example
When you input the following details:
- **Length:** 60 cm
- **Width:** 20 cm
- **Height:** 30 cm
- **Weight:** 25 kg
  
The output might look like:

    This bag has length 60 cm, width 20 cm, height 30 cm, and weight 25.0 kg.
    This bag can be used as a carry on.
    This bag is overweight; it exceeds the allowed weight of 22.00 kg. A surcharge of $9.00 applies.

### Console Example 

Welcome to the Baggage Handler Software Program. 

    Enter the length of the baggage (in cm)60
    Enter the width (in cm)20
    Enter the height (in cm)30
    Enter the weight (in kg)25
    This bag has length 60 cm, width 20 cm, height 30 cm, and weight 25.0 kg.
    This bag is overweight; it exceeds the allowed weight of 22.00 kg. A surcharge of $9.00 applies.

    Do you wish to continue? Enter 'no' to quit, anything else to continue: no
    The total number of valid bags entered was: 1
    The total weight entered was: 25.0 kg
    The program has terminated.
    Program by Nissen Sandinu Wettasinghe

## Project Structure

    Baggage Handler Software/
    ├── Baggage/
    │   ├── Baggage.java         # Represents a baggage item
    │   ├── BaggageChecker.java  # Utility class for baggage validation
    ├── BaggageLauncher.java     # Console version of the program
    ├── InputData.java           # Input validation utility
    ├── BaggageGUI.java          # GUI version of the program

## Dependencies
- Java Development Kit (JDK) 8





