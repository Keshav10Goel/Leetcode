class Solution {
    public int pivotIndex(int[] nums) {
        int ss[]=new int[nums.length];
        ss[nums.length-1]=nums[nums.length-1];
        for (int i=nums.length-2;i>0;i--)
        {
            ss[i]=ss[i+1]+nums[i];
        }
        int ps=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(ps==ss[i+1])
            return i;
            ps+=nums[i];
        }
        if(ps==0)
        return nums.length-1;
        return -1;
    }
}