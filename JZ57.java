import java.util.*;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        while (i < j){
            int s = array[i] + array[j];
            if(s == sum){
                res.add(array[i]);
                res.add(array[j]);
                break;
            }
            if(s < sum){
                i++;
            }
            else{
                j--;
            }
        }
        return res;
    }
}