class Solution {
    public boolean carPooling(int[][] arr, int carCapacity) {
        int []loc=new int [1001];
       Arrays.fill(loc,0);
       for(int i=0;i<arr.length;i++){
        int passenger=arr[i][0];
        int from=arr[i][1];
        int to=arr[i][2];
        loc[from] = loc[from] + passenger;

        loc[to] = loc[to] - passenger;


       }
       int usedCapacity=0;
       for(int i=0;i<1001;i++){
        usedCapacity=usedCapacity+loc[i];
        if(usedCapacity>carCapacity){
            return false;
        }
       }
       return true;
    }
}