package LeetCode.TopInterviewQuestions.Matrix;

import java.util.HashSet;

public class ValidSoduku {
    public boolean isValidSoduku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char num = board[row][column];

                if (num != '.') { //check null values

                    //check row
                    if(!set.add(num + "in row" + row)){
                        return false;
                    }

                    //check column
                    if(!set.add(num + "in column" + column)){
                        return false;
                    }

                    //check 3*3 box
                    int boxRow = row/3;
                    int boxColumn = column/3;

                    if (!set.add(num + "in boxRow" + boxRow + "-" + boxColumn)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidSoduku validator = new ValidSoduku();

        //Valid board
       /* char[][] board1 = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };*/

        //Invalid board
        char[][] board2 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '7', '7', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        //System.out.println(validator.isValidSoduku(board1));
        System.out.println(validator.isValidSoduku(board2));
    }
}
