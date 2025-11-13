public class Tester {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Create instances of the Dishwasher class and test its functionality

        // Create a dishwasher with default water temperature
        Dishwasher dishwasher1 = new Dishwasher("Model A", 12);

        // Create a dishwasher with a specific water temperature
        Dishwasher dishwasher2 = new Dishwasher("Model B", 8, 45.0);

        // Test the functionality of dishwasher1
        System.out.println("Testing dishwasher1:");
        System.out.println(dishwasher1); // Print initial state
        dishwasher1.openDoor(); // Open the door
        dishwasher1.addDishes(5); // Add 5 dishes
        dishwasher1.closeDoor(); // Close the door
        dishwasher1.turnOn(); // Turn on the dishwasher
        dishwasher1.turnOff(); // Turn off the dishwasher
        System.out.println(dishwasher1); // Print final state

        System.out.println("------------------------------"); // Line break between dishwashers

        // Test the functionality of dishwasher2
        System.out.println("Testing dishwasher2:");
        System.out.println(dishwasher2); // Print initial state
        dishwasher2.openDoor(); // Open the door
        dishwasher2.addDishes(10); // Attempt to add 10 dishes (exceeds capacity)
        dishwasher2.addDishes(3); // Add 3 dishes
        dishwasher2.closeDoor(); // Close the door
        dishwasher2.turnOn(); // Turn on the dishwasher
        dishwasher2.openDoor(); // Attempt to open the door while it's on
        dishwasher2.turnOff(); // Turn off the dishwasher
        dishwasher2.openDoor(); // Open the door
        System.out.println(dishwasher2); // Print final state
    }
}