class Solution {
    boolean ispossible(int[] piles, int mid, int h){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]<=mid){
                hours++;
            }
            else if((piles[i]%mid)==0){
                hours+= piles[i]/mid;
            }
            else if(piles[i]%mid!=0){
                hours+= (piles[i]/mid)+1;
            }
            if(hours>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start=1, end=piles[0], mid=0, ans=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>end) end=piles[i];
        }
        while(start<=end){
            mid=(start+end)/2;
            if(ispossible(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}