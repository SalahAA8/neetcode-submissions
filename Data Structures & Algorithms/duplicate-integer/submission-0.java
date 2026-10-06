class Solution {
    public boolean hasDuplicate(int[] nums) {
        int currentNum = 0;
        int nextNum = 0;
        for(int i = 0; i<nums.length; i++){
            currentNum = nums[i];
            for (int j = i+1; j<nums.length; j++){
                nextNum = nums[j];
                if(currentNum == nextNum){
                    return true;
                }
            }
        }
        return false;
    }
}