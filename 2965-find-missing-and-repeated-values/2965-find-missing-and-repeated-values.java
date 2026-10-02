class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid[0].length;
        int ar[]=new int[n*n+1];
        ar[0]=-1;
        int ans[]=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[grid[i][j]]++;
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==2)
            ans[0]=i;
            else if(ar[i]==0)
            ans[1]=i;
        }
        return ans;
    }
}