class Solution {
    public boolean isUgly(int n) {
        int a=0;
        if(n==0) return false;
        while(n!=0){
            if(n==1) return true;
            // d=n/2;
            if(n%2==0) n=n/2;
            else if(n%3==0) n=n/3;
            else if(n%5==0) n=n/5;
            else{
                // System.out.println(n);
                a=1;
                break;
            }
        }
        if(a==0) return true;
        else return false;
    }
}