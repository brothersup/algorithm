package study.algorithm.level7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main8 {
    public int getNumber(String s) {
        if ("ABC".contains(s)) {
            return 2;
        } else if ("DEF".contains(s)) {
            return 3;
        } else if ("GHI".contains(s)) {
            return 4;
        } else if ("JKL".contains(s)) {
            return 5;
        } else if ("MNO".contains(s)) {
            return 6;
        } else if ("PQRS".contains(s)) {
            return 7;
        } else if ("TUV".contains(s)) {
            return 8;
        } else if ("WXYZ".contains(s)) {
            return 9;
        } else return 1;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Main8 main = new Main8();
        List<Integer> numbers = new ArrayList<>();
        try {
            String[] input = br.readLine().split("");
            br.close();

            for (String s : input) {
                numbers.add(main.getNumber(s));
            }

            int sec = 0;
            for (Integer number : numbers) {
                sec += number + 1;
            }
            bw.write(String.valueOf(sec));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
