class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int l=0;
       int h=matrix.length-1;
       int m=0;
       int n=matrix[0].length-1;
       while(l<=h)
       {
        m=l+(h-l)/2;
        if(matrix[m][0]<=target && matrix[m][n]>=target)
        {
            return Binarysearch(matrix[m],target);
        }
        else if(matrix[m][0]>target)
        h=m-1;
        else if(matrix[m][n]<=target)
        l=m+1;

       } 
       
        return false;
    }
    public boolean Binarysearch(int ar[], int target)
    {
        int s=0;
        int l=ar.length-1;
        int m=0;
        while(s<=l)
        {
            m=s+(l-s)/2;
            if(ar[m]==target)
            return true;
            else if(ar[m]>target)
            l=m-1;
            else
            s=m+1;
        }
        return false;
    }
}