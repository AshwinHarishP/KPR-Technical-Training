class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1, maxi = 0;

        while(i < j){
            maxi = Math.max(maxi, (j-i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i += 1;
            else j -= 1;   
        }

        return maxi;
    }
}
