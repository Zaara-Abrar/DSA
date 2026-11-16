class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }

     void backtrack(List<List<Integer>> res, List<Integer> templist, int[] nums, int start) {
        res.add(new ArrayList<>(templist)); // save the current group

        for (int i = start; i < nums.length; i++) {
            templist.add(nums[i]);                 // choose
            backtrack(res, templist, nums, i + 1); // explore
            templist.remove(templist.size() - 1);  // undo (backtrack)
        }
    }
}