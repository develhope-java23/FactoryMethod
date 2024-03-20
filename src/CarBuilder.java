import java.util.Optional;

public class CarBuilder {
    private Optional<String> name;
    private Optional<String> color;
    private Optional<Engine> engine;
    private Optional<Brake> brake;

    public CarBuilder name(String name) {
        this.name = Optional.of(name);
        return this;
    }

    public CarBuilder color(String color) {
        this.color = Optional.of(color);
        return this;
    }

    public CarBuilder engine(Engine engine) {
        this.engine = Optional.of(engine);
        return this;
    }

    public CarBuilder brake(Brake brake) {
        this.brake = Optional.of(brake);
        return this;
    }

    public Car build() {
        return new Car(
                name.orElse("Ciccio"),
                color.orElse("White"),
                engine.orElseThrow(() -> new RuntimeException("Engine as to be setted")),
                brake.orElseThrow(() -> new RuntimeException("Brake as to be setted"))
        );
    }

    CarBuilder() {
        this.name = Optional.empty();
        this.color = Optional.empty();
        this.engine = Optional.empty();
        this.brake = Optional.empty();
    }
}
