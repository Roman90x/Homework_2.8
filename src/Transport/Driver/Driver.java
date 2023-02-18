package Transport.Driver;

import java.util.Objects;

public abstract class Driver {

    private String fullName;
    private boolean driverLicense;
    private int experience;

    public Driver(String fullName, boolean driverLicense, int experience) {
        this.fullName = fullName;
        if (experience == 0) {
            this.driverLicense = false;
        } else {
            this.driverLicense = driverLicense;
        }
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = Math.abs(experience);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isBlank() && !fullName.isEmpty()) {
            this.fullName = fullName;
        } else {
            this.fullName = " Имя Фамилия ";
        }
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return isDriverLicense() == driver.isDriverLicense() && getExperience() == driver.getExperience() && getFullName().equals(driver.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName(), isDriverLicense(), getExperience());
    }
}
