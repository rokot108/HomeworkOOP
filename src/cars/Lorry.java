package cars;

class Lorry extends Car {

    public Lorry(IEngine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    void open() {
        System.out.println("cars.Lorry cabin has opened");
    }

    @Override
    public void move() {
        System.out.println("cars.Lorry is moving");
    }

    @Override
    public void stop() {
        System.out.println("cars.Lorry is stop");
    }
}
