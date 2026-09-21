class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> putting = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (putting.containsKey(nums[i]))
                return true;
            putting.put(nums[i], nums[i]);
        }
        return false;
    }
}