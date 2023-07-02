//https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        //the below solution works or 168 out of 170 test cases.
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    for(int a=0;a<row;a++){
                       if(matrix[a][j]!=0){
                          matrix[a][j]=-1;}
                    }
                    for(int b=0;b<col;b++){
                       if(matrix[i][b]!=0){
                          matrix[i][b]=-1;}
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}