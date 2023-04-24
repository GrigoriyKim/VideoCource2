package lyambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("privet"));
//        System.out.println(i.abc());
    }

    public static void main(String[] args) {
//        int i = 10; // peremennaya ne doljna izmenyat`sa (effectively final)
        final int i = 10; // ili peremennaya doljna bit final (final)
        def((String s) -> {
            int a = 15; // vne tela lyambda virajeniya ona ne vidna
            System.out.println(i);
            return s.length() + i;});
//        i = 15; // oshibka tak kak izmenyat nelzya
//        def(() -> 18);
//        System.out.println(a); // vne tela lyambda virajeniya ona ne vidna
    }
}

interface I {
    int abc(String s);
//    int abc();
}