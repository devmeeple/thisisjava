package ch04.question;

public class Question6 {
    public static void main(String[] args) {

        System.out.println("도전! 별찍기 프로그램");
        System.out.println("---------------------------");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
}
