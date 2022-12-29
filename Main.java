import eazy_inherit.Child;

public class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.buy_car();
        c1.buy_house();
        c1.buy_toy();
        c1.get_inherit();
        // 이렇듯 상속 받은 자식 클래스는 부모 클래스의 기능을 이용할 수 있음


    }
}