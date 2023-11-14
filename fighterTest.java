public class fighterTest {
    public static void main(String[] args) {
        // 인터페이스 다형성 가능하다.
        Fighter f = new Fighter(); // 의존하는 클래스를 객체로 생성.
        f.move(100,200);
        Unit2 f2 = new Fighter();

        // f2.attack(); 형변환이 다르기 때문에 사용할수 없다.

        Fightable f3 = new Fighter();
        f3.attack(new Fighter());
        // f3.x; 자식 클래스로 생성을 했지만 인터페이스 형변환만 사용하니까

        // System.out.println(f.getFightable());
        Fightable rf = f.getFightable();    // 자식 클래스 메서드 부모 인터페이스 형변환 리턴 출력

    }
}

// 클래스 Unit2 : 추상클래스 abstract 메서드
abstract class Unit2{
    int x,y;
    abstract void move (int x, int y); // 추상 메서드
    void stop(){
        System.out.println("멈춘다.");
    }
}
// 클래스 interface : Fightable
interface Fightable {
    // move 추상메서드
    public void move(int x, int y);
    // attack 추상메서드
    public void attack(Fightable f);
}
// 클래스 Fighter : extends Unit2(추상클래스) implements Fightable
class Fighter extends Unit2 implements Fightable{
    public void move(int x, int y){
        System.out.println("["+x+","+y+"]로 이동");
    }
    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    }

    // 인터페이스 리턴 : 형변환으로 가능.
    //Fightable f = new Fighter();
    Fightable getFightable(){
        // 자식이 하나이기때문에 구현함.
        Fighter f = new Fighter();
        return f;
    }
}