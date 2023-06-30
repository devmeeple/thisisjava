package ch07.sec09;

public class InstanceOfExample {

    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        // 참조타입 확인
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
