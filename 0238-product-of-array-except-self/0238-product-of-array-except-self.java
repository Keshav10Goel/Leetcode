class Solution {
    public int[] productExceptSelf(int[] nums) {
        int r[]=new int[nums.length];
        int answer[]=new int[nums.length];
        int l=1;
        r[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>0;i--)
        {
            r[i]=r[i+1]*nums[i];
        }
        
        for(int i=0;i<nums.length-1;i++)
        {
            int p=l*r[i+1];
            l=l*nums[i];
            answer[i]=p;
        }
        answer[nums.length-1]=l;
        return answer;
    }
}