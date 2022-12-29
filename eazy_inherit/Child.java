package eazy_inherit;

public class Child extends Parents{ // 상속 받을 서브 클래스
    long money = 10_000_000L; // 서브 클래스의 필드

    Parents parents = new Parents();
    public void buy_toy() {
        money -= 500_000;
        System.out.printf("장난감을 사고 잔액은 %d입니다.\n",money);
    }
    public void get_inherit() {
        money += parents.money;
        System.out.printf("헉 그런데 상속 받아서 잔액이 %d입니다.\n",money);
    }
}
