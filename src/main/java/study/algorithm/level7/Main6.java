package study.algorithm.level7;

import java.io.*;

public class Main6 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String[] words = br.readLine().trim().split(" ");
            int length = words.length;
            for (String word : words) {
                if (word.equals("")) {
                    length--;
                }
            }
            bw.write(String.valueOf(length));

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
