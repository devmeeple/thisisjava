package ch05.question;

public class Question8 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int totalSum = 0; // 전체 합
        double totalAvg = 0; // 전체 평균

        System.out.println("전체 합과 평균을 구해 출력하는 코드");
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.println("array[" + i + "][" + k + "]: " + array[i][k]);
                totalSum += array[i][k];
            }
        }
        System.out.println();
        System.out.println("총합 = " + totalSum);

        totalAvg = (double) totalSum / array.length;
        System.out.println("평균 = " + totalAvg);

    }
}
