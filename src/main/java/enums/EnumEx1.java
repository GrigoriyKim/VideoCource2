package enums;

public class EnumEx1 {
    void method(String dayOfWeek){
        System.out.printf("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        EnumEx1 e = new EnumEx1();
        e.method("Monday");
    }
}
