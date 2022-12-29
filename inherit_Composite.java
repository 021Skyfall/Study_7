class Address {
    String city;
    String country; // 필드

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    } // 생성자
}
class Info {
    int id;
    String name;
    Address address; // 필드

    public Info(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    } // 생성자

    void showInfo() {
        System.out.println(id + " " + name);
        System.out.println(address.city+ " " + address.country);
//        System.out.println(Address.city+ " " + Address.country);
    } // 메소드 ~> 마지막에 출력할 것
}
public class inherit_Composite {
    public static void main(String[] args) {
        Address address1 = new Address("서울", "한국");
        Address address2 = new Address("도쿄", "일본");

        Info e = new Info(1, "김코딩", address1);
        Info e2 = new Info(2, "박해커", address2);
//        Info e = new Info();
//        e.id = 1;
//        e.name = "김코딩";
//        Info e2 = new Info();
//        e2.id = 2;
//        e2.name = "박해커";

        e.showInfo();
        e2.showInfo();
    }
}
// 아 상속 안쓰고 포함관계로 나타냈다는 뜻 같은데
// 포함관계는 상속 이용 안하고 ~> 왜냐면 Address 클래스가 Info 클래스를 상속하거나 하는게 아니라
// Info 클래스에 정의된 객체가 Address 를 가지고 있다의 형태라 포함되는 관계라고 하는가보네
// 그래서 Info 필드에 Address 라는 클래스 변수를 이용해서 Address 의 클래스 멤버를 불러왔고
// 그 클래스 멤버를 포함해서 Info 객체의 메소드에 정의했네
// 그러고서 메인 메소드에 생성할 때는 Address 클래스도 생성해주고나서 매개 변수 값 입력해주고
// Info 클래스도 마찬가지로 메소드 호출해야되니까 생성했고
// 근데 이거 생성자로 없으면 Address 그대로 주소 찍어주면 되나? 한번 해봄
// 되긴하는데 Address 클래스 변수를 스태틱으로 바꿔줘야함
// 이 스태틱이 어쩔땐 되고 어쩔땐 안되고 확실하게 구분하기가 힘듦; ~> 얘 진짜 다시 정리해야겠어