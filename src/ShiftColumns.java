import java.util.Scanner;

public class ShiftColumns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмірність матриці (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Введіть елементи матриці (построково): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Знаходження стовпця з мінімальним елементом
        int minCol = 0;
        int minElement = matrix[0][0];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minCol = j;
                }
            }
        }

        // Створення нової матриці зі зсунутими стовпцями, щоб зробити мінімальний стовпець першим
        int[][] shiftedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                shiftedMatrix[i][j] = matrix[i][(j + n - minCol) % n];
            }
        }

        // Виведення матриці після зсуву стовпців
        System.out.println("Матриця після зсуву стовпців:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(shiftedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
