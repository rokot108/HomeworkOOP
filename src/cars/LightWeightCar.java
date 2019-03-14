package cars;

class LightWeightCar extends Car {

    public LightWeightCar(IEngine engine, String color, String name) {
        super(engine, color, name);
    }

    @Override
    void open() {
        System.out.println("cars.Car is open");
    }

    @Override
    public void move() {
        System.out.println("Light car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Light car  is stop");
    }

}
