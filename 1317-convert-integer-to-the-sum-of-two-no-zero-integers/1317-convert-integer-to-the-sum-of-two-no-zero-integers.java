class Solution {
    public int[] getNoZeroIntegers(int n) {
        int temp=0, n1=n, i;
        int arr[]= new int[2];
        // while(temp!=0){
            for(i=1;i<n;i++){
                if((checkNoZero(i))==true){
                    arr[0]=i;
                    temp=n-i;
                    if((checkNoZero(temp))==true && (temp+i)==n){
                        // if(temp==i){
                        break;
                        // }
                    }
                }
            }
            arr[1]=temp;
            return arr;
        // }  
    }
    boolean checkNoZero(int temp){
        while(temp!=0){
            if(temp%10==0){
                return false;
            }
            temp=temp/10;
        }
        return true;
    }
}