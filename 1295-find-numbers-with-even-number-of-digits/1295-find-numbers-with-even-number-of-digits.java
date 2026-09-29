class Solution {
    public int findNumbers(int[] nums) {
        int count=0, even=0;
        for(int i=0;i<nums.length;i++){
            int temp= nums[i];
            while(temp!=0){
                temp=temp/10;
                count++;
            }
            if(count%2==0) even++;
            count=0;
        }
        return even;
    }
}