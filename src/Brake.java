public class Brake {
    private double integrity;
    private double durability;
    private double strength;

    public Brake(double durability, double strength) {
        this.integrity = 1.0;
        this.durability = durability;
        this.strength = strength;
    }

    public double getIntegrity() {
        return integrity;
    }

    public double getDurability() {
        return durability;
    }

    public double getStrength() {
        return strength;
    }

    public void updateIntegrity() {
        integrity = integrity - (1 - durability);
    }

    @Override
    public String toString() {
        return "Brake{" +
                "integrity=" + integrity +
                ", durability=" + durability +
                ", strength=" + strength +
                '}';
    }
}
