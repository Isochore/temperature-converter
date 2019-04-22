import java.util.*;
public class TemperatureConverter
{
    public static void main(String []args)
    {
        System.out.println("Saisissez l'unité d'entrée (c pour celsius, f pour fahrenheit et k pour kelvin)");
        char choice = 'c';
        double temperature = 25.0;

        printResult(choice, temperature);
    }

    public static double round(double number, int power) 
    {
        return (double) ( (int) (number * Math.pow(10, power) + .5)) / Math.pow(10, power);
    } 

    public static double getCelsius(double aTemperature, char choice)
    {
        return choice == 'f' ? round((((aTemperature - 32.0) * 5.0) / 9.0), 1) : round((aTemperature - 273.15), 1);
    }
    
    public static double getFahrenheit(double aTemperature, char choice)
    {
        return choice == 'c' ? round((aTemperature * (9.0/5.0) + 32.0), 1) : round(((aTemperature - 273.15) * (9.0/5.0) + 32.0), 1);
    }

    public static double getKelvin(double aTemperature, char choice)
    {
        return choice == 'c' ? round((273.15 + aTemperature), 1) : round(((aTemperature - 32) * 5/9 + 273.15), 1);
    }

    public static void printResult(char choice, double temperature)
    {

        switch(choice) {
        case 'c':
            System.out.println(getFahrenheit(temperature, choice) + " degrés fahrenheit ");
            System.out.println(getKelvin(temperature, choice) + " degrés kelvin ");
            break;
        case 'f':
            System.out.println(getCelsius(temperature, choice) + " degrés celsius ");
            System.out.println(getKelvin(temperature, choice) + " degrés kelvin ");
            break;
        default:
            System.out.println(getCelsius(temperature, choice) + " degrés celsius ");
            System.out.println(getFahrenheit(temperature, choice) + " degrés fahrenheit ");
        }
    }
}