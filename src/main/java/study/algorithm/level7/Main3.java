package study.algorithm.level7;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] S = br.readLine().split("");
            br.close();

            char c = 97;
            while (c <= 122) {
                int index = -1;
                for (int i = 0; i < S.length; i++) {
                    if (S[i].charAt(0) == c) {
                        index = i;
                        break;
                    }
                }
                bw.write(index + " ");
                c++;
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
