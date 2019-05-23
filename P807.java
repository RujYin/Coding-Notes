class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int sum=0;
        int[] row=new int[grid.length];
        int[] col=new int[grid.length];
        int rowm=0;
        int colm=0;
        for(int j=0;j<grid.length;j++){
            for(int i=0;i<grid.length;i++){
            if(i==0){
                rowm=grid[j][0];
                colm=grid[0][j];
            } 
            else{
                if(rowm<grid[j][i]){
                    rowm=grid[j][i];
                }
                if(colm<grid[i][j]){
                    colm=grid[i][j];
                }
                    
            }
        }
        row[j]=rowm;
        col[j]=colm;
        }
        for(int j=0;j<grid.length;j++){
            for(int i=0;i<grid.length;i++){
                sum+=Math.min(row[j],col[i])-grid[j][i];
            }
        }
        
        return sum;
        
        
    }
}