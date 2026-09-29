class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0, max=0;
        List<Integer> arr= new ArrayList<>();
        // int row=accounts[0].length;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum= sum+accounts[i][j];
            }
            arr.add(sum);
        }
        max= arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
}