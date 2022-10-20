import java.util.*;

public class Main {
    public static void main(String[] args) {
        Air air = new Air(1999,10);


        Person person = new Person("Вася");

        air.up();
        air.setAltitude(300);
        air.up();


        Transport air_tr = new Air(2015,50);
        person.personStart(air_tr);

        air.stop();


        Vehicle vehicle = new Vehicle(2015);
        vehicle.typeOfVehicle();
        vehicle.colorOfVehicle();

        Transport vehicle_tr = new Vehicle(1999);
        person.personStart(vehicle_tr);

        vehicle.stop();

    }
}