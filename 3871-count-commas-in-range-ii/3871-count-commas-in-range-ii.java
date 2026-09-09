class Solution {
    public long countCommas(long n) {
         long ans=0;
         long l=1000;
        if(n<l){
            return 0;
        }
        while(n>=l){
    ans=ans+(n-l+1);
    l=l*1000;}
    return ans;
        }
}