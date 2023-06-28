package ch04.question;

public class Question5 {
    public static void main(String[] args) {

        System.out.println("요구사항 : 중첩 for문 사용");
        System.out.println("4x + 5y = 60의 해를 구하는 프로그램");
        System.out.println("---------------------------");


        for(int x = 0; x <= 10; x ++) {
            for(int y = 0; y <= 10; y ++) {
                if ( (4 * x) + (5 * y) == 60) {
                    System.out.println("(x,y)의 형태로 출력 : " + "(" + x + "," + y + ")");
                }
            }
        }
        System.out.println("---------------------------");
    }
}
