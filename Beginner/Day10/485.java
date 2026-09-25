class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxim=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxim=Math.max(maxim,count);
            } else{
                count=0;
            }
           
        } 
        return maxim;
    }
}
