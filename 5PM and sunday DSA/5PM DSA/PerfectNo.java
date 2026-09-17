public class PerfectNo {
    class Solution {
    public boolean checkPerfectNumber(int n) {
        if(n<=1)
        return false;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int fact1=i, fact2=n/i;
                if(fact1!=fact2){
                    sum+=(fact1+fact2);
                }else{
                    sum=fact1;
                }
            }
        }
        return sum==n;
    }
}
}
