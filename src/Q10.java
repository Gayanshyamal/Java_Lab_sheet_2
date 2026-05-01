import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        double monthlyInterestRate,annualInterestRate,loanAmount,totalPayment,monthlyPayment;
        int MONTHS_IN_YEAR = 12,numberOfPayments, loanPeriod;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Loan amount: ");
        loanAmount =scanner.nextDouble();
        System.out.println("Enter annuallyInterested: ");
        annualInterestRate = scanner.nextDouble();
        System.out.println("Enter your loan timeperiod: ");
        loanPeriod = scanner.nextInt();

        monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow( 1/(1 + monthlyInterestRate), numberOfPayments) );

        totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Your monthly payment is "+monthlyPayment);
        System.out.println("Your number of payment is "+numberOfPayments);
        System.out.println("Your monthly payment rate is "+monthlyInterestRate);
        System.out.println("Total payment is "+totalPayment);
    }
}
