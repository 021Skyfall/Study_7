public class Method_Overriding {
    public static void main(String[] args) {
//        Bike bike = new Bike();
//        Car car = new Car();
//        Boat boat = new Boat();
//
//        bike.run();
//        car.run();
//        boat.run(); // 각각 메소드 기능이 상위 클래스랑 println으로 똑같고 이름도 똑같은데 지들꺼 출력함

        //상위 클래스 이름으로 새로 생성하면?
//        Vehicle bike1 = new Bike();
//        Vehicle car1 = new Car();
//        Vehicle boat1 = new Boat();
//
//        bike1.run();
//        car1.run();
//        boat1.run();
        // 그래도 오버라이딩된 결과
        // 이걸 이제 배열로 깔끔하게 한다면?

        Vehicle[] vehicles = new Vehicle[] {new Bike(),new Car(),new Boat()};
        //이런식으로 생성을 배열로 할 수 있음
        for (Vehicle vehicle : vehicles) {
            vehicle.run();
        } // 바로 위 코드가 아주 짧게 변함 최적화 굳
        // 근데 문제는 배열에 for문 쓸때는 Enhanced for문 밖에 못쓰나?

    }
}
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle { // Vehicle 클래스 상속
    void run() {
        System.out.println("Bike is running"); // 메서드 오버라이딩
    }
}
// 아 상위 클래스의 메소드를 하위 클래스에 이름 똑같이 해서 불러온다음에 값 고쳐주면 오버라이드 되서 출력
// 쉽게 말해 메소드 덮어쓰기네

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running");
    }
}
class Boat extends Vehicle {
    void run() {
        System.out.println("Boat is running");
    }
}
// 다중 오버라이딩의 예시로 만들어봄