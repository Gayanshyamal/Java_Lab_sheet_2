import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        double P,R,N;
        double finalAmount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How money are you invest($): ");
        P = scanner.nextDouble();
        System.out.print("What is your interest: ");
        R = scanner.nextDouble();
        System.out.print("How many year are you grow this invest: ");
        N = scanner.nextDouble();

        finalAmount= P*(Math.pow((1 + (R / 100)),N));

        System.out.println("Your earning amount is " +finalAmount);



    }
}
