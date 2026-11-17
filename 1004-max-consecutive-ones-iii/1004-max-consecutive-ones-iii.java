class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxC=k;
        int count=0;

        while(j<nums.length-1) {
            
            while(j<nums.length) {
                if(k==0 && nums[j]==0) {
                    break;
                }
                if(nums[j]==0 && k>0) {
                    k-=1;
                }
                j+=1;
                count+=1;
            }

            maxC = Math.max(maxC, count);

            //remove

            while(i<nums.length && nums[i]==1) {
                i+=1;
                count-=1;
            }
            if((i+1)<nums.length && i<=j) {
                i+=1;
                count-=1;
                k+=1;
            }
        }
        if(nums.length==1 && nums[i]==1) {
            return 1;
        }

        return maxC;
    }
}