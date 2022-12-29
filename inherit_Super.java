public class inherit_Super {
    public static void main(String[] args) {
        Lower lower = new Lower();
        lower.callNum();
        Student student = new Student(); // super()로 상위 클래스 생성자를 불러왔기 때문에 값 2개
    }
}
class Upper {
    int count = 20; // super.count
}
class Lower extends Upper {
    int count = 15; // lower count / this가 생략됨

    void callNum() {
        System.out.println("count = " + count); // 기본적인 메소드, 자기가 속한 객체에서 초기화된 count를 참조함
        System.out.println("this.count = " + this.count); // 자기자신의 객체에서 초기화값 참조함
        System.out.println("super.count = " + super.count); // 상속으로 연관된 상위 클래스의 초기화값을 참조함
//      근데 이제 기본적으로 필드 인스턴스 변수의 이름이 같기 때문에 구분 해줘야함
//      그래서 this와 super로 구분하는 것
    }
} // super keyword ~> 메소드나 생성자 등에서 자신이 상속으로 연관된 상위 클래스의 멤버를 불러올지
// 아니면 그냥 자신이 속한 클래스의 멤버를 불러올지를 선택하는 키워드

class Person2 {

    Person2() {
        System.out.println("Person2 생성자");
    }
}
class Student extends Person2 {
    Student() {
        super(); // Person2 클래스의 생성자 호출
        System.out.println("Student 생성자");
    }
}// super() ~> this()와 마찬가지로 자신이 상속으로 연관된 상위 클래스의 생성자를 불러올때 쓰는것
// this()는 자신이 속한 클래스에서 다른 생성자를 불러올 때 쓰는 것
// this()와 마찬가지로 super()도 생성자 바디의 가장 처음 들어가야함