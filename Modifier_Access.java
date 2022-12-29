public class Modifier_Access {
    public static void main(String[] args) { // 동일 클래스 내에서의 접근 제어자 실행
        A();
        B();
        C();
        D();
    } // 결과 : 동일 클래스 내에서는 전부 호출 가능

    public static void A() {
        System.out.println("나는 public 접근제어자가 붙은 메소드야~");
    };
    protected static void B() {
        System.out.println("나는 protected 접근제어자가 붙은 메소드야~");
    };

    static void C() {
        System.out.println("나는 Default 접근제어자 메소드야~");
    }

    private static void D() {
        System.out.println("나는 private 접근제어자가 붙은 메소드야~");
    }
}// 모두 어차피 값 바꿀일도 없고 인스턴스 생성하기 귀찮으니까 걍 static 메소드로 변경함
