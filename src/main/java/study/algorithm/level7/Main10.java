package study.algorithm.level7;

import java.io.*;
import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                String[] word = br.readLine().trim().split("");
                List<String> tempList = new ArrayList<>();
                tempList.add(word[0]);
                for (int j = 1; j < word.length; j++) {
                    if (!tempList.get(tempList.size() - 1).equals(word[j])) {
                        tempList.add(word[j]);
                    }
                }

                Set<String> set = new HashSet<>(Arrays.asList(word));
                if (set.size() == tempList.size()) {
                    cnt++;
                }
            }
            bw.write(String.valueOf(cnt));
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
