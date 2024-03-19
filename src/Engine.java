public class Engine {
    private double acceleration;
    private double maxSpeed;

    public Engine(double acceleration, double maxSpeed) {
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "acceleration=" + acceleration +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
