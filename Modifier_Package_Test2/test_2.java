package Modifier_Package_Test2;
import Modifier_Pacage_Test.*;

//public class test_2 { // 자 어차피 protected 제어자는 안될 꺼 뻔하니까 빼고 나머지 세개 실험 ㄱ
//    public static void main(String[] args) {
//        test_1.A();
//        test_1.B(); // 얘하고
//        test_1.C(); // 얘 오류남
//    }
//} // 즉, 다른 패키지에서 출력하는 건 public 만 된다는 뜻
// 근데 여기서 이제 다른 패키지의 하위 클래스에서 접근 된다는게 궁금함
// 즉, 이건 상속 관계 일때 protected 걸린 애가 상위고 참조 하려는 애가 하위면 가능하다는 얘기

public class test_2 extends test_1{
    public static void main(String[] args) {
        test_1.B();
    }
} // 상속 관계로 변경하고 참조하니까 실행됨 / 확인 완료
