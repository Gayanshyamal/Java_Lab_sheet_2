import java.util.Scanner;

public class Q1_a {
   public static void main(String[] args) {
       int A,B,C;

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your A No:");
       A = scanner.nextInt();

       System.out.print("Enter your B No:");
       B = scanner.nextInt();

       System.out.print("Enter your C No:");
       C = scanner.nextInt();

       System.out.println(Math.sqrt((Math.pow(B,2)) + 4*A*C));
    }
}