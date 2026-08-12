class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int a = 0;

        for (int r = 0; r < nums.length; r++) {

            int freq = map.getOrDefault(nums[r], 0) + 1;
            map.put(nums[r], freq);

            while (map.get(nums[r]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }

            a = Math.max(a, r-l+1);
        }

        return a;
    }
}