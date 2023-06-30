package ch06.sec10.exam03;

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        Car myCar = new Car();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        // 정적 메소드 호출
        simulate();

        // 객체 생성
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
