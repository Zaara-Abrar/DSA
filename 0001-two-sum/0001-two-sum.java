class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices= new int[2];
        int i=0, j=0, k=0;
        for(i=0;i<nums.length;i++)
        {
            for (j=(i+1);j< nums.length;j++)
            {
                if(nums[i]+nums[j]==target){
                    indices[0]=i;
                    indices[1]=j;
                }
            }
        }
        // int start=0, end=nums.length-1;
        // int mid= (start+end)/2, sum=0;
        // while(start<end){
        //     sum= nums[start]+nums[end];
        //     if(sum==target){
        //         indices[0]= start;
        //         indices[1]= end;
        //     }
        //     else if(sum>target) end=mid-1;
        //     else if(sum<target) start= mid+1;
        //     mid= (start+end)/2;
        //     sum=0;
        // }
        return indices;
        }
    }
