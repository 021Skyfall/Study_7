package eazy_inherit;

public class Parents { // 상속을 해주는 상위 클래스
    long money = 100_000_000_000L; // 상위 클래스의 필드

    public void buy_car() { // 상위 클래스의 메소드 1
        money -= 5_000_000_000L;
        System.out.printf("차를 사고 잔액은 %d입니다.\n",money);
    }
    public void buy_house() { // 상위 클래스의 메소드 2
        money -= 10_000_000_000L;
        System.out.printf("집을 사고 잔액은 %d입니다.\n",money);
    }
}
