## Getting Started

# Abstracting Objects Project

This project demonstrates the abstraction of real-world objects into Java classes. The main focus is on modeling a `Dishwasher` and its associated `Model` class, along with a `Tester` class to validate the functionality.

## Project Structure

The project consists of the following key files:

- **Dishwasher.java**: Represents a dishwasher appliance with functionalities such as adding dishes, turning it on/off, and opening/closing the door. It maintains the state of the dishwasher, including its model, whether the door is open, and whether it is turned on.
- **Model.java**: Encapsulates the model name, capacity, and water temperature of a specific dishwasher.
- **Tester.java**: Contains the `main` method to test the functionality of the `Dishwasher` and `Model` classes.

## Key Features

1. **Dishwasher Class**:
    - Tracks the state of the dishwasher (e.g., door open/closed, power on/off).
    - Allows adding dishes while ensuring capacity limits are respected.
    - Prevents unsafe operations, such as turning on the dishwasher with the door open.

2. **Model Class**:
    - Stores details about the dishwasher model, including its name, capacity, and water temperature.
    - Provides getter and setter methods for encapsulated fields.

3. **Tester Class**:
    - Demonstrates the creation of `Dishwasher` objects with different models.
    - Tests various scenarios, such as adding dishes, turning the dishwasher on/off, and handling invalid operations.

## How to Run

1. Compile the Java files:
    ```bash
    javac Model.java Dishwasher.java Tester.java
    ```

2. Run the `Tester` class:
    ```bash
    java Tester
    ```

## Example Output

The `Tester` class provides a detailed demonstration of the dishwasher's functionality, including its initial and final states, as well as messages for each operation.

## Additional Notes

- The project adheres to object-oriented principles, including encapsulation and abstraction.
- The `Dishwasher` class ensures safe operations through logical checks, enhancing reliability.

