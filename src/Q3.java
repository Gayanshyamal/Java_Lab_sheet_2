import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double celsius,fahrenheit;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your temperature in Celsius:");
        celsius = scanner.nextDouble();

        fahrenheit = (1.8 * celsius ) + 32;

        System.out.println("Temperature is " + fahrenheit+" Fahrenheit." );
    }
}
