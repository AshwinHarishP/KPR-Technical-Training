class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hmap = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++){
            int k = target - nums[i];

            if (hmap.containsKey(k)){
                return new int[]{hmap.get(k), i};
            }
            else{
                hmap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
