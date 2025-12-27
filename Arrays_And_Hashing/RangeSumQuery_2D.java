public class RangeSumQuery_2D {
    private int[][] sumMat;
    public void RangeSumQuery_2D(int[][] matrix){
        int Rows = matrix.length, Cols = matrix[0].length;
        sumMat = new int[Rows+1][Cols+1];
        for(int r=0; r<Rows; r++){
            int prefix =0;
            for(int c=0; c<Cols; c++){
                prefix += matrix[r][c];
                int above = sumMat[r][c+1];
                sumMat[r+1][c+1] = prefix+above;
            }
        }
    }
    public int sumRegion(int row1,int col1,int row2,int col2){
        row1++; col1++; row2++; col2++;
        int BR = sumMat[row2][col2];
        int above = sumMat[row1-1][col2];
        int left = sumMat[row2][col1-1];
        int TL = sumMat[row1-1][col1-1];
        return BR-above-left+TL;
    }
 }

