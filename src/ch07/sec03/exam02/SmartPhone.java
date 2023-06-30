package ch07.sec03.exam02;

public class SmartPhone extends Phone{

    public SmartPhone(String model, String color) {
        super(model, color); // 기본생성자가 아니라 부모가 매개변수를 갖는 생성자는 반드시 작성해야함 생략 불가능
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
