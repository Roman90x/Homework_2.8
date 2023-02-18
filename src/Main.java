
import Transport.Bus.Bus;
import Transport.Car.Car;
import Transport.Driver.Driver;
import Transport.Driver.DriverB;
import Transport.Driver.DriverC;
import Transport.Driver.DriverD;
import Transport.Mechanic.Mechanic;
import Transport.Mechanic.TypeTransport;
import Transport.Transport;
import Transport.Truck.Truck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Коллекции. Часть 2. Хеш и хеш-функции, множества.");
        System.out.println("");

        Car audi = new Car(" AUDI ", " A8 50 L TDI quattro ",
                new DriverB(" Водитель легкового автомобиля ", true, -10));
        Car bmw = new Car(" BMW ", " Z8 ",
                new DriverB(" Водитель легкового автомобиля ", true, -10));

        Truck scania = new Truck(" Scania ", " R520 ",
                new DriverC(" Водитель грузового автомобиля ", true, 25));
        Truck volvo = new Truck(" Volvo ", " FM13 ",
                new DriverC(" Водитель грузового автомобиля ", true, 25));

        Bus higer = new Bus(" Higer ", " KLQ6128LQ ",
                new DriverD(" Водитель автобуса ", true, 0));
        Bus mersedes = new Bus(" Mercedes-Benz ", " Sprinter ",
                new DriverD(" Водитель автобуса ", true, 0));

        DriverB driverB = new DriverB(" Водитель легкового автомобиля ", true, -10);
        DriverC driverC = new DriverC(" Водитель грузового автомобиля ", true, 25);
        DriverD driverD = new DriverD(" Водитель автобуса ", true, 0);
        DriverD driverE = new DriverD(" Водитель автобуса ", true, 0);
        DriverD driverF = new DriverD(" Водитель автобуса ", true, 0);

        List<Driver> drivers = new ArrayList<>();
        drivers.add(driverB);
        drivers.add(driverC);
        drivers.add(driverD);
        drivers.add(driverE);
        drivers.add(driverF);

        Set<Driver> driverSet = new HashSet<>(drivers);
        System.out.println(driverSet);
    }


}