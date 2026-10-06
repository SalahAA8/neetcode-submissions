class Solution {
    public double myPow(double x, int n) {
        long exponent = n;
        double output = x;
        double result = 1;
        if(x==0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        while(exponent != 0){
            if(exponent % 2 != 0){
                result = result * output;
            }
            output = output * output;
            exponent /= 2;
        }
        if(n<0){
            return (1/result);
        }
        else{
            return result;
        }
    }
}

