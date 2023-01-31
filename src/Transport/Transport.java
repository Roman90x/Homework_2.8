package Transport;

import Transport.Driver.Driver;
import Transport.Mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> {
    private String brand;
    private String model;
    private final T driver;
    public final List<Mechanic> mechanics = new ArrayList<>();


    public Transport(String brand, String model, T driver) {
        this.brand = brand;
        this.model = model;
        this.driver = driver;
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = " Марка ";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && model.isBlank() && model.isEmpty()) {
            this.model = model;
        } else {
            this.model = " Модель ";
        }
    }

    public T getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }


    @Override
    public String toString() {
        return  brand +
                model +
                driver +
                mechanics;
    }
}
