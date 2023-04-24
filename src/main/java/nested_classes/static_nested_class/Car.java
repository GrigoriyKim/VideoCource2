package nested_classes.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method(){
        System.out.println(Engine.countOfObjects);
        Engine e = new Engine(200);
        System.out.println(e.horsePower); // tak mi mojem obratitsa k privat peremennim
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public static class Engine{
        private int horsePower;
        static int countOfObjects; // pozvolyaet schitat` skolko shtuk motorov mi sozdali

        public Engine(int horsePower) {
            System.out.println(a); // k static peremennoy mi mojem obratitsa daje esli ona private
//            System.out.println(doorCount); // a k non-static peremennoy net
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 2, engine);
        System.out.println(car);
//        Car.Engine engine2 = new car.Engine(150); // ne dopustimo sozdanie motora takim obrazom
    }
}

// mi mojem nasledovat vnutrennie classi
class Z extends Car.Engine{
    Z(){
        super(150);
    }
}