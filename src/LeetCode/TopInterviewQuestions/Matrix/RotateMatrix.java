package LeetCode.TopInterviewQuestions.Matrix;

public class RotateMatrix {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose of matrix
        for (int row = 0; row < n; row++) {
            for (int column = row; column < n; column++) { //Insight starting point for column is when column=row
                int temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix[column][row] = temp;

            }
        }
            //reverse of each row of matrix
            for (int row = 0; row < n; row++) {
                int left = 0;
                int right = n - 1;
                while (left < right) {
                    int temp = matrix[row][left];
                    matrix[row][left] = matrix[row][right];
                    matrix[row][right] = temp;
                    left++;
                    right--;
                }
            }
        }
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4, 5},
                {5, 9, 6, 3},
                {2, 3, 6, 7},
                {5, 9, 3, 6}

        };
        System.out.println("Original matrix: ");
        printMatrix(matrix);
        rotate(matrix);

        System.out.println("After rotation: ");
        printMatrix(matrix);
    }

        //Helper method to print matrix
        private static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

