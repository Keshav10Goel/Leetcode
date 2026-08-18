class Solution {
    public int hammingWeight(int n) {
        int x=1;
        int c=0;
        while(n>0)
        {
            c+=(n&x);
            n=n>>1;
        }
        return c;
    }
}