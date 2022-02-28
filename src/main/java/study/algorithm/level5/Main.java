package study.algorithm.level5;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public void level5_1() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            String[] numbers = br.readLine().split(" ");

            int maxNum = Integer.parseInt(numbers[0]);
            int minNum = Integer.parseInt(numbers[0]);

            for (int i = 1; i < N; i++) {
                maxNum = Integer.max(maxNum, Integer.parseInt(numbers[i]));
                minNum = Integer.min(minNum, Integer.parseInt(numbers[i]));
            }
//            for (int i = 1; i < N; i++) {
//                maxNum = Math.max(maxNum, Integer.parseInt(numbers[i]));
//                minNum = Math.min(minNum, Integer.parseInt(numbers[i]));
//            }

            bw.write(minNum + " " + maxNum);

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level5_2() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            Integer max = null;
            int index = 1;
            for (int i = 1; i <= 9; i++) {
                int number = Integer.parseInt(br.readLine());
                if (max == null) {
                    max = number;
                } else if (max < number) {
                    max = number;
                    index = i;
                }
            }
            br.close();

            bw.write(String.valueOf(max));
            bw.newLine();
            bw.write(String.valueOf(index));

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level5_3() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 1;
        try {
            for (int i = 0; i < 3; i++) {
                result *= Integer.parseInt(br.readLine());
            }
            br.close();

            List<String> numbers = List.of(String.valueOf(result).split(""));

            for (int i = 0; i <= 9; i++) {
                int number = i;
                long count = numbers.stream().filter(s -> Integer.parseInt(s) == number).count();
                bw.write(String.valueOf(count));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level5_4() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numbers = new ArrayList<>();
        try {
            for (int i = 0; i < 10; i++) {
                int number = Integer.parseInt(br.readLine());
                numbers.add(number % 42);
            }
            br.close();

            HashSet<Integer> set = new HashSet<>(numbers);
            bw.write(String.valueOf(set.size()));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level5_5() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            br.close();

            List<Double> scores = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                scores.add(Double.parseDouble(input[i]));
            }

            double max = Collections.max(scores);
            double total = 0;
            scores = scores.stream().map(score -> score / max * 100).collect(Collectors.toList());
            for (double score : scores) {
                total += score;
            }
            double avg = total / N;
            bw.write(String.valueOf(avg));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level5_6() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String[] ox = br.readLine().split("");
                int cnt = 0;
                int score = 0;
                for (String s : ox) {
                    if (s.equals("O")) {
                        cnt++;
                    } else {
                        cnt = 0;
                    }
                    score += cnt;
                }
                bw.write(String.valueOf(score));
                bw.newLine();
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level5_7() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int C = Integer.parseInt(br.readLine());
            for (int i = 0; i < C; i++) {
                String[] testCase = br.readLine().split(" ");
                double N = Double.parseDouble(testCase[0]);
                double total = 0;
                for (int j = 1; j <= N; j++) {
                    total += Double.parseDouble(testCase[j]);
                }
                double avg = total / N;
                double cnt = 0;
                for (int j = 1; j <= N; j++) {
                    if (Double.parseDouble(testCase[j]) > avg) {
                        cnt ++;
                    }
                }
                double percent = cnt / N * 100;
//                DecimalFormat df = new DecimalFormat("00.000");
//                bw.write(df.format(percent) + "%");
//                bw.newLine();
                System.out.printf("%.3f%%\n", percent);
            }
            br.close();
//            bw.flush();
//            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.level5_7();
    }
}
