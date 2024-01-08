import java.util.*;

public class Solution{
    public String replaceSpace(String s){
        if(s == null){ return null; }
        int length = 0;
        char[] res = new char[s.length() * 3];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                res[length++] = '%';
                res[length++] = '2';
                res[length++] = '0';
            }
            else{
                res[length++] = s.charAt(i);
            }
        }
        String newStr = new String(res, 0, length);
        return newStr;
    }
}
