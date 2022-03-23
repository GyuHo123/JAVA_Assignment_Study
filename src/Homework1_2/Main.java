package Homework1_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner put = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);


        int score[][] = new int[5][2];
        String names[][] = new String[5][50];


        for (int i = 0; i < score.length; i++) {
            System.out.print("이름을 입력하시오 : ");
            names[i][10] = put.next();
            System.out.print("점수 : ");
            score[i][0] = sc.nextInt();

            if (score[i][0] > 100 || score[i][0] < 0) {
                System.out.println("입력 범위 외의 값입니다");
                i = i - 1;
            } else {
                if (score[i][0] >= 90) {
                    System.out.println("A학점입니다!");
                } else if (score[i][0] >= 80) {
                    System.out.println("B학점입니다!");
                } else if (score[i][0] >= 70) {
                    System.out.println("C학점입니다!");
                } else if (score[i][0] >= 60) {
                    System.out.println("D학점입니다!");
                } else {
                    System.out.println("F학점입니다!");
                }

            }

        }
    }
}

