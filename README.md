# Abstracting Objects Project

A Java project demonstrating object-oriented programming concepts through a Dishwasher simulation. This project showcases abstraction, encapsulation, and state management in Java.

## Project Overview

This project implements a dishwasher simulator that models real-world dishwasher behavior with various operations and state management. It demonstrates core OOP principles including:

- **Encapsulation**: Internal state management with private fields and public methods
- **Abstraction**: Separating model specifications from dishwasher functionality
- **Object Composition**: Using the Model class to represent dishwasher specifications
- **State Management**: Tracking dishwasher state (open/closed, on/off, dish count)

## Features

The Dishwasher class provides the following functionality:

- **Add Dishes**: Load dishes into the dishwasher (when door is open and within capacity)
- **Door Control**: Open and close the dishwasher door
- **Power Control**: Turn the dishwasher on and off
- **State Validation**: Enforces realistic constraints (e.g., cannot turn on while door is open)
- **Model Specifications**: Each dishwasher has a model with capacity and water temperature settings

## Project Structure

```
Abstracting-Objects-Project/
└── Abstracting Objects/
    ├── src/
    │   ├── Dishwasher.java  # Main dishwasher class with operations
    │   ├── Model.java        # Model class representing dishwasher specifications
    │   └── Tester.java       # Test/demo class with usage examples
    ├── bin/                  # Compiled class files
    └── .vscode/              # VS Code configuration
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (VS Code with Java extensions recommended, IntelliJ IDEA, Eclipse, etc.)

### Running the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/1Am0/Abstracting-Objects-Project.git
   cd Abstracting-Objects-Project
   ```

2. Navigate to the project directory:
   ```bash
   cd "Abstracting Objects"
   ```

3. Compile the Java files:
   ```bash
   javac -d bin src/*.java
   ```

4. Run the Tester class:
   ```bash
   java -cp bin Tester
   ```

### Using VS Code

If you're using Visual Studio Code with the Java Extension Pack:

1. Open the `Abstracting Objects` folder in VS Code
2. The project will be automatically recognized
3. Run the `Tester.java` file using the "Run" button or F5

## Usage Example

```java
// Create a dishwasher model
Model modelA = new Model("Model A", 12, 50.0);

// Create a dishwasher instance
Dishwasher dishwasher = new Dishwasher(modelA);

// Use the dishwasher
dishwasher.openDoor();           // Open the door
dishwasher.addDishes(5);         // Add 5 dishes
dishwasher.closeDoor();          // Close the door
dishwasher.turnOn();             // Turn on the dishwasher
dishwasher.turnOff();            // Turn off the dishwasher

// Print dishwasher state
System.out.println(dishwasher);
```

## Class Documentation

### Dishwasher Class

The main class representing a dishwasher appliance with the following methods:

- `Dishwasher(Model model)` - Constructor with model
- `Dishwasher(Model model, double waterTemperature)` - Constructor with model and custom water temperature
- `addDishes(int dishes)` - Add dishes to the dishwasher
- `turnOn()` - Turn on the dishwasher
- `turnOff()` - Turn off the dishwasher
- `openDoor()` - Open the dishwasher door
- `closeDoor()` - Close the dishwasher door
- `toString()` - Get string representation of dishwasher state

### Model Class

Represents dishwasher model specifications:

- `Model(String modelName, int capacity, double waterTemp)` - Constructor
- Getters and setters for modelName, capacity, and waterTemp
- `toString()` - Get string representation of the model

## Author

**Anthony Mokhov**

*Collaborator: GitHub Copilot*

## License

This project is available for educational purposes.
