public class bluetooth {
    public static void main(String[] args) {
        /*TotalMic b1 = new TotalMic(); // 자식 클래스 객체 생성 BluetoothMIC
        b1.connect();
        b1.music();     // 객체가 생성되면 음악이 나온다.
        b1.sing();      // 객체가 생성되면 노래를 부른다.*/

        System.out.println("마이크 객체연결");
        TotalMic tm = new TotalMic();
        tm.connect();
        tm.music();
        tm.sing();

        System.out.println("토탈마이크 객체를 Bluetooth 타입변환");
        Bluetooth bm = tm;
        bm.connect();
        bm.music();
        bm.sing();

        Microphone bm = tm;
        bm.sing();

    }
}
interface Microphone{
    abstract void sing();
}
interface Speaker1{
    abstract void music();
}
/*class BluetoothMIC implements Microphone, Speaker1 {

    @Override
    public void sing() {
        System.out.println("마이크에 대고 노래를 부릅니다.");
    }

    @Override
    public void music() {
        System.out.println("마이크에 장착 된 스피커로 반주가 나옵니다.");
    }
}*/
interface Bluetooth extends Microphone, Speaker1 {
    abstract void connect(); //연결
}
class TotalMic implements Bluetooth {

    @Override
    public void sing() {
        System.out.println("마이크에 대고 노래를 부릅니다.");
    }

    @Override
    public void music() {
        System.out.println("마이크에 장착 된 스피커로 반주가 나옵니다.");
    }

    @Override
    public void connect() {
        System.out.println("핸드폰과 연결되었습니다.");
    }
}
