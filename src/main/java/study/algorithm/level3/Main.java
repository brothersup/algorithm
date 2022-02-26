package study.algorithm.level3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void level3_1() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        scanner.close();
    }

    public void level3_2() {
        Scanner scanner = new Scanner(System.in);
        int caseCount = scanner.nextInt();
        for (int i = 0; i < caseCount; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
        scanner.close();
    }

    public void level3_3() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
        scanner.close();
    }

    public void level3_4() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int caseCount = Integer.parseInt(br.readLine());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < caseCount; i++) {
                String[] s = br.readLine().split(" ");
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

    public void level3_4_1() {
        Scanner scanner = new Scanner(System.in);
        int caseCount = scanner.nextInt();

        for (int i = 0; i < caseCount; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a + b);
        }
        scanner.close();
    }

    public void level3_5() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            br.close();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 1; i <= n; i ++) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_6() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            br.close();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = n; i > 0; i--) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_7() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int caseCount = Integer.parseInt(br.readLine());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 1; i <= caseCount; i++) {
                String[] s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                bw.write("Case #" + i + ": " + (a + b));
                bw.newLine();
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_8() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int caseCount = Integer.parseInt(br.readLine());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 1; i <= caseCount; i++) {
                String[] s = br.readLine().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
                bw.newLine();
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_9() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            br.close();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_10() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            br.close();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    bw.write(" ");
                }

                for (int j = 1; j <= i; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_11() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);

            String[] list = br.readLine().split(" ");
            br.close();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < n; i++) {
                if (x > Integer.parseInt(list[i])) {
                    bw.write(list[i] + " ");
                }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void level3_11_2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            list.add(scanner.nextInt());
        }

        list.forEach(num -> {
            if (x > num) {
                System.out.print(num + " ");
            }
        });
        scanner.close();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.level3_11();
    }
}
