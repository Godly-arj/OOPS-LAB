package matrix;
import java.util.Scanner;

public class matrixmulti {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1, r2, c1, c2;

        System.out.print("Enter the number of rows of Matrix A: ");
        r1 = sc.nextInt();
        System.out.print("Enter the number of columns of Matrix A: ");
        c1 = sc.nextInt();

        System.out.println("\n");

        System.out.print("Enter the number of rows of Matrix B: ");
        r2 = sc.nextInt();
        System.out.print("Enter the number of columns of Matrix B: ");
        c2 = sc.nextInt();

        System.out.println("\n");

        matrixmulti obj = new matrixmulti();

        System.out.println("Matrix A: \n");
        int matrixA[][] = obj.createMatrix(r1, c1, sc);
        obj.displayMatrix(matrixA, r1, c1);

        System.out.println("Matrix B: \n");
        int matrixB[][] = obj.createMatrix(r2, c2, sc);
        obj.displayMatrix(matrixB, r2, c2);

        int matrixC[][] = obj.multiply(matrixA, matrixB, r1, c1, r2, c2);

        if (matrixC == null) {
            System.out.println("Error multiplying.\n");
        } else {
            System.out.println("Resultant Matrix After Multiplication \n");
            obj.displayMatrix(matrixC, r1, c2);
        }
    }

    public int[][] createMatrix(int rows, int columns, Scanner sc) {
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the value of the " + (i + 1) + "*" + (j + 1) + "th element: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n\n");

        return matrix;
    }

    public boolean checkIfValid(int c1, int r2) {
        if (c1 == r2) {
            return true;
        }

        return false;
    }

    public void displayMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("\n\n");
        }
    }

    public int[][] multiply(int[][] matrixA, int[][] matrixB, int r1, int c1, int r2, int c2) {
        if (!checkIfValid(c1, r2)) {
            System.out.println("Number of rows of matrix B should be equal to number of columns of matrix A");
            System.out.println("Aborting");
            return null;
        }

        else {
            int[][] matrix = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    matrix[i][j] = 0;

                    for (int k = 0; k < c1; k++) {
                        matrix[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            return matrix;
        }
    }

}