class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr= new ArrayList<>();
        int max=candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max) max= candies[i];
        }
        int extraCandies_max=  max+extraCandies;
        int sum=0;
        for(int i=0;i<candies.length;i++){
            sum= candies[i]+extraCandies;
            if((sum>=max) && (sum<=extraCandies_max)){
                arr.add(true);
            }
            else if(sum<max) arr.add(false);  
            sum=0;
        }
        return arr;
    }
}