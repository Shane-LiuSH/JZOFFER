import java.util.*;


public class Solution {
    private PriorityQueue<Integer> left = new PriorityQueue<>((a, b)-> b -a);
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int N = 0;
    public void Insert(Integer num) {
        if(N % 2 == 0){
            left.add(num);
            right.add(left.poll());
        }
        else{
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        if(N % 2 == 0){
            return (left.peek() + right.peek()) / 2.0;
        }
        else{
            return (double)right.peek();
        }
    }


}
