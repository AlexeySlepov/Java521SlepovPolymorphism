package TaskTwo;

public class Converter {

    // Перевод из метров
    public String convertLength(double number, String toType) {
        switch (toType.toLowerCase()) {
            case "km", "kilometer":
                return "" + (number * 0.001);
            case "mm", "millimeter":
                return "" + (number * 1000);
            case "cm", "centimeter":
                return "" + (number * 100);
            case "f", "foot":
                return "" + (number * 3.28084);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из километров
    public String convertLength(float number, String toType) {
        switch (toType.toLowerCase()) {
            case "m", "meter":
                return "" + (number * 1000);
            case "mm", "millimeter":
                return "" + (number * 1000000);
            case "cm", "centimeter":
                return "" + (number * 100000);
            case "f", "foot":
                return "" + (number * 3280.84);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из сантиметров
    public String convertLength(int number, String toType) {
        switch (toType.toLowerCase()) {
            case "m", "meter":
                return "" + (number * 0.01);
            case "mm", "millimeter":
                return "" + (number * 10);
            case "km", "kilometer":
                return "" + (number * 0.00001);
            case "f", "foot":
                return "" + (number * 0.0328084);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из Цельсия
    public String convertTemperature(double number, String toType){
        switch (toType.toUpperCase()) {
            case "F", "Fahrenheit":
                return "" + (number * 9 / 5 +32);
            case "K", "Kelvin":
                return "" + (number + 273.15);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из Кельвинов
    public String convertTemperature(int number, String toType){
        switch (toType.toUpperCase()) {
            case "C", "Celsius":
                return "" + (number - 273.15);
            case "F", "Fahrenheit":
                return "" + ((number - 273.15) * 9 / 5 + 32);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из Фаренгейтов
    public String convertTemperature(float number, String toType){
        switch (toType.toUpperCase()) {
            case "C", "Celsius":
                return "" + ((number - 32) * 5 / 9);
            case "K", "Kelvin":
                return "" + ((number - 32) * 5 / 9 + 273.15);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из Килограмм
    public String convertWeight(double weight, String toType){
        switch (toType.toLowerCase()) {
            case "gm", "gram":
                return "" + (weight * 1000);
            case "mgm", "milligram":
                return "" + (weight * 1000000);
            case "t", "ton":
                return "" + (weight * 0.001);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из Тонн
    public String convertWeight(float weight, String toType){
        switch (toType.toLowerCase()) {
            case "gm", "gram":
                return "" + (weight * 1000000);
            case "mgm", "milligram":
                return "" + (weight * 1000000000);
            case "kg", "kilogram":
                return "" + (weight * 1000);
            default:
                return "Error: invalid type";
        }
    }

    // Перевод из Грамм
    public String convertWeight(int weight, String toType){
        switch (toType.toLowerCase()) {
            case "mgm", "milligram":
                return "" + (weight * 1000);
            case "kg", "kilogram":
                return "" + (weight * 0.001);
            case "t", "ton":
                return "" + (weight * 0.000001);
            default:
                return "Error: invalid type";
        }
    }

}
