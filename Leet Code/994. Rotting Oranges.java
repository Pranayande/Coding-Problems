class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<pair> q=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));
                    vis[i][j]=true;
                }
            }
        }
        int count=0;
        while(!q.isEmpty()){
            pair current=q.remove();
            int[] del_row={-1,0,1,0};
            int[] del_col={0,-1,0,1};
            for(int i=0;i<4;i++){
                int new_row=del_row[i]+current.row;
                int new_col=del_col[i]+current.col;
                if(new_row>=0 && new_row<n && new_col>=0 && new_col<m 
                && vis[new_row][new_col]!=true && grid[new_row][new_col]==1){
                    q.add(new pair(new_row,new_col,current.time+1));
                    count=Math.max(current.time+1,count);
                    vis[new_row][new_col]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 &&vis[i][j]!=true){
                    return -1;
                }
            }
        }
        return count;
    }
}
class pair{
    int row;
    int col;
    int time;
    public pair(int row,int col,int time){
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
