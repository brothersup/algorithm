package study.algorithm.level7;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String input = br.readLine();
            byte[] asciiCode = input.getBytes(StandardCharsets.US_ASCII);
            bw.write(String.valueOf(asciiCode[0]));
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
