package study.algorithm.level7;

import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String word = br.readLine();
            br.close();

            char c = 97;
            while (c <= 122) {
                bw.write(word.indexOf(c) + " ");
                c++;
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
