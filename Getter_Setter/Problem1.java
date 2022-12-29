package Getter_Setter;

//public class Problem1 {
//    public static void main(String[] args) {
//        RunCat runCat = new RunCat();
//        runCat.name = "야옹"; // < 오류
//        runCat.age = 3; // < 오류
//        runCat.weight = 15; // < 오류
//        RunCat runCat = new RunCat("애옹",3,15);
//        System.out.println(runCat.name); // << 오류
//          생성자 넣으면 어떻게 될지 궁금해서 해봤는데
//          출력이 안되는걸 보니 private 이라 생성자에 값은 들어가는데 적용이 안되는거 같음
//    }
//}
//class RunCat { // 클래스
//    private String name; // private 으로 접근 금지 걸어놓음
//    private int age;
//    private int weight; // 클래스 필드의 인스턴스 변수
//
//    public RunCat(String name, int age, int weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//}
// 이렇게 두면 메인 메소드에서 RunCat 클래스에 접근해 필드 변수의 값을 직접 입력할 수 없음
// 왜? Problem1 클래스와 RunCat 클래스는 서로 다른 클래스니까 private 방어가 걸려버림
// 그럴 때 이용하는게 getter 와 setter 임
// ↓

public class Problem1 {
    public static void main(String[] args) {
        RunCat runCat = new RunCat();
        runCat.setName("야옹");
        runCat.setAge(3);
        runCat.setWeight(15);
        // setter 로 값을 입력할 수 있게됨
        String name = runCat.getName(); // getter 로 RunCat 클래스에 입력된 값을 불러오는 것임
        System.out.println(name);
        int age = runCat.getAge(); // 여기서 메인 메소드의 변수는 넣을 값을 입력 편하게하려고 한 것
        System.out.println(age);
        System.out.println(runCat.getWeight()); // 이렇게 해도 불러와짐
    }
}
class RunCat { // 클래스
    private String name; // private로 접근 금지
    private int age;
    private int weight; // 클래스 필드의 인스턴스 변수

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
//    얘는 setter 마찬가지로 alt + insert 로 쉽게 만들 수 있고
//    setter는 변수명 앞에 set- 붙이면됨
//    얘는 보호된 클래스 변수의 값을 넣어주는 애

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    } // 변수명 앞에 get- 붙으면 getter임
    // 근데 쉽게 alt + insert로 넣어두뎀
    // 여튼 얘는 값을 읽어오는 애
}
// 정리하자면 private 접근 제어자를 가진 클래스 변수에 다른 클래스에서 접근 가능하게 하려고
// set 이 달린 변수를 생성자 만들때 처럼 만들어주고
// 다른 클래스에서 생성한 다음 접근해서 값 넣어주고
// get 이 달린 변수를 이용해서 다른 클래스로 그 값을 불러오는 것임
// private 걸어논 거 수정 가능케 해주는 친구임
// 다른 데다가 막 못쓰게 private 걸어논거 특정한 파일에서는 써야할 때 쓰는 방법인듯