package study.algorithm.level2;

import java.util.Scanner;

public class Main {
    public void level2_1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("<");
        } else if (a > b) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }

    public void level2_2() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public void level2_3() {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public void level2_4() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x >= 0) {
            if (y >= 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y >= 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }

    public void level2_5() {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt() - 45;

        if (minute < 0) {
            hour -= 1;
            minute += 60;
            if (hour < 0) {
                hour += 24;
            }
        }

        System.out.println(hour + " " + minute);
    }

    public void level2_6() {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt() + scanner.nextInt();

        if (minute >= 60) {
            hour = hour + minute / 60;
            minute = minute % 60;

            if (hour >= 24) {
                hour -= 24;
            }
        }

        System.out.println(hour + " " + minute);
    }

    public void level2_7() {
        Scanner scanner = new Scanner(System.in);
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();

        if (dice1 == dice2 && dice2 == dice3) {
            System.out.println(10000 + dice1 * 1000);
        } else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3) {
            int same;
            if (dice1 == dice2 || dice1 == dice3) {
                same = dice1;
            } else {
                same = dice2;
            }
            System.out.println(1000 + same * 100);
        } else {
            int max = Integer.max(dice1, dice2);
            max = Integer.max(max, dice3);
            System.out.println(max * 100);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.level2_6();
    }
}
