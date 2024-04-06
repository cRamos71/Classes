package edu.ufp.inf.lp2.p05_brigadat;

import java.util.Objects;

public class Vehicle {

    private String registration;
    private String brand;
    private String model;
    private int cilinders;

    public Vehicle() {
    }

    public Vehicle(String registration, String brand, String model, int cilinders) {
        this.registration = registration;
        this.brand = brand;
        this.model = model;
        this.cilinders = cilinders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return cilinders == vehicle.cilinders && Objects.equals(registration, vehicle.registration) && Objects.equals(brand, vehicle.brand) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registration, brand, model, cilinders);
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCilinders() {
        return cilinders;
    }

    public void setCilinders(int cilinders) {
        this.cilinders = cilinders;
    }

    public static void main(String[] args) {

    }
}
