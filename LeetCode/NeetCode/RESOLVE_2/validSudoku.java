import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row<9; row++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0; i<9; i++) {
                if(board[row][i] == '.') continue;
                if(set.contains(board[row][i])) return false;
                set.add(board[row][i]);
            }
        }

        for (int col = 0; col<9; col++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0; i<9; i++) {
                if(board[i][col] == '.') continue;
                if(set.contains(board[i][col])) return false;
                set.add(board[i][col]);
            }
        }
        for (int start = 0; start<9; start++){
            HashSet<Character> set = new HashSet<>();
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++){
                    int row = (start / 3)*3 + i;
                    int col = (start % 3)*3 + j;

                    if(board[row][col] == '.') continue;
                    if(set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}


public class validSudoku {

    public static void main (String args [] ) {
        char borad [] [] = 
                            {{'1','2','.','.','3','.','.','.','.'},
                            {'4','.','.','5','.','.','.','.','.'},
                            {'.','9','8','.','.','.','.','.','3'},
                            {'5','.','.','.','6','.','.','.','4'},
                            {'.','.','.','8','.','3','.','.','5'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','.','.','.','.','.','2','.','.'},
                            {'.','.','.','4','1','9','.','.','8'},
                            {'.','.','.','.','8','.','.','7','9'}};

        Solution obj = new Solution();

        System.out.println(obj.isValidSudoku(borad));
    }
}