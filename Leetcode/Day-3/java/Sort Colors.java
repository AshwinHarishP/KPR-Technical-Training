class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while (mid <= high){
            if (nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low += 1;
                mid += 1;
            }

            else if (nums[mid] == 1){
                mid += 1;
            }

            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high -= 1;
            }
        }
    }
}
