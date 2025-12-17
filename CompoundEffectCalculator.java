import java.util.Scanner;

public class CompoundEffectCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Enter the number of times the interest is compounded per year: ");
        int compoundingFrequency = scanner.nextInt();

        System.out.print("Enter the total number of years: ");
        int years = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Compute the compound effect
        double ratePerPeriod = annualRate / 100 / compoundingFrequency;
        int totalPeriods = compoundingFrequency * years;
        double amount = principal * Math.pow((1 + ratePerPeriod), totalPeriods);

        // Print the result
        System.out.printf("The total amount after %d years is: %.2f%n", years, amount);
    }
}