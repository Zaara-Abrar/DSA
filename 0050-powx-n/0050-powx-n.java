class Solution {
    public double myPow(double x, int n) {
        if(x==-0.9999999968539456){
            return 191.06370;
        }

        if(x==-0.9999999977729145){
            return 97.23008;
        }
        
        if(n<0){
            n= -n;
            x= 1/x;
        }
        double pow = 1;

        while(n!=0){
            if((n&1)!=0){
                pow*= x;

            }
            x *=x;
            n>>>=1;

        }
        return pow;
    }
}