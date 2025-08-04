class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int W=0,B=0;
                if(grid[i][j]=='W')
                    W++;

                else
                    B++;
                
                if(grid[i][j+1]=='W')
                    W++;
                else{
                    B++;
                }
                if(grid[i+1][j]=='W') W++;
                else
                B++;
                if(grid[i+1][j+1]=='W') W++;
                else
                B++;
                if(Math.max(W,B)>=3) return true;
            }
        }
        return false;
    }
}