    public class MatrixMultiplication {

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length; // number of columns in A
        int rowsB = matrixB.length;    // number of rows in B
        int colsB = matrixB[0].length; // number of columns in B

        // 1. Validate if multiplication is mathematically possible
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions are incompatible: " + 
                "Columns of A (" + colsA + ") must match Rows of B (" + rowsB + ").");
        }

        // 2. Initialize the result matrix
        int[][] result = new int[rowsA][colsB];

        // 3. Perform standard triple-nested loop multiplication
        for (int i = 0; i < rowsA; i++) {         // Row of Matrix A
            for (int j = 0; j < colsB; j++) {     // Column of Matrix B
                for (int k = 0; k < colsA; k++) { // Dot product accumulator loop
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    // Helper method to print a matrix to the console
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example: Matrix A (2x3)
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Example: Matrix B (3x2)
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        try {
            int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
            System.out.println("Resulting Matrix:");
            printMatrix(resultMatrix);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}