class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        boolean firstrow=false;
        boolean firstcol=false;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    if(i==0) firstrow=true;
                    if(j==0) firstcol=true;
                    mat[0][j]=0;
                    mat[i][0]=0;
                }
            }
        }
            for(int i=1;i<mat.length;i++){
                for(int j=1;j<mat[0].length;j++){
                    if(mat[i][0]==0||mat[0][j]==0){
                        mat[i][j]=0;
                    }
                }
            }
            if(firstrow){
                for(int j=0;j<mat[0].length;j++){
                    mat[0][j]=0;
                }
            }
            if(firstcol){
                for(int i=0;i<mat.length;i++){
                    mat[i][0]=0;
                }
            }
        }
    }
