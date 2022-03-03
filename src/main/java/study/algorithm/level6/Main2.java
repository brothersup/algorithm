package study.algorithm.level6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main2 main = new Main2();

        List<Integer> allNumbers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        try {
            for (int i = 1; i <= 10000; i++) {
                allNumbers.add(i);
                if (main.d(i) <= 10000) {
                    numbers.add(main.d(i));
                }
            }
            numbers = new ArrayList<>(new HashSet<>(numbers));

            for (int number : allNumbers) {
                if (!numbers.contains(number)) {
                    bw.write(String.valueOf(number));
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
