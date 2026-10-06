class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lp[]=new int[nums.length];lp[0]=1;
        int rp[]=new int[nums.length];rp[nums.length-1]=1;
        int ans[]=new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            lp[i]=lp[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]=r*lp[i];
            r*=nums[i];
        }
        
        return ans;
    }
}