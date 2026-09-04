class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
       int current=n;
       int product=1;
       while(n>0){
         int digit=n%10;
         sum+=digit;
         product*=digit;
         n=n/10;
       }
       if(current%(sum+product)==0){
        return true;
       }
       return false;
    }
}