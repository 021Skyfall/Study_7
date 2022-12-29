package Encapsulation_packageTest2; // 패키지 (캡슐화)

//import Encapsulation_packageTest1.Import1; // 사실 IDE 에서 자동으로 import 해주긴 함
//      얘는 이제 해당 패키지에서 Import1이라는 이름의 클래스만 쓰겠다는 의미
import Encapsulation_packageTest1.*; // 얘는 이제 해당 패키지에 존재하는 클래스를 전부 쓰겠다는 의미

public class Import2 {
    public static void main(String[] args) {
//        Encapsulation_packageTest1.Import1 Example = new Encapsulation_packageTest1.Import1();
        // 허벌 나게 김 ㄷㄷ 출력은 정상적 근데 너무 기니까 쭐이고 싶음? 어떻게? import 로~
        Import1 Example = new Import1();
        // 이렇듯 import 해주면 Package 위치 안 찍어줘도됨
        // 사실 지금껏 많이 썼는데 어디서 왔고 왜 들어가는건지 어렴풋이 알던 걸 해결했다고 생각하자
    }
}
