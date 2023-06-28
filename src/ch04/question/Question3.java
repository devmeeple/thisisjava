package ch04.question;

public class Question3 {
    public static void main(String[] args) {

        int num = 0;

        System.out.println("3의 배수를 구하는 프로그램");
        System.out.println("---------------------------");
        for (int i = 1; i <= 100; i++) {
            if ( i % 3 == 0) {
                System.out.print(i + " ");
                num += i;

                if ( i % 15 == 0) { // 문제의 요구사항은 아니지만 출력결과를 보기 좋게 하기 위해 추가
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("3의 배수의 총합 : " + num);
    }
}
