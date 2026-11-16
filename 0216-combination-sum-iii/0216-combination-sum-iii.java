class Solution {
    private void helper(List<List<Integer>> res, List<Integer>curr,int target,int k,int currsum,int i){
        if(curr.size()==k && currsum == target){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(curr.size()>k||currsum>target||i>9) return;
        curr.add(i);
        helper(res,curr,target,k,currsum+i,i+1);
        curr.remove(curr.size()-1);
        helper(res,curr,target,k,currsum,i+1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),n,k,0,1);
        return res;
    }
}