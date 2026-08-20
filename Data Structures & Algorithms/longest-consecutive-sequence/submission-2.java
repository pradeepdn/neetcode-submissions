class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0){
            return 0;
        }

        Set <Integer> num = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            num.add(nums[i]);
        }

        int currNum = nums[0];
        int maxLen = 1;
        
        for(int i=0; i<nums.length; i++){
            int currLeng = 1;
            if(!num.contains(nums[i]-1)){
                currNum = nums[i];
                while(num.contains(currNum+1)){
                    currNum = currNum+1;
                    currLeng++;
                }
                maxLen = Math.max(maxLen, currLeng);
            }
        }
    return maxLen;    
    }
}
