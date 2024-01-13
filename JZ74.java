import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 
     * @param sum int整型 
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence (int sum) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int i = 1;
        int j = 2;
        while (i >=1 && j < sum) {
            int tmp = (i + j)*(j - i + 1)/2;
            if(tmp == sum){
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for(int k = i; k <= j; k++){
                    temp.add(k);
                }
                res.add(temp);
                i++;
            }
            if(tmp < sum){
                j++;
            }
            else{
                i++;
            }
        }
        return res;
    }
}