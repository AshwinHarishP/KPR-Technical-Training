class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] output = new int[k];
      
        int prefixMod = 0;
        int res = 0;
        output[0] = 1;
        for(int i = 0; i < nums.length; i++){
            prefixMod = (prefixMod + nums[i] % k + k) % k;
            res = res + output[prefixMod];
            output[prefixMod]++;
        }
        return res;
    }
}
