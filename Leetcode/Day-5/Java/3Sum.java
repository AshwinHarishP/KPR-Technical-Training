class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet <List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            HashSet <Integer> hmap = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++){
                int k = -(nums[i] + nums[j]);
                
                if (hmap.contains(k)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    Collections.sort(temp);
                    res.add(temp);
                }
                hmap.add(nums[j]);
            }
        }
        System.out.println(res);
        int [] a = {2};
        return a;
    }   
    
}
