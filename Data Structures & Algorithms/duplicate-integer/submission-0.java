class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> elementsAlreadyHandled = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer searchedElement = elementsAlreadyHandled.get(nums[i]);
            if(searchedElement != null) return true;
            elementsAlreadyHandled.put(nums[i], i);
        }
        return false;
    }
}