import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double weight,calories;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight:");
        weight = scanner.nextDouble();

        calories = weight * 19;

        System.out.println("You need "+calories+" calories for  per day.");
    }
}
