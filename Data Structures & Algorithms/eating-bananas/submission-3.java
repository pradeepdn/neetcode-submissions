class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        
        int left = 1;
        int right = piles[piles.length-1];
        while(left < right){
            int mid = left + (right - left)/2;
            int hours = 0;
            for(int pile:piles){
                hours += (pile + mid - 1) / mid;
                //hours += (int) Math.ceil((double) pile / mid);
            }
            if(hours > h){
                left = mid+1;
            }
            if(hours <= h){
                right = mid;
            }
        }
     return left;   
    }
}

