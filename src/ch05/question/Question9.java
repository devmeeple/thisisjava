package ch05.question;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        System.out.println("        학생들의 점수를 분석하는 프로그램      ");
        boolean run = true;
        int option;
        int student = 0;
        int[] scores = null;

        while(run) {
            System.out.println("---------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료");
            System.out.println("---------------------------------------------");

            System.out.print("선택> ");
            Scanner sc = new Scanner(System.in);
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 :
                    System.out.print("학생수> ");
                    student = Integer.parseInt(sc.nextLine());
                    scores = new int[student];
                    break;
                case 2 :
                    if (scores == null) {
                        System.out.println("학생 수를 먼저 입력해주세요.");
                    } else {
                        for (int i = 0; i < scores.length; i++) {
                            System.out.print("scores[" + i + "]>");
                            scores[i] = Integer.parseInt(sc.nextLine());
                        }
                    }
                    break;
                case 3 :
                    if (scores == null) {
                        System.out.println("학생수를 먼저 입력해주세요.");
                    } else {
                        for (int i = 0; i < scores.length; i++) {
                            System.out.println("scores[" + i + "]: " +scores[i]);
                        }
                    }
                    break;
                case 4 :
                    int topScore = 0;
                    int sum = 0;
                    double avgScore = 0;

                    if (scores == null) {
                        System.out.println("학생수를 먼저 입력해주세요.");
                    } else {
                        for (int i = 0; i < scores.length; i++) {
                            sum += scores[i];
                            if (scores[i] > topScore) {
                                topScore = scores[i];
                            }
                        }
                        avgScore = (double) sum / scores.length;
                        System.out.println("최고 점수: " + topScore);
                        System.out.printf("평균 점수: %.1f\n", avgScore);
                    }
                    break;
                case 5 : run = false; break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
