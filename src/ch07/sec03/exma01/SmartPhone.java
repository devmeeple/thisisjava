package ch07.sec03.exma01;

public class SmartPhone extends Phone {

    public  SmartPhone(String model, String color) {
        super(); // 부모 생성자 호출 생략가능 컴파일시 자동 추가
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
