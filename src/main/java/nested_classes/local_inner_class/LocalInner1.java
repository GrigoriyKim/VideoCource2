package nested_classes.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math{
    private int a = 10;
    public Math() {
    }

    public void getResult(){
        int delimoe = 21; // peremennaya doljna bit libo final libo ne doljna menyatsa
        class Delenie{
//            private int delimoe;
            private int delitel;

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }
            public int getChastnoe(){
                return delimoe/delitel;
            }
            public int getOstatok(){
                System.out.println(a);
                return delimoe%delitel;
            }
        }

        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
        delenie.setDelitel(4);
//        System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delenie.getDelitel());
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}