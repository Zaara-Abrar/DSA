class Solution {
    public int findPairs(int[] nums, int k) {
        // int i=0;
        // int count=0, diff=0;
        // for(){
        //     diff=i-j;
        //     diff= 0-diff;
        //     if(diff>-1 && diff==k){
        //         count++;
        //         j--;
        //     }
        // }
        // return count;

        Arrays.sort(nums);
        int low=0, high=1;
        int count=0;
        int sum= Integer.MIN_VALUE;
        while(high<nums.length && low<nums.length-1)
        {
            if((nums[high]-nums[low]==k) && (nums[high]+nums[low]!=sum))
            {
                sum=nums[high]+nums[low];
                count++;
                high++;
                low++;
            }
            else if(nums[high]-nums[low]<k)
            {
                high++;
            }
            else
            {
                low++;
            }
            if(low==high){
                high++;
            }
        }
        return count;
    }
}