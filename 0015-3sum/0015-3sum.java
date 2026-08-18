class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List <List<Integer>> a= new ArrayList<>();
        if(nums.length<=2)
        return a;
        int i=0;
        int j=i+1;
        int k=nums.length-1;
        Arrays.sort(nums);
        for(i=0;i<nums.length-2;i++)
        {   
            if(i>0 && nums[i]==nums[i-1])
            continue;
            if(nums[i]>0)
            break;
            j=i+1;
            k=nums.length-1;
            
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k]==0)
                {
                    List<Integer> b= new ArrayList<>();
                    b.add(nums[i]);
                    b.add(nums[j]);
                    b.add(nums[k]);
                    a.add(b);
                    
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                j++;
                while(j<k && nums[k]==nums[k+1])
                k--;
                }
                
                else if(nums[i]+nums[j]+nums[k]<0)
                j++;
                else
                k--;
            }
            
        }
        return a;
    }
}