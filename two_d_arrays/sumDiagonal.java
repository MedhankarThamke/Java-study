package two_d_arrays;

public class sumDiagonal {
    // public static int diagonalSum(int matrix[][]) {
    // int primaryDiagonal = 0;
    // int secondaryDiagonal = 0;
    // for (int i = 0; i <= matrix.length - 1; i++) {
    // primaryDiagonal += matrix[i][i];
    // }
    // int matrixLength = matrix.length;
    // for (int j = 0; j <= matrix.length - 1; j++) {

    // secondaryDiagonal += matrix[j][matrixLength - 1];
    // matrixLength--;
    // }
    // return primaryDiagonal + secondaryDiagonal;

    // }
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                // sd
                sum += matrix[i][matrix.length - i - 1];
            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int sum = diagonalSum(matrix);
        System.out.println("the sum of the diagonals of the matrix is " + sum);
    }
}
