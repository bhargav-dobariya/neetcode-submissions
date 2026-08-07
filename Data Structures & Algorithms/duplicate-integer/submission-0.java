class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> uniqueVal = new HashSet<>();
        for(int i=0;i<n;i++){
            uniqueVal.add(nums[i]);
        }
        return uniqueVal.size() != n; 
    }
}