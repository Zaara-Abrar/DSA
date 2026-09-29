class Solution {
    public int countPrimes(int n) {
        boolean isPrime[]= new boolean[n];
        if(n==0 || n==1) return 0;
        Arrays.fill(isPrime , true);
        int count=0;
        
        for(int i=2;i*i<=n;i++){
                for(int j=2*i;j<n;j=j+i){
                    if(j%i==0) isPrime[j]=false;
                }
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]==true) count++;
        }
        return count;
    }
}