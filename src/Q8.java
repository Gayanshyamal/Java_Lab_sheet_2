import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        double v,r;
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your radius");
        r = scanner.nextDouble();

        v = ((double) 4 /3) * (PI * Math.pow(r,3));

        System.out.println("Sphere volume is "+v);

    }
}
