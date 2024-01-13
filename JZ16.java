import java.util.*;
public class Solution {
    public double pow(double base, int exponent){
        exponent = Math.abs(exponent);
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        double half = pow(base, exponent / 2);
        if(exponent % 2 == 1){
            return half*half*base;
        }else{
            return half*half;
        }
    }
    public double Power(double base, int exponent) {
        double res;
        res = pow(base, exponent);
        if(exponent < 0){
            res = 1.0 / res; 
        }
        return res;
  }
}
