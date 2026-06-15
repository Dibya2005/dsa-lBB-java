import java.util.Scanner;

public class WavePrintMatrix {

    // Function to print matrix in wave form
    public static void wavePrint(int[][] matrix, int rows, int cols) {
        if (matrix == null || rows <= 0 || cols <= 0) {
            System.out.println("Invalid matrix dimensions.");
            return;
        }

        for (int col = 0; col < cols; col++) {
            if (col % 2 == 0) {
                // Even column → top to bottom
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col] + " ");
                }
            } else {
                // Odd column → bottom to top
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input matrix dimensions
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            if (rows <= 0 || cols <= 0) {
                System.out.println("Rows and columns must be positive integers.");
                return;
            }

            int[][] matrix = new int[rows][cols];

            // Input matrix elements
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Print matrix in wave form
            System.out.println("Wave form of the matrix:");
            wavePrint(matrix, rows, cols);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
