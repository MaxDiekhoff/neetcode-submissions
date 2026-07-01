class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> elementsAlreadyHandled = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complementValue = target - nums[i];
            Integer complementIndex = elementsAlreadyHandled.get(complementValue);
            if(complementIndex != null){
                int[] solution = {complementIndex, i};
                return solution;
            }
            elementsAlreadyHandled.put(nums[i], i);
        }
        return null;
    }
}
