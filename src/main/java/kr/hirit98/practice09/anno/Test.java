package kr.hirit98.practice09.anno;

public class Test {

    @TestAnnotation()
    public void test1(int x,String s, double d){
        System.out.println("x: "+ x );
        System.out.println("s: "+ s );
        System.out.println("d: "+ d );
    }

    @TestAnnotation()
    public void test2(){
        System.out.println("test2 call");
    }

    public  void test3(){
        System.out.println("test3 call");
    }


}
