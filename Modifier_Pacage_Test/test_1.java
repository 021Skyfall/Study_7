package Modifier_Pacage_Test;
//import Modifier_Access.*; // ~> 아니 이거 왜 임포트 안되지 한참 찾았는데
// 기본적으로 src 폴더에 있는 파일들은 가상 패키지인 Default Package 에 들어있는거고
// 다른 패키지를 이 Default Package 에 import 하는건 되지만 
// 다른 패키지에 Default Package 를 import 하는건 안된데 ㅋㅋㅋ
// 불공평하네 여튼 다음부터 뭐 만들면 무조건 패키지 생성해서 때려박아야겠음

public class test_1 {
        public static void main(String[] args) {
            A();
            B();
            C();
            D();
        }

        public static void A() {
            System.out.println("나는 public 접근제어자가 붙은 메소드야~");
        }

        protected static void B() {
            System.out.println("나는 protected 접근제어자가 붙은 메소드야~");
        }

        static void C() {
            System.out.println("나는 Default 접근제어자 메소드야~");
        }

        private static void D() {
            System.out.println("나는 private 접근제어자가 붙은 메소드야~");
        }
    }
