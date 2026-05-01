import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        int year,age,temp = 2026;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your born year:");
        year = scanner.nextInt();

        age = temp - year;

        System.out.println("You were born in "+year+" and will be (are) "+age+" this year.");


    }
}
