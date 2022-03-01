package study.algorithm.level6;

import java.io.*;

public class Main3 {
    boolean isHansu(int num) {
        boolean result = true;
        String[] numbers = String.valueOf(num).split("");
        if (numbers.length >= 3) {
            int d = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
            for (int i = 1; i < numbers.length; i++) {
                if (i != numbers.length - 1 && d != Integer.parseInt(numbers[i]) - Integer.parseInt(numbers[i + 1])) {
                    result = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main3 main = new Main3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int input = Integer.parseInt(br.readLine());
            br.close();

            int cnt = 0;
            for (int i = 1; i <= input; i++) {
                if (main.isHansu(i)) {
                    cnt++;
                };
            }
            bw.write(String.valueOf(cnt));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
