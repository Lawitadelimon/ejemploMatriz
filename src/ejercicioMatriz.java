     public class ejercicioMatriz {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] matrixA = {
                {2, 1, 5},
                {2, 10, 5},
                {3, 1, 4}
        };
        int[][] matrixB = {
                {8, 7, 1},
                {4, 2, 7},
                {2, 3, 5}
        };

  
        System.out.println("Multiplicación de matrices:");
        int[][] multiplyResult = multiplyMatrices(matrixA, matrixB);
        printMatrix(multiplyResult);
    }
}
 
    

