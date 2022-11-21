package nested_classes.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;

    }

    void method() {
        Car.Engine e = new Car.Engine(200);
        System.out.println(e.horsePower);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        int horsePower;


        public Engine(int horsePower) {
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

class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(100);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
        Car.Engine engine3 = new Car ("yellow", 4).new Engine(300);

//        Car.Engine engine2 = new car.Engine(100);

    }
}