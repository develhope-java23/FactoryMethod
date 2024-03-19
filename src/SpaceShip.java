public class SpaceShip implements Vehicle{

    private String name;

    private String color;

    private double speed;

    private Brake brake;

    private Engine engine;

    public SpaceShip(String name, String color, Engine engine, Brake brake) {
        this.name = name;
        this.speed = 0;
        this.color = color;
        this.brake = brake;
        this.engine = engine;
    }

    @Override
    public void accelerate() {
      speed = speed + engine.getAcceleration() * engine.getAcceleration();
        if (speed > engine.getMaxSpeed()) {
            speed = engine.getMaxSpeed();
        }
    }

    @Override
    public void decelerate() {
        if (brake.getIntegrity() < 0) {
            throw new BrokenBrakeException();
        }
        speed = speed - Math.sqrt(brake.getStrength());
        if (speed < 0.0) {
            speed = 0;
        }
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", brake=" + brake +
                ", engine=" + engine +
                '}';
    }
}
