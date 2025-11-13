import java.util.Objects;

/**
 * The Dishwasher class represents a dishwasher appliance with various functionalities 
 * such as adding dishes, turning it on/off, and opening/closing the door. It also 
 * maintains the state of the dishwasher, including its model and whether it is open or turned on.
 * 
 * <p>This class provides methods to interact with the dishwasher and ensures that 
 * operations are performed under valid conditions (e.g., the dishwasher cannot be 
 * turned on while the door is open).</p>
 * 
 * <p>Author: Anthony Mokhov</p>
 * <p>Collaborator: GitHub Copilot</p>
 */
public class Dishwasher {
    // Instance variables to represent the state of the dishwasher
    private boolean isOpen; // Indicates whether the dishwasher door is open
    private Model model; // Model object representing the dishwasher's model
    private int numberOfDishes; // Current number of dishes in the dishwasher
    private boolean isOn; // Indicates whether the dishwasher is turned on

    /**
     * Constructor to initialize the dishwasher with a model.
     * The dishwasher starts with default values for other attributes.
     * 
     * @param model The model object representing the dishwasher's model.
     */
    public Dishwasher(Model model) {
        this.model = Objects.requireNonNull(model, "Model cannot be null");
        isOpen = false;
        isOn = false;
        numberOfDishes = 0; // Initially, no dishes are loaded
    }

    /**
     * Overloaded constructor to initialize the dishwasher with a model 
     * and a specific water temperature.
     * 
     * @param model The model object representing the dishwasher's model.
     * @param _waterTemperature The initial water temperature of the dishwasher.
     */
    public Dishwasher(Model model, double _waterTemperature) {
        this.model = Objects.requireNonNull(model, "Model cannot be null");
        isOpen = false;
        isOn = false;
        numberOfDishes = 0;
        this.model.setWaterTemp(_waterTemperature); // Set the water temperature in the model
    }

    /**
     * Adds dishes to the dishwasher if the door is open and there is enough capacity.
     * 
     * @param _dishes The number of dishes to add.
     */
    public void addDishes(int _dishes) {
        if (isOpen) { // Check if the door is open
            if (numberOfDishes + _dishes <= model.getCapacity()) { // Check if capacity allows adding dishes
                numberOfDishes += _dishes;
                System.out.println(_dishes + " dishes added. Total dishes: " + numberOfDishes);
            } else {
                System.out.println("Cannot add dishes. Capacity exceeded.");
            }
        } else {
            System.out.println("Cannot add dishes. Dishwasher is closed.");
        }
    }

    /**
     * Turns on the dishwasher if it is not already on and the door is closed.
     */
    public void turnOn() {
        if (isOn) { // Check if the dishwasher is already on
            System.out.println("Dishwasher is already ON.");
        } else if (isOpen) { // Check if the door is open
            System.out.println("Cannot turn on. Dishwasher is open.");
        } else {
            isOn = true;
            System.out.println("Dishwasher is now ON.");
        }
    }

    /**
     * Turns off the dishwasher if it is currently on.
     */
    public void turnOff() {
        if (!isOn) { // Check if the dishwasher is already off
            System.out.println("Dishwasher is already OFF.");
        } else {
            isOn = false;
            System.out.println("Dishwasher is now OFF.");
        }
    }

    /**
     * Opens the dishwasher door if it is not currently on.
     */
    public void openDoor() {
        if (isOn) { // Check if the dishwasher is on
            System.out.println("Cannot open door. Dishwasher is ON.");
        } else {
            isOpen = true;
            System.out.println("Dishwasher door is now OPEN.");
        }
    }

    /**
     * Closes the dishwasher door.
     */
    public void closeDoor() {
        isOpen = false;
        System.out.println("Dishwasher door is now CLOSED.");
    }

    /**
     * Returns a string representation of the dishwasher's current state.
     * 
     * @return A string describing the dishwasher's model, capacity, number of dishes, 
     *         water temperature, and whether it is open or on.
     */
    @Override
    public String toString() {
        return "Dishwasher Model: " + model +
               "\nCapacity: " + model.getCapacity() +
               "\nNumber of Dishes: " + numberOfDishes +
               "\nWater Temperature: " + model.getWaterTemp() + "°C" +
               "\nIs Open: " + (isOpen ? "Yes" : "No") +
               "\nIs On: " + (isOn ? "Yes" : "No");
    }
}
