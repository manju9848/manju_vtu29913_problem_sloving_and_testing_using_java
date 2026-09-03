import java.util.*;

public class RideSharingPlatformSimulator {
    static class Vehicle {
        String vehicleType;

        Vehicle(String vehicleType) {
            this.vehicleType = vehicleType;
        }
    }
    static class Driver {
        String name;
        Vehicle vehicle;

        Driver(String name, Vehicle vehicle) {
            this.name = name;
            this.vehicle = vehicle;
        }
    }
    static class Rider {
        String name;

        Rider(String name) {
            this.name = name;
        }
    }
    static class InvalidBookingException extends Exception {
        InvalidBookingException(String message) {
            super(message);
        }
    }
    static abstract class Trip {
        double distance;

        Trip(double distance) {
            this.distance = distance;
        }

        abstract double calculateFare() throws InvalidBookingException;
    }
    static class BikeTrip extends Trip {
        BikeTrip(double distance) {
            super(distance);
        }

        double calculateFare() throws InvalidBookingException {
            if (distance <= 0)
                throw new InvalidBookingException("Invalid distance");
            return distance * 5;
        }
    }
    static class AutoTrip extends Trip {
        AutoTrip(double distance) {
            super(distance);
        }

        double calculateFare() throws InvalidBookingException {
            if (distance <= 0)
                throw new InvalidBookingException("Invalid distance");
            return distance * 12;
        }
    }
    static class CabTrip extends Trip {
        CabTrip(double distance) {
            super(distance);
        }

        double calculateFare() throws InvalidBookingException {
            if (distance <= 0)
                throw new InvalidBookingException("Invalid distance");
            return distance * 12;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();

            try {
                Trip trip;

                if (type.equalsIgnoreCase("Bike")) {
                    trip = new BikeTrip(distance);
                } else if (type.equalsIgnoreCase("Auto")) {
                    trip = new AutoTrip(distance);
                } else if (type.equalsIgnoreCase("Cab")) {
                    trip = new CabTrip(distance);
                } else {
                    throw new InvalidBookingException("Invalid ride type");
                }

                System.out.println((int) trip.calculateFare());

            } catch (InvalidBookingException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}