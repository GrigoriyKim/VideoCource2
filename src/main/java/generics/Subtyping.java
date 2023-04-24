package generics;

import java.util.ArrayList;

public class Subtyping {
    public static void main(String[] args) {

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer i1 = info2.getValue();

        Info<Double> info21 = new Info<>(3.14);
        System.out.println(info21);
        Double d1 = info21.getValue();
    }

}

//class Info1<T extends Number> {
    class Info1<T extends Number&I1&I2> {
    private T value;
    public Info1(T value){
        this.value = value;
    }
    public String toString(){
        return "{[" + value + "]}";
    }
    public T getValue(){
        return value;
    }
}

class GenMethod3{
    public static <T extends Number> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}

interface I1{}
interface I2{}