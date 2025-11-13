/**
 * Model.java
 * This class encapsulates the model name, capacity, and water temperature
 * of a specific dishwasher.
 * 
 * Author: Anthony Mokhov
 * Collaborator: GitHub Copilot
 */

public class Model {
    // Fields to store the model name, capacity, and water temperature
    private String modelName; // The name of the dishwasher model
    private int capacity; // The capacity of the dishwasher in terms of place settings
    private double waterTemp; // The water temperature in degrees Celsius

    /**
     * Constructor to initialize the Model object with the given parameters.
     * 
     * @param modelName The name of the dishwasher model.
     * @param capacity The capacity of the dishwasher.
     * @param waterTemp The water temperature in degrees Celsius.
     */
    public Model(String modelName, int capacity, double waterTemp) {
        this.modelName = modelName;
        this.capacity = capacity;
        this.waterTemp = waterTemp;
    }

    /**
     * Gets the name of the dishwasher model.
     * 
     * @return The model name.
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the name of the dishwasher model.
     * 
     * @param modelName The new model name.
     */
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * Gets the capacity of the dishwasher.
     * 
     * @return The capacity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the capacity of the dishwasher.
     * 
     * @param capacity The new capacity.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Gets the water temperature of the dishwasher.
     * 
     * @return The water temperature in degrees Celsius.
     */
    public double getWaterTemp() {
        return waterTemp;
    }

    /**
     * Sets the water temperature of the dishwasher.
     * 
     * @param waterTemp The new water temperature in degrees Celsius.
     */
    public void setWaterTemp(double waterTemp) {
        this.waterTemp = waterTemp;
    }

    /**
     * Provides a string representation of the Model object.
     * 
     * @return A string containing the model name, capacity, and water temperature.
     */
    @Override
    public String toString() {
        return "Model{" +
                "modelName='" + modelName + '\'' +
                ", capacity=" + capacity +
                ", waterTemp=" + waterTemp +
                '}';
    }
}