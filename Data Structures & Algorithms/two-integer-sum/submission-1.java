class Solution {
    public int[] twoSum(int[] nums, int target) {
        int current = 0;
        int next = 0;
        for(int i = 0; i<nums.length; i++){
            current = nums[i];
            for(int j = i+1; j<nums.length; j++){
                next = nums[j];
                if(current + next == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
