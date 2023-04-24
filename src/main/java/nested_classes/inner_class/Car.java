package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
//    private static int a;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower); // motor sozdaem tut
    }
//    void method(){
//        System.out.println(Car.Engine.countOfObjects);
//        Car.Engine e = new Car.Engine(200);
//        System.out.println(e.horsePower); // tak mi mojem obratitsa k privat peremennim
//    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public class Engine{
        private int horsePower;
//        static int countOfObjects; // pozvolyaet schitat` skolko shtuk motorov mi sozdali

        public Engine(int horsePower) {
//            System.out.println(a); // k static peremennoy mi mojem obratitsa daje esli ona private
//            System.out.println(doorCount); // a k non-static peremennoy net
            this.horsePower = horsePower;
//            countOfObjects++;
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
//        Car.Engine engine = new Car.Engine(256); // tak kak Car not-static(inner class) tak sozdavat nelzya
        Car car = new Car("black", 4, 300);
        System.out.println(car);
    }
}
