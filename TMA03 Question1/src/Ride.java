import java.util.Objects;
/**
 * Ride is a class that abstracts the common features
 * of rides at a theme park. Rides have a single car that can
 * take a certain number of people in them (their capacity).
 *
 * @author mrlG
 * @version v2
 */

public class Ride
{
    private String name;
    private int carCapacity;
    private boolean operational;

    /**
     * Part a - i
     * This constructor for objects of class Ride
     * initialises its fields (name, carCapacity)
     * and set operational to false
     * @param aName
     * @param aCarCapacity
     */

    public Ride(String aName, int aCarCapacity){
        this.name = aName;
        this.carCapacity = aCarCapacity;
        this.operational = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())){
            Ride ride = (Ride) obj;
            return carCapacity == ride.carCapacity && Objects.equals(name, ride.name);  // without the operational comparison
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.length() + this.carCapacity;
    }

    /**
     * Getter for the ride name.
     * @return The name of the ride
     */
    public String getName()
    {
        return name;
    }

    /**
     * Setter for the ride name.
     * @param aName ride's name
     */
    public void setName(String aName)
    {
        name = aName;
    }

    /**
     * Getter for the ride's car capacity.
     * @return The number of people a car can carry
     */
    public int getCarCapacity()
    {
        return carCapacity;
    }

    /**
     * Setter for the ride's car capacity.
     * @param aCapacity The capacity of a car on this ride
     */
    public void setCarCapacity(int aCapacity)
    {
        carCapacity = aCapacity;
    }

    /**
     * Getter for the operational status of the ride.
     * @return the operational status of the ride
     */
    public boolean isOperational()
    {
        return operational;
    }

    /**
     * Setter for the operational status of this ride.
     * @param rideState true if operational, otherwise false
     */
    public void setOperational(boolean rideState)
    {
        operational = rideState;
    }

    /**
     * Return a String representation of a Ride including
     * its class name, allowing for extension by subclasses.
     * @return the string representation of the ride 
     */
    @Override
    public String toString()
    {
        String outputString = String.format("%s %s has car capacity %d and",
                getClass().getSimpleName(), name, carCapacity);

        if (operational) {
            outputString += " is \nrunning.";
        }
        else {
            outputString += " is \nnot running.";
        }

        return outputString;
    }
}