package com.Java21_Features.sealed_classes;

/**
 * Classe de démonstration pour les classes scellées.
 */
public class SealedClassesExample {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", 4);
        Vehicle truck = new Truck("XYZ789", 5000.0);

        car.startEngine();
        truck.startEngine();

        // Démonstration du pattern matching avec les classes scellées
        printVehicleInfo(car);
        printVehicleInfo(truck);
    }

    /**
     * Méthode utilisant le pattern matching pour traiter différents types de véhicules.
     */
    public static void printVehicleInfo(Vehicle vehicle) {
        switch (vehicle) {
            case Car c -> System.out.println(STR."Car with \{c.getNumberOfDoors()} doors");
            case Truck t -> System.out.println(STR."Truck with \{t.getCargoCapacity()} kg cargo capacity");
            default -> System.out.println("Unknown vehicle type");
        }
    }
}