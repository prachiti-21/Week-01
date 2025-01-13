import java.util.*;
public class UnitConverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Test the UnitConverter methods

        double kilometers = 10.0;
        System.out.println(kilometers + " kilometers is " + convertKmToMiles(kilometers) + " miles.");

        double miles = 6.2;
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");

        double meters = 100.0;
        System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");

        double feet = 328.0;
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }
}
