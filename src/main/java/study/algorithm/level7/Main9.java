package study.algorithm.level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ca = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        try {
            String input = br.readLine();
            br.close();

            int length = input.length();
            boolean isContain;
            do {
                isContain = false;
                for (String s : ca) {
                    if (input.contains(s)) {
                        length = length - (s.length() - 1);
                        input = input.replaceFirst(s, "_");
                        isContain = true;
                        break;
                    }
                }
            } while (isContain);
            System.out.println(length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
