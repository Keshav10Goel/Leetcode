class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
            int x=i;
            int y=x+1;
            int z=nums.length-1;
            while(y<z)
            {
                if((nums[x]+nums[y]+nums[z])==0)
                {
                    List <Integer> a= new ArrayList<>();
                    a.add(nums[x]);
                    a.add(nums[y]);
                    a.add(nums[z]);
                    arr.add(a);
                    y++;
                    z--;
                    while(y<z && nums[y]==nums[y-1])
                    y++;
                    while(y<z && nums[z]==nums[z+1]&& z<nums.length-1)
                    z--;
                }
                else if((nums[x]+nums[y]+nums[z])<0)
                y++;
                else
                z--;
            }
            
        }
        return arr;
    }
}