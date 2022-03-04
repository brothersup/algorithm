package study.algorithm.level7;

import java.io.*;

public class Main7 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] s = br.readLine().split(" ");
            br.close();

            String[] a = s[0].split("");
            String[] b = s[1].split("");

            StringBuilder _a = new StringBuilder();
            for (int i = a.length - 1; i >= 0; i--) {
                _a.append(a[i]);
            }

            StringBuilder _b = new StringBuilder();
            for (int i = b.length - 1; i >= 0; i--) {
                _b.append(b[i]);
            }

            int result = Integer.max(Integer.parseInt(_a.toString()), Integer.parseInt(_b.toString()));
            bw.write(String.valueOf(result));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}