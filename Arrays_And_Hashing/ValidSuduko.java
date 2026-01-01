import java.util.HashSet;
public class ValidSuduko {
    public boolean ValidSudukoOrNot(char martix[][]){
                @SuppressWarnings("unchecked")

        HashSet<Character>[] rows = new HashSet[9];
        @SuppressWarnings("unchecked")
        HashSet<Character>[] cols = new HashSet[9];
                @SuppressWarnings("unchecked")

        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char val = martix[r][c];
                if(val=='.') continue;

                if(rows[r].contains(val)) return false;
                rows[r].add(val);

                if(cols[c].contains(val)) return false;
                cols[c].add(val);

                int boxIndex = (r/3)*3 + (c/3);
                if(boxes[boxIndex].contains(val)) return false;
                boxes[boxIndex].add(val);
            }
        }
        return true;          
    }    
}  
// “This code checks whether a Sudoku board is valid. We use three arrays of HashSets to track numbers in each 
// row, each column, and each 3×3 box. While traversing the board, we skip empty cells represented by a dot (.). 
// For every number, we check if it already exists in the same row, column, or box. If it does, the Sudoku is
//  invalid and we return false. If no duplicates are found, we return true. Since the board size is fixed at 9×9,
//   the time and space complexity are O(1).”