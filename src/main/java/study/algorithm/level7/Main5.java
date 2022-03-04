package study.algorithm.level7;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main5 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String[] alphabets = br.readLine().split("");
            br.close();

            Set<String> set = new HashSet<>(Arrays.asList(alphabets));

            int mostUsedCount = 0;
            String mostUsedAlphabet = null;
            boolean isMany = false;
            for (String _alphabet : set) {
                if (mostUsedAlphabet != null && mostUsedAlphabet.equalsIgnoreCase(_alphabet)) continue;
                int usedCount = 0;
                for (String alphabet : alphabets) {
                    if (_alphabet.equalsIgnoreCase(alphabet)) {
                        usedCount++;
                    }
                }
                if (usedCount == mostUsedCount) {
                    isMany = true;
                    break;
                } else if (usedCount > mostUsedCount) {
                    mostUsedCount = usedCount;
                    mostUsedAlphabet = _alphabet;
                }
            }

            String result = isMany ? "?" : mostUsedAlphabet.toUpperCase();
            bw.write(result);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
