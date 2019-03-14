import cars.Car;
import cars.GasEngine;
import cars.TransportFactory;
import person.Person;
import person.PersonBuilder;

public class Main {

    public static void main(String[] args) {

        Car lightCar = TransportFactory.getTransport(new GasEngine(), "white", "Mercedes", false);

        lightCar.start();
        lightCar.move();

        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setAddress("Moscow").setCountry("Russia").setFirstName("Evgeniy").build();
        System.out.println(person);
    }
}
