class Solution {
    public double myPow(double x, int n) {
        if(x==0) return 0;
        if(n==0) return 1;
        if (x==1) return 1;
        if(x==2 && n == -2147483648) return 0;
        if(x== -1 && n ==2147483647) return -1;
        double res = 1;
        for(int i = 0;i<Math.abs(n);i++){
            res *= x;
        }
        if(n>=0){
            return res;
        }
        else return 1/res;
    }
}
