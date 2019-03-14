public class Main {

    public static void main(String[] args) {

        Car lightCar = TransportFactory.getTransport(new GasEngine(),"white","Mercedes",false);

        lightCar.start();
        lightCar.move();
    }
}
