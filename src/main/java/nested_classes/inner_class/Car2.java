package nested_classes.inner_class;

public class Car2 {
    String color;
    int doorCount;
    Engine engine;
//    private static int a;

    public Car2(String color, int doorCount) {
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car2: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        private int horsePower;
//        public static int a = 5; // vrode kak v inner classe nelzya sozdat static peremennuyu
//        public final static int A = 5; // a final static (konstantu) mojno

        public Engine(int horsePower) {
            System.out.println(doorCount); // mojev vivesti daje esli peremennaya budet static
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test1{
    public static void main(String[] args) {
        Car2 car = new Car2("black", 4);
        Car2.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);

        Car2.Engine engine3 = new Car2("yellow", 4).new Engine(200); // no tak sozdaetsa tolko motor - mashina teryaetsa
        System.out.println(engine3);
//        Car2.Engine engine2 = new Car2.Engine(150); // ne pravilnoe sozdanie
//        Car2.Engine engine2 = new car.Engine(150); // ne pravilnoe sozdanie
    }
}

