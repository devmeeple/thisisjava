package ch05.question;

public class Question7 {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 8, 2};
        int result = 0;

        System.out.println("최대 값 출력 프로그램");
        for (int i = 0; i < array.length; i++) {
            if(array[i] > result) {
                result = array[i];
            }
        }
        System.out.println("result = " + result);
    }
}
