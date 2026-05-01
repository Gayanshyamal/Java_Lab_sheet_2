import java.util.Scanner;

public class Q1_c {
    public static void main(String[] args) {
        int X,Y,Z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your X No:");
        X = scanner.nextInt();

        System.out.print("Enter your Y No:");
        Y = scanner.nextInt();

        Z = X*Y;

        System.out.println(Math.cbrt(Z));
    }
}
