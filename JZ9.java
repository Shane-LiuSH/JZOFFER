import java.util.*;
import java.util.Stack;

public class Solution {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();
    
    public void push(int node) {
        in.push(node);
    }   
    
    public int pop() {
        if(out.empty()){
            while(!in.empty()) {
                out.add(in.pop());
            }
        }
        return out.pop();
    }
}
