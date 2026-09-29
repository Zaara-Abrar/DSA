class Solution {
    public boolean isPerfectSquare(int num) {
        long first=1 ,last=num, mid=0;
        // boolean ans=false;
        while(first<=last){
            mid=(first+last)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                last=mid-1;
            }
            else if(mid*mid<num){
                first=mid+1;
            }
        } 
        return false;
    }
}