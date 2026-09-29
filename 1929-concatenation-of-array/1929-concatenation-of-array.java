class Solution {
    public int[] getConcatenation(int[] nums){
        int[] arr= new int[nums.length*2];
        int j=0;
        for(int i=0;j<nums.length*2;j++){
            arr[j]=nums[i];
            if(i==nums.length-1){
                i=0;
            }
            else i++;
        }
        return arr;
    }
}