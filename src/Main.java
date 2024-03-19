public class Main {
    public static void main(String[] args) {

        Car fer1 = buildFerrari("Rosso");
        Car fer2 = buildFerrari("Giallo");

        System.out.println(fer1);
        System.out.println(fer2);
    }

    public static Car buildFerrari(String color) {
        Engine engine = new Engine(10.0, 120.0);
        Brake brake = new Brake(0.99, 0.01);

        Car car = new Car("Ferrari", color, engine, brake);
        return car;
    }

}