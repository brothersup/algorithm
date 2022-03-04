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
            String[] alphabets = br.readLine().toLowerCase().split("");
            br.close();

            Set<String> set = new HashSet<>(Arrays.asList(alphabets));

            int mostUsedCount = 0;
            String mostUsedAlphabet = null;
            for (String _alphabet : set) {
                if (mostUsedAlphabet != null && mostUsedAlphabet.equals(_alphabet)) continue;
                int usedCount = 0;
                for (String alphabet : alphabets) {
                    if (_alphabet.equals(alphabet)) {
                        usedCount++;
                    }
                }
                if (usedCount == mostUsedCount) {
                    mostUsedAlphabet = "?";
                } else if (usedCount > mostUsedCount) {
                    mostUsedCount = usedCount;
                    mostUsedAlphabet = _alphabet;
                }
            }

            bw.write(mostUsedAlphabet.toUpperCase());
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
