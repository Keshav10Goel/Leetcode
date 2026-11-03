class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int n:nums)
        {
            if(n>m)
            m=n;
        }
        int k=0;
        for(int n:nums)
        k+=m-n;
        return k;
    }
}