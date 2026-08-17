import java.util.*;


public class Problem2_MatrixMultiplication {

    public static int[][] multiplyMatrices(int[][] A, int[][] B)
            throws MatrixMismatchException {

        int rowsA = A.length;
        int colsA = A[0].length;

        int rowsB = B.length;
        int colsB = B[0].length;

        // Check whether matrix multiplication is possible
        if (colsA != rowsB) {
            throw new MatrixMismatchException(
                "Matrix multiplication not possible: " +
                "columns of A must equal rows of B."
            );
        }

        // Result matrix
        int[][] result = new int[rowsA][colsB];

        // Matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}

    