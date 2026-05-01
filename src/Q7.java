import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        int weight,height;
        double BMI,temp;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms:");
        weight = scanner.nextInt();
        System.out.print("Enter your height in centimeters:");
        height = scanner.nextInt();

        temp = (double) height / 100;
        BMI = weight / (Math.pow(temp,2));

        System.out.println("Your BMI value is "+BMI);
    }
}
