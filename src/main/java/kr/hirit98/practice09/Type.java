package kr.hirit98.practice09;

import java.util.Arrays;
import java.util.Optional;

public enum Type {
    SCISSOR(0, "가위"),
    ROCK(1, "바위"),
    PAPER(2, "보");

    private int index;
    private String kor;

    Type(int index, String kor){
        this.index=index;
        this.kor=kor;
    }

    public String getKor(){ return kor; }
    public boolean isWinner(Type other){
        switch (other){
            case SCISSOR:
                return this == ROCK;
            case ROCK:
                return this == PAPER;
            case PAPER:
                return this == SCISSOR;

        }
        return false;
    }

    public static Type indexOf(int index) throws TypeNotFoundException{
    Optional<Type> o = Arrays.stream(Type.values()).filter((i)-> index == i.index).findFirst();
         // [SCISSOR, ROCK, PAPER]
       if(o.isPresent()){
           // 있다
           return o.get();
       }else{
           // 없다
           throw new TypeNotFoundException();
       }
    }
}
