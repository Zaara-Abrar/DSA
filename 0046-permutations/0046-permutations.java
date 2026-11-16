class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> templist, int[] nums) {
        if (templist.size() == nums.length) {
            res.add(new ArrayList<>(templist)); // copy, not the same list
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (templist.contains(nums[i])) continue; // already used

                templist.add(nums[i]);
                backtrack(res, templist, nums);
                templist.remove(templist.size() - 1);     // backtrack
            }
        }
    }
}