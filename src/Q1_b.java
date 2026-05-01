import java.util.Scanner;

public class Q1_b {
    public static void main(String[] args) {
        int X,Y;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your X No:");
        X = scanner.nextInt();

        System.out.print("Enter your Y No:");
        Y = scanner.nextInt();

        System.out.println(X + (4*(Math.pow(Y,3))));
    }
}
