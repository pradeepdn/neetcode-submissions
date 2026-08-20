class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        while(left < right){
            int currMax = 0;
            if(heights[left]<heights[right]){
                currMax = heights[left]*(right-left);
                left++;
            }else {
                currMax = heights[right]*(right-left);
                right--;
            }
            max = Math.max(max, currMax);
        }
        return max;
    }
}
