package study.algorithm.level6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main2 {
    int d(int n) {
        int res = n;
        String[] split = String.valueOf(n).split("");
        if (split.length == 1) {
            res += Integer.parseInt(split[0]);
        } else {
            for (String s : split) {
                res += Integer.parseInt(s);
            }
        }
        return res;
    }

    boolean isSelfNumber(int num) {
        int cnt = 0;
        for (int i = 1; i < num; i++) {
            if (d(i) == num) {
                cnt ++;
            }
        }
        return cnt == 0;
    }

    // 만넘을떄까지 d(n) 계속돌림 -> 만까지 배열중에 나온숫자 다뻄 ???
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main2 main = new Main2();

        try {
            for (int i = 1; i <= 10000; i++) {
                if (main.isSelfNumber(i)) {
                    bw.write(String.valueOf(i));
                    bw.newLine();
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
