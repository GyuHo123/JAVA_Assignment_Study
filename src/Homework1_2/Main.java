package Homework1_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner put = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String names[] = new String[20];
        int score[][] = new int[6][2];


        for (i = 0; i < 5; i++) {
            System.out.println("이름을 입력하시오");
            names[i] = put.next();
            System.out.println("점수를 입력하시오");
            score[i][0] = sc.nextInt();
        }
        for(i = 0; i < 5; i++)
        {
            if (score[i][0] > 100 || score[i][0] < 0) {
                System.out.println("입력 범위 외의 값입니다");
                i = i - 1;
            }
            System.out.print(names[i] + " " + score[i][0] + " ");
            if (score[i][0] >= 90) {
                System.out.println("A");
            } else if (score[i][0] >= 80) {
                System.out.println("B");
            } else if (score[i][0] >= 70) {
                System.out.println("C");
            } else if (score[i][0] >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}