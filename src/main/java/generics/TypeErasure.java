package generics;

import java.util.ArrayList;

public class TypeErasure {
    public static void main(String[] args) {

    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class GenMethod1{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}

class Parent{
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}

//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}