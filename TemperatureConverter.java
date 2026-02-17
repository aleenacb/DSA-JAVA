import java.util.InputMismatchException;//imported to handle invalid input types
import java.util.Scanner;//To read user input
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = 0;
        boolean validInput = false;//To control validation loop
        //While loop runs until valid numeric temperature is entered
        while(!validInput) {
            try {
                System.out.println("Enter the temperature value :");
                temperature = sc.nextDouble();//To read the temperature
                validInput = true;
                //If the input is not a valid double, an InputMismatchException is caught
            } catch(InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value of temperature:");
                sc.next();//To read new temperature
            }
        }
        //Char varaible unit is used to initialized to store the temperature unit
        char unit = ' ';
        boolean validUnit = false;//To control validation unit loop
        //While loop runs until valid temperature unit is entered
        while (!validUnit) {
            System.out.println("Enter the unit of temperature (c for celsius, F for Fahrenheit): ");
            unit = sc.next().charAt(0);//Method used by scanner to read first character of the input
            if (unit == 'C' || unit == 'c' || unit == 'F' || unit == 'f') {
                validUnit = true;
            } else {
                System.out.println("Invalid unit. Please enter 'C' for celsius or 'F' for Fahrenheit.");
            }
            }
            if (unit == 'C' || unit == 'c') {
                double Fahrenheit = (temperature * 9/5) + 32;
                System.out.println(temperature + " *c is equal to " + Fahrenheit + "*F"); 
            } else if(unit == 'F' || unit == 'f') {
                double celsius = (temperature - 32) * 5/9;
                System.out.println(temperature + "*F is equal to " + celsius + "c");
            }
            sc.close();
        }
    }
