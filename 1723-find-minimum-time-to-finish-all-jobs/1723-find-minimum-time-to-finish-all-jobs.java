class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        int n = jobs.length;
        if (k >= n) return jobs[n - 1];
        min = Integer.MAX_VALUE;
        dfs(jobs, n - 1, new int[k]);
        return min;
    }

    int min;
    
    private void dfs(int[] jobs, int i, int[] curMax) {
        if (i == -1) {
            int max = findMax(curMax);
            min = Math.min(min, max);
            return;
        }
        
        if (findMax(curMax) >= min) return;
        
        Set<Integer> visited = new HashSet<>();
        
        for(int j = 0; j < curMax.length; j ++) {
            if (visited.contains(curMax[j])) continue;
            visited.add(curMax[j]);
            curMax[j] += jobs[i];
            dfs(jobs, i - 1, curMax);
            curMax[j] -= jobs[i];
        }
    }
    
    private int findMax(int[] curMax) {
        int max = 0;
        
        for(int i : curMax) max = Math.max(max, i);
        
        return max;
    }
}