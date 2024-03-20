public class Main {
    public static void main(String[] args) {

        Vehicle fer1 = buildFerrari("Rosso", true);
        Vehicle fer2 = buildFerrari("Giallo", false);

        System.out.println(fer1);
        System.out.println(fer2);
    }

    public static Vehicle buildFerrari(String color, boolean shouldFly) {
        Engine engine = new Engine(10.0, 120.0);
        Brake brake = new Brake(0.99, 0.01);
        if (shouldFly) {
            return new SpaceShip("Ferrari", color, engine, brake);
        } else {
            return new Car("Ferrari", color, engine, brake);
        }
    }
}