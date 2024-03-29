public class Car implements Vehicle {
    private String name;
    private String color;
    private double speed;
    private Engine engine;
    private Brake brake;

    public Car(String name, String color, Engine engine, Brake brake) {
        this.name = name;
        this.color = color;
        this.speed = 0;
        this.engine = engine;
        this.brake = brake;
    }

    @Override
    public void accelerate() {
        speed = speed + engine.getAcceleration();
        if (speed > engine.getMaxSpeed()) {
            speed = engine.getMaxSpeed();
        }
    }

    @Override
    public void decelerate() {
        if (brake.getIntegrity() < 0) {
            throw new BrokenBrakeException();
        }
        speed = speed - brake.getStrength();
        brake.updateIntegrity();

        if (speed < 0.0) {
            speed = 0;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", engine=" + engine +
                ", brake=" + brake +
                '}';
    }
}
