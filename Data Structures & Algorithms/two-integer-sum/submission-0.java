class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> array_map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int neededNumber = target - nums[i];
            if (array_map.containsKey(neededNumber)) {
                int map_index = array_map.get(neededNumber);
                return new int[] {map_index, i};
            }
            array_map.put(nums[i], i);
        }
        return new int[]{};
    }
}
