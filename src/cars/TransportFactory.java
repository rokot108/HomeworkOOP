package cars;

public class TransportFactory {

    static public Car getTransport(IEngine engine, String color, String name, boolean isHeavy) {
        if (isHeavy) {
            return new Lorry(engine, color, name);
        }
        return new LightWeightCar(engine, color, name);
    }

}
