class Solution {
    public static int findmax(int[][] mat,int n,int col){
        int maxvalue = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>maxvalue){
                maxvalue=mat[i][col];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
       int n=mat.length;
       int m=mat[0].length;
       int low=0;
       int high=m-1;
       while(low<=high){
        int mid=(low+high)/2;
        int maxrows=findmax(mat,n,mid);
        int left=(mid-1 >= 0)?mat[maxrows][mid-1]:Integer.MIN_VALUE;
        int right=(mid+1 < m)?mat[maxrows][mid+1]:Integer.MIN_VALUE;
        int current = mat[maxrows][mid];
        if(mat[maxrows][mid]>left&&mat[maxrows][mid]>right){
            return new int[]{maxrows,mid};
        }
        else if(current<left){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return new int[]{-1,-1}; 
    }
}
