package study.algorithm.level1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public void level1_1() {
        System.out.println("Hello World!");
    }

    public void level1_2() {
        for (int i = 0; i < 2; i ++) {
            System.out.println("강한친구 대한육군");
        }
    }

    public void level1_3() {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }

    public void level1_4() {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }

    public void level1_5() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }

    public void level1_6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a - b);
    }

    public void level1_7() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
    }

    public void level1_8() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        DecimalFormat format = new DecimalFormat("###.################");
        System.out.println(format.format(a / b));
    }

    public void level1_9() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }

    public void level1_10() {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        System.out.println(id + "??!");
    }

    public void level1_11() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(year - 543);
    }

    public void level1_12() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }

    public void level1_13() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int b1 = b % 10;
        int b10 = b % 100 / 10;
        int b100 = b / 100;

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.level1_13();
    }
}
