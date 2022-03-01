package study.algorithm.level6;

import java.util.Arrays;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {
        Test test = new Test();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        test.sum(a);
    }
}

class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int num : a) {
            ans += num;
        }
        return ans;
    }
}
