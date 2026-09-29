class Solution {
    public int numberOfSteps(int n) {
        int steps=0;
        int num=n;
        while(num>0){
            if(num%2==0){
                num=num/2;
                steps++;
            }
            else if(num%2!=0){
                num=num-1;
                steps++;
            }
        }
        return steps;
    }
}