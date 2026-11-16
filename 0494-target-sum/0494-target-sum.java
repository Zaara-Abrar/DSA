class Solution {

    int[] nums; int target;
    Map<String, Integer> memo= new HashMap<>();
    public int findTargetSumWays(int[] nums, int target) {
        this.nums= nums; this.target= target;
        return dfs(0,0);
    }
    private int dfs(int i, int total){
        if(i==nums.length) return total== target? 1:0;
        String key= i+ ","+ total;
        if(memo.containsKey(key)) return memo.get(key);
        int ways= dfs(i+1, total+nums[i]) + dfs(i+1, total-nums[i]);
        memo.put(key, ways);
        return ways;
    }
}