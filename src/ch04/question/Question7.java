package ch04.question;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        int option = 0;
        int money = 0;
        boolean run = true;
        Scanner sc = new Scanner(System.in);

        while(run) {
            System.out.println("--------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");
            String strNum = sc.nextLine();
            option = Integer.parseInt(strNum);

            switch (option) {
                case 1:
                    System.out.print("예금액>");
                    money += Integer.parseInt(sc.nextLine());
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액>");
                    money -= Integer.parseInt(sc.nextLine());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("잔고>" + money);
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    run = false;
            }
        }

        System.out.println("프로그램 종료");

    }
}
