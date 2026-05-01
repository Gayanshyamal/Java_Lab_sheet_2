import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        double celsius,fahrenheit,temp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your temperature in Fahrenheit:");
        fahrenheit = scanner.nextDouble();

        temp = (double) 5 / 9 ;

        celsius = temp * (fahrenheit - 32);

        System.out.println("Temperature is "+celsius+" Celsius.");
    }
}
