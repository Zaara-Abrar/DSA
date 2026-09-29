class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i;
        int[] arr={-1,-1};
        if(nums.length==1 && nums[0]==target){
            arr[0]=0;
            arr[1]=0;
            return arr;
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }  
        }
        if(arr[0]==-1) return arr;
        for(int j=nums.length-1;j>i;j--){
            if(nums[j]==target){
                arr[1]=j;
                break;
            }
        }
        if(arr[0]!=-1 && arr[1]==-1) arr[1]=arr[0];
        return arr;
    }
}