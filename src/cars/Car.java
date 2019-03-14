package cars;

public abstract class Car implements Moveable {
    private IEngine engine;
    private String color;
    private String name;


    public Car(IEngine engine, String color, String name) {
        this.engine = engine;
        this.color = color;
        this.name = name;
    }

    public void start() {
        System.out.println("cars.Car starting");
        if (!engine.isActive()) {
            engine.startStop();
        }
    }

    abstract void open();

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
