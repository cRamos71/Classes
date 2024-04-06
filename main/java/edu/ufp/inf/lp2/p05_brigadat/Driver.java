package edu.ufp.inf.lp2.p05_brigadat;

import java.util.Objects;

public class Driver {
    private String name;
    private int numPenalties;
    private String driversLicense;
    private boolean isLicenseApprehended;
    private int points;

    public Driver() {
    }

    public void setLicenseApprehended(boolean licenseApprehended) {
        isLicenseApprehended = licenseApprehended;
    }

    public Driver(String name, String driversLicense) {
        this.name = name;
        this.driversLicense = driversLicense;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver driver)) return false;
        return numPenalties == driver.numPenalties && isLicenseApprehended == driver.isLicenseApprehended && points == driver.points && Objects.equals(name, driver.name) && Objects.equals(driversLicense, driver.driversLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numPenalties, driversLicense, isLicenseApprehended, points);
    }

    public String getName() {
        return name;
    }

    public int getNumPenalties() {
        return numPenalties;
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public boolean isLicenseApprehended() {
        return isLicenseApprehended;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int points){
    }

    public static void main(String[] args) {

    }

}
