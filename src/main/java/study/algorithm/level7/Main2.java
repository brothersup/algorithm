package study.algorithm.level7;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int count = Integer.parseInt(br.readLine());
            String[] numbers = br.readLine().split("");
            br.close();

            int sum = 0;
            for (int i = 0; i < count; i++) {
                sum += Integer.parseInt(numbers[i]);
            }

            bw.write(String.valueOf(sum));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
