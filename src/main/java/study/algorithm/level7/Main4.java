package study.algorithm.level7;

import java.io.*;

public class Main4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int T = Integer.parseInt(br.readLine());

            for (int i = 0; i < T; i++) {
                String[] input = br.readLine().split(" ");
                int R = Integer.parseInt(input[0]);
                String[] S = input[1].split("");

                for (String s : S) {
                    for (int j = 0; j < R; j++) {
                        bw.write(s);
                    }
                }
                bw.newLine();
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
