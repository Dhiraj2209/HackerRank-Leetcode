class Solution { //O(n)
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


// Approch 2

class Solution { //O(n)
    public double myPow(double x, int n) {
        double result = 1;
        if(n > 0){
            for (int i = 0; i < n; i++) {
                result = x * result;
            }
        }else {
            for (int i = n; i != 0; i++) {
                result = x * result;
            }

            return 1 / result;
        }
       return result;
    }
}
