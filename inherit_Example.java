public class inherit_Example {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.name = "제임스";
        p.age = 32;
        p.companyName = "나이버";
        p.programmer();
        p.eat();
        p.sleep();
        p.shit();

        Banker b = new Banker();
        b.name = "란란루";
        b.age = 28;
        b.bankName = "우리은행";
        b.banker();
        b.eat();
        b.sleep();
        b.shit();
    }
}
class Person { // 상위 클래스
    String name;
    int age; // 필드, 인스턴스 변수

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
class Banker extends Person{ // 하위 클래스
    String bankName;

    public void banker() {
        System.out.printf("나는 %s이고, 나이는 %d다. 다니는 은행은 %s이다.\n",name,age,bankName);
    };
}
class Programmer extends Person{
    String companyName;

    public void programmer() {
        System.out.printf("나는 %s고, 나이는 %d다. 다니는 직장은 %s다.\n",name,age,companyName);
    }
}
