public class inherit_Example_with_Constructor {
    public static void main(String[] args) {
//        Programmer1 p = new Programmer1("제임스",32);
        // 3. 근데 실제로 넣어보니까 오류 나네? 이거 상속 하위 클래스까지 적용 안되나봄
        // 4. 그럼 생성자를 하위 클래스에 넣어봄
//        p.name = "제임스";
//        p.age = 32;
//        p.companyName = "나이버";
        // 2. 위 부분을 생성자로 간단히
        Programmer1 p = new Programmer1("제임스",32,"나이버");
        // 5. 이제 잘되네 생성자는 하위 클래스에 넣어야하는구만
        // 6. 다음 부터는 alt + insert로 해보자
        p.programmer();
        p.eat();
        p.sleep();
        p.shit();

        Banker1 b = new Banker1("란란루",28,"우리은행");
//        b.name = "란란루";
//        b.age = 28;
//        b.bankName = "우리은행";
        // 2. 위 부분을 생성자로 간단히
        b.banker();
        b.eat();
        b.sleep();
        b.shit();
    }
}
class Person1 { // 상위 클래스
    String name;
    int age; // 필드, 인스턴스 변수
    
//    public Person1(String name, int age) {
//        this.name = name;
//        this.age = age;
//    } 1. 생성자 생성했음 그럼? 이제 위 코드 3줄 빼고 생성과 동시에 매개 변수로 입력해주면?
//          코드가 짧아짐 <~ 이거다 느낌 딱옴 와 ㅋㅋ

    public void eat () { // 메소드 1
        System.out.printf("%s 먹고\n",name);
    };
    public void sleep() { // 메소드 2
        System.out.printf("%s 자고\n",name);
    };
    public void shit() { // 메소드 3
        System.out.printf("%s 싼다\n",name);
    };
}
class Banker1 extends Person{ // 하위 클래스
    String bankName;

    public Banker1(String name, int age, String bankName) {
        this.name = name;
        this.age = age;
        this.bankName = bankName;
    }

    public void banker() {
        System.out.printf("나는 %s이고, 나이는 %d다. 다니는 은행은 %s이다.\n",name,age,bankName);
    };
}
class Programmer1 extends Person{
    String companyName;

    public Programmer1(String name, int age, String companyName) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
    }

    public void programmer() {
        System.out.printf("나는 %s고, 나이는 %d다. 다니는 직장은 %s다.\n",name,age,companyName);
    }
}
