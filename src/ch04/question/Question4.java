package ch04.question;

public class Question4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int count = 0;

        System.out.println("합이 5가 되야 탈출 하는 프로그램");
        System.out.println("---------------------------");
        while (true) {
            num1 = (int) (Math.random() * 6) + 1;
            num2 = (int) (Math.random() * 6) + 1;
            count++;

            System.out.println(count + "번째 결과 (" + num1 + "),(" + num2 + ")");

            if (num1 + num2 == 5) {
                break;
            }
        }

        System.out.println("탈출한 주사위 결과 : (" + num1 + "),(" + num2 + ")");
        System.out.println("---------------------------");
    }
}
