package queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
Generate binary number rom 1 to n using Queue
 */
public class BinaryNumber {

    public static void main(String[] args) {
        int n = 20;
        String[] nums = generateBinaryNumbers(n);
        System.out.println(Arrays.toString(nums));
    }

    private static String[] generateBinaryNumbers(int n) {
        String[] res = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
            res[i] = queue.poll();
            String s1 = res[i] + "0";
            String s2 = res[i] + "1";
            queue.offer(s1);
            queue.offer(s2);
        }
        return res;
    }
}
