import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double c,temp2,temp,inch;
        int feet;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length in cm:");
        c = scanner.nextDouble();

        temp = (int) (c / 2.54);
        temp2 =c % 2.54;
        temp2 = temp2 / 2.54;

        feet = (int)temp / 12;
        inch = (temp % 12) + temp2 ;

        System.out.println(feet + " feet "+inch+" inches");

    }
}
