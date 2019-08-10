package JavaFundamentalsExe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;


        public Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }


        public String getModel() {
            return model;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            if (type.equals("car")) {

                return "Type: Car" + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Horsepower: " + horsepower;
            } else {
                return "Type: Truck" + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Horsepower: " + horsepower;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Vehicle> cars = new ArrayList<>();
        List<Vehicle> trucks = new ArrayList<>();

        String command = in.nextLine();
        while (!command.equals("End")) {
            String[] data = command.split(" ");

            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));

            if (vehicle.getType().equals("car")) {
                cars.add(vehicle);
            } else {
                trucks.add(vehicle);
            }

            command = in.nextLine();

        }

        String nextCommand = in.nextLine();
        while (!nextCommand.equals("Close the Catalogue")) {
            String model = nextCommand;

            for (Vehicle car : cars) {
                if (car.getModel().equals(model)) {
                    System.out.println(car.toString());
                }
            }

            for (Vehicle truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.println(truck.toString());
                }
            }

            nextCommand = in.nextLine();
        }

        double carsHorsepower = 0;
        double tucksHorsepower = 0;

        for (Vehicle car : cars) {
            carsHorsepower += car.getHorsepower();
        }

        for (Vehicle truck : trucks) {
            tucksHorsepower += truck.getHorsepower();
        }

        if (cars.size() != 0) {
            carsHorsepower /= cars.size();
        }

        if (trucks.size() != 0) {
            tucksHorsepower /= trucks.size();

        }

        System.out.printf("Cars have average horsepower of: %.2f.\nTrucks have average horsepower of: %.2f.", carsHorsepower, tucksHorsepower);


    }

}

