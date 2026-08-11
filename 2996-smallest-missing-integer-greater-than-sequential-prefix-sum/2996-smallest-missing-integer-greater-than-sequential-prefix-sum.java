class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1)
        return (nums[0]+1);
        int s=nums[0];
        int max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                s+=nums[i];
            }
            else 
            break;
        }
       HashSet<Integer> set= new HashSet<>();
       for(int x:nums)
            set.add(x);
        while(set.contains(s))
            s++;
        return s;
       
    }
}