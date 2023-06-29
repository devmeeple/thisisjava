package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
//        intArray[0] = 10 NullPointerException 할당된 주소가 없어서 값을 저장할 수 없다.

        String str = null;
//        System.out.println("총 문자 수 : " + str.length()); NullPointerException
    }
}
