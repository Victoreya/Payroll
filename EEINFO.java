// public class EEINFO {

// }

import java.util.Scanner;

public class PayCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter rate of pay: ");
        double rateOfPay = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        scanner.close();

        double grossPay;
        double overtimeHours = 0;
        if (hoursWorked <= 40) {
            grossPay = hoursWorked * rateOfPay;
        } else {
            overtimeHours = hoursWorked - 40;
            grossPay = (40 * rateOfPay) + (overtimeHours * (rateOfPay * 1.5));
        }

        double federalTaxRate = 0.15;
        double stateTaxRate = 0.0307;
        double medicareRate = 0.0145;
        double socialSecurityRate = 0.062;
        double unemploymentInsuranceRate = 0.0007;

        double federalTaxAmount = federalTaxRate * grossPay;
        double stateTaxAmount = stateTaxRate * grossPay;
        double medicareAmount = medicareRate * grossPay;
        double socialSecurityAmount = socialSecurityRate * grossPay;
        double unemploymentInsuranceAmount = unemploymentInsuranceRate * grossPay;

        double totalDeductions = federalTaxAmount + stateTaxAmount + medicareAmount + socialSecurityAmount
                + unemploymentInsuranceAmount;

        double netPay = grossPay - totalDeductions;

        System.out.println("\nPayroll Summary for " + employeeName);
        System.out.println("Rate of Pay: $" + String.format("%.2f", rateOfPay));
        System.out.println("Hours Worked: " + hoursWorked + " hours");
        System.out.println("Gross Pay: $" + String.format("%.2f", grossPay));
        System.out.println("Total Deductions: $" + String.format("%.2f", totalDeductions));
        System.out.println("Net Pay: $" + String.format("%.2f", netPay));

        System.out.println("\n-------------------------------------------");
        System.out.println("Name of program: PayCalculator");
        System.out.println("Author Name: [Victoreya Maravilla]");
        System.out.println("ID Number: [307]");
        System.out.println("Instructor's Name: [Chintan Thakkar]");
        System.out.println("Date Submitted: Infinite");
    }
}
