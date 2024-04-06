package edu.ufp.inf.lp2.p05_brigadat;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.util.Objects;

public class PenaltyFee implements Offense{

    private String motive;
    private String local;
    private Date date;
    private Driver driver;
    private Vehicle vehicle;
    public static final float MIN_VALUE = 1.0f;
    public static final int MIN_PUNISHMENT = 1;

    public PenaltyFee() {
    }

    public PenaltyFee(String motive, String local, Date date, Driver driver, Vehicle vehicle) {
        this.motive = motive;
        this.local = local;
        this.date = date;
        this.driver = driver;
        this.vehicle = vehicle;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PenaltyFee that)) return false;
        return Objects.equals(motive, that.motive) && Objects.equals(local, that.local) && Objects.equals(date, that.date) && Objects.equals(driver, that.driver) && Objects.equals(vehicle, that.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(motive, local, date, driver, vehicle);
    }

    @Override
    public float value() {
        return PenaltyFee.MIN_VALUE;
    }

    @Override
    public int punishment() {
        return PenaltyFee.MIN_PUNISHMENT;
    }


    public static void main(String[] args) {

    }
}
