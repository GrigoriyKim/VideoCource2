package nested_classes.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        Math2 math = new Math2();
        math.getResult(21, 4);
    }
}

class Math2{
    public Math2() {
    }

    public void getResult(final int delimoe, final int delitel){
        class Delenie{
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delitel);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}