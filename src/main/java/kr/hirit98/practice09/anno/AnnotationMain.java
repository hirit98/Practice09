package kr.hirit98.practice09.anno;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationMain {

    public static int total(int... x) {
        int t=0;
        for(int i : x){
            t += i;
        }
        return t;
    }
    public static void main(String[] args) {

       /* Test test = new Test();
        // reflection ( 리플렉션 )
        Method[] methods = Test.class.getMethods();

        for(Method method : methods){
            // Optional#isPresent() - ~가 있는 경우 ??
            if(method.isAnnotationPresent(TestAnnotation.class)){
                // 함수는 기본적으로 첫 번째 인자로 클래스 자기자신을 받는다.
                try {
                    method.invoke(test);
                }catch (IllegalAccessException e){
                    throw new RuntimeException(e);
                }catch (InvocationTargetException e){
                    throw new RuntimeException(e);
                }
            }
        }*/

        // variable argument [가변인자]
        // 가변인자는 반드시 매개변수의 가장 끝에 위치 해야한다.
        // System.out.println(total(10, 20, 30, 40, 50, 60));
        try {
            for(Method method : Test.class.getMethods()){
                if(method.getName().equals("test1")){
                    method.invoke(new Test(),10,"ads",1.5);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
