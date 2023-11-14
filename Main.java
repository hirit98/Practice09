class Speaker{
    String getName(){
        return "스피커";
    }
};
class RedSpeaker extends Speaker{
    String getName(){
        return "빨간스피커";
    }
};
class BlueSpeaker extends Speaker{
    String getName(){
        return "파란스피커";
    }
};

class Person{
    //객체 변수
    Speaker speaker;
    //기본 생성자
    Person(Speaker speaker) {
        this.speaker = speaker;
    }
    //출력문 메서드 - 색깔 스피커가 켜졌습니다.
    void turnOn(){
        System.out.println(speaker.getName()+"이 켜졌습니다.");
    }
}
public class Main {
    public static void main(String[] args) {
        Speaker s1 = new RedSpeaker();
        Person p1 = new Person(s1);
        p1.turnOn();

        Speaker s2 = new BlueSpeaker();
        Person p2 = new Person(s2);
        p2.turnOn();

    }
}
/*
* @추상클래스
* 일반 클래스와 동일하다 -> 추상메서드를 정의해서 사용한다
* 추상 메서드를 추상클래스에서 선언하면 무조건 자식메서드에서 오버라이딩 해야한다.
* 추상 클래스 : 추상 메서드가 항상 존재한다 (X)
*     abstract  멤버변수와 생성자를 사용할 수 있다(O)
*               추상메서드선언부에 선언했다.
*               추상 클래스를 상속받는 클래스는 무조건 오버라이딩 한다(O)
*
* @인터페이스
* 추상 메서드랑 상수만 선언할수있다.
* 인터페이스는 클래스가 아니고, 스스로 객체를 생성 할 수 없다.
* 어떤 형태로도 객체를 만들수 없기 때문에 클래스라고 부를수 없다.
* 인터페이스는 필드와 생성자를 가질수 없고 오직 추상메서드와 상수만 포함.
* interface 인터페이스이름() {
*       public static final 타입 상수이름  = 값;
*       public abstract 메서드이름(메개변수목록);
* 1) 추상 메서드 집합이라서 추상 클래스보다 추상화가 높다
* 2) 인터페이스 모든 멤버는 public 이다.
*    public static final -> 명시 안해도 자동으로 인식한다.(자동적 컴파일)
*
* @인터페이스 구현/다형성 사용방법
*
* */

