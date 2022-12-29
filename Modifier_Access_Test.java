public class Modifier_Access_Test { // 다른 클래스 내에서의 접근 제어자 실행
    public static void main(String[] args) {
        Modifier_Access.A();
        Modifier_Access.B();
        Modifier_Access.C();
//        Modifier_Access.D(); // Private가 걸린 이 친구만 에러
    } // 나머지는 정상 출력
}
