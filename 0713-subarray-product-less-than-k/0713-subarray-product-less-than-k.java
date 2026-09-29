class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int i=0;
        int j=i;
        int prod=1;
        while(j<nums.length)
        {
            prod*= nums[j];
            while(prod>=k && i<=j){
               prod=prod/nums[i];
                i++;
            }
            count+= (j-i)+1;
            j++;
        }
        return count;
        
    }
}