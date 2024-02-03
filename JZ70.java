import java.util.*;

public class Solution {
    public int rectCover(int target) {
        int[] res = new int[target];
        if(target == 1 || target == 2 || target == 0){
            return target;
        }
        res[0] = 1;
        res[1] = 2;
        for(int i = 2; i < target; i++){
            res[i] = res[i-1] + res[i-2];
        }
        return res[target-1];
    }
}
