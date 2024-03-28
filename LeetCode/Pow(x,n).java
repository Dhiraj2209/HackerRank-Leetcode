class Solution {
    public double myPow(double x, int n) {
        double ans = helper(x,1,Math.abs(n));
        if(n < 0){
            return 1 / ans;
        }
        return ans;
    }

    private double helper(double x, double ans, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x * ans;
        }
        ans *= x;
        
        return helper(x,ans,(n-1));
    }
}
