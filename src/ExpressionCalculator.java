import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        double n = scanner.nextDouble();

        System.out.print("Enter the value of m: ");
        double m = scanner.nextDouble();

        // Variant 1: Input data of a valid type, result - of a valid type
        double result1 = (n + 1) / (Math.pow(n, 2 * m + 2)) + (m + n) * (m - n) + Math.pow(n, 3);
        System.out.println("Variant 1 Result: " + result1);

        // Variant 2: Input data integer type, the result is valid
        int nInt = (int) n;
        int mInt = (int) m;
        double result2 = (nInt + 1) / (Math.pow(nInt, 2 * mInt + 2)) + (mInt + nInt) * (mInt - nInt) + Math.pow(nInt, 3);
        System.out.println("Variant 2 Result: " + result2);

        // Variant 3: Input data of a valid type, the result is an integer
        int result3 = (int) ((n + 1) / (Math.pow(n, 2 * m + 2)) + (m + n) * (m - n) + Math.pow(n, 3));
        System.out.println("Variant 3 Result: " + result3);

        scanner.close();
    }
}
