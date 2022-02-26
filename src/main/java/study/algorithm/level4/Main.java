package study.algorithm.level4;

import java.io.*;

public class Main {

    public void level4_1() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while (true) {
                String[] s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);

                if (a == 0 && b == 0) {
                    break;
                }

                bw.write(String.valueOf(a + b));
                bw.newLine();
            }

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level4_2() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String input;
            while ((input = br.readLine()) != null) {
                String[] s = input.split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);

                bw.write(String.valueOf(a + b));
                bw.newLine();
            }

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level4_3() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            br.close();

            int temp = Integer.parseInt(input);
            Integer newNumber = null;
            int count = 0;

            while (newNumber == null || Integer.parseInt(input) != newNumber) {
                if (temp >= 10) {
                    int ten = (temp % 10) * 10;
                    int one = (temp / 10) + (temp % 10);
                    if (one >= 10) {
                        one = one % 10;
                    }
                    newNumber = ten + one;
                } else {
                    int ten = temp * 10;
                    newNumber = ten + temp;
                }

                temp = newNumber;
                count ++;
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(String.valueOf(count));
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.level4_3();
    }
}
