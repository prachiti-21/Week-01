public class UnitConversion {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitTocelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitTocelsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusTofahrenheit = (celsius * 9 / 5) + 32;
        return celsiusTofahrenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsTokilograms = 0.453592;
        return pounds * poundsTokilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTopounds = 2.20462;
        return kilograms * kilogramsTopounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToliters = 3.78541;
        return gallons * gallonsToliters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersTogallons = 0.264172;
        return liters * litersTogallons;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class

        // Fahrenheit to Celsius conversion
        double fahrenheit = 98.6;
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Celsius to Fahrenheit conversion
        double celsiusInput = 37;
        double fahrenheitResult = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " Celsius is equal to " + fahrenheitResult + " Fahrenheit.");

        // Pounds to Kilograms conversion
        double pounds = 150;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        // Kilograms to Pounds conversion
        double kilogramsInput = 68;
        double poundsResult = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsResult + " pounds.");

        // Gallons to Liters conversion
        double gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");

        // Liters to Gallons conversion
        double litersInput = 10;
        double gallonsResult = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters is equal to " + gallonsResult + " gallons.");
    }
}