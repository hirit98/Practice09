package kr.hirit98.practice09;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // 내부 클래스 ( inner class )
    // 클래스 안에 만들어진 클래스
    // GUI 어플리케이션 (Swing, AWT) 이벤트 처리에 많이 사용됨.

    // 내부 클래스의 종류는 변수의 선언 위치에 따른 종류와 동일

    //private int a; // 객체 생성시 함께 생성됨.
    //private static int b; // 프로그램이 이 코드를 읽을 때 생성됨.

    //class Inner { // 멤버 - 객체 생성 되어야지 선언
    //    private int i = a;
    //}
    // private Inner myInner = new Inner();

    //static class StaticInner { // Main 클래스가 생성되지 않아도 생성될 수 있다.
    //    private int s = b;
    //}

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        try{
            sc.nextInt();
        }catch (Exception e){
            System.out.println("숫자만을 입력하세요.");
        } finally {
            // try - catch 블록이 종료 된 이후 실행.
        }
*/
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // 0<=x <3 = 0,1,2

        try {
            Type com = Type.indexOf(1);
            System.out.println("0. 가위");
            System.out.println("1. 바위");
            System.out.println("2. 보");
            System.out.print("입력: ");
            int input = sc.nextInt();
            Type user = Type.indexOf(input);

            System.out.println("컴퓨터: " + com.getKor());
            System.out.println("나: " + user.getKor());

            if(com==user) System.out.println("비겼습니다.");
            else if(user.isWinner(com)) System.out.println("이겼습니다.");
            else System.out.println("졌습니다.");

        }catch (TypeNotFoundException e){
            System.out.println("가위 바위 보 중에 하나만 입력하세요.");
        }catch (InputMismatchException e){
            System.out.println("숫자만 입력하세요.");
        }

        //  Main.b = 10;
        // new Main().new Inner();

    }
}