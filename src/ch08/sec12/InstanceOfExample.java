package ch08.sec12;

public class InstanceOfExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    private static void ride(Vehicle vehicle) {
        // 매개값이 Bus 인 경우 강제 타입 변환해서 checkFare() 메소드 호출
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }

        vehicle.run();
    }
}
