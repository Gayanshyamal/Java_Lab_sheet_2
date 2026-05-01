import java.util.Scanner;

public class Q1_d {
    public static void main(String[] args) {

        double r;
        final double PI = (double) 22 /7;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your radiance of circle:");
        r = scanner.nextInt();

        System.out.println("Area of circle is " + (2*PI*r));

    }
}
