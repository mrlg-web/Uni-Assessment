import java.util.Objects;

/**
 * RollerCoaster extends Ride
 *
 * @author mrlG
 * @version v2
 */

public class RollerCoaster extends Ride {
    private int numberOfCars;

    public RollerCoaster(String aName, int aCarCapacity, int aNumberOfCars) {
        super(aName, aCarCapacity);
        this.numberOfCars = aNumberOfCars;
    }

    public int getCapacity() {   // casting method
        return super.getCarCapacity() * numberOfCars;
    }

    /**
     * Part b - iv
     * toString method which overrides the one in Ride and returns
     * in addition to the superclass description of the ride
     * the total capacity of the ride.
     */
    @Override
    public String toString() {
        return super.toString() + "\nThe total capacity of the ride is " +
                this.getCapacity() + ".";
    }

    /**
     * Part b - v
     * equals method which overrides equals in Ride and return true if
     * the ride name and capacity are the same.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RollerCoaster) {
            RollerCoaster rollerCoaster = (RollerCoaster) obj;
            if (getName().equals(rollerCoaster.getName()) &&
                    this.getCapacity() == rollerCoaster.getCapacity()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
       return Objects.hash(getName(), getCapacity());  // How getName obtains the name from the class Ride
    }
}
